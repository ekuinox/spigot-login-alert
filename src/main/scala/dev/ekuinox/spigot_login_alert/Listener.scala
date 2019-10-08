package dev.ekuinox.spigot_login_alert

import org.bukkit.event.EventHandler
import org.bukkit.event.{Listener => EventListener}
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.event.player.PlayerQuitEvent
import scalaj.http._
import scala.util.parsing.json._

class Listener(val webhookUri: String) extends EventListener {

  private def request(data: String): HttpRequest = Http(webhookUri).header("content-type", "application/json").postData(data)

  private def request(data: Map[String, String]): HttpRequest = request(JSONObject(data).toString())

  @EventHandler def onPlayerJoin(event: PlayerJoinEvent): Unit = request(Map("content" -> s"${event.getPlayer.getDisplayName} joined")).asParams

  @EventHandler def onPlayerQuit(event: PlayerQuitEvent): Unit = request(Map("content" -> s"${event.getPlayer.getDisplayName} left")).asParams
}
