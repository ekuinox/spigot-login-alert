package dev.ekuinox.spigot_login_alert

import org.bukkit.plugin.java.JavaPlugin

class SpigotLoginAlert extends JavaPlugin {
  override def onEnable(): Unit = {
    super.onEnable()
    getLogger.info("onEnable")
  }

  override def onDisable(): Unit = {
    super.onDisable()
    getLogger.info("onDisable")
  }
}
