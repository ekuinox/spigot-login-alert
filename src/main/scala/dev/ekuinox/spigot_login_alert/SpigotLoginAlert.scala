package dev.ekuinox.spigot_login_alert

import org.bukkit.plugin.java.JavaPlugin

class SpigotLoginAlert extends JavaPlugin {
  override def onEnable(): Unit = {
    super.onEnable()
    saveDefaultConfig
    val webhookUri = getConfig.getString("webhook-uri")
    if (webhookUri != null) {
      getServer.getPluginManager.registerEvents(new Listener(webhookUri), this)
    }
  }

  override def onDisable(): Unit = {
    super.onDisable()
  }
}
