package com.meowee.easymc

import org.bukkit.plugin.java.JavaPlugin

class EasyMc : JavaPlugin() {
    override fun onEnable() {
        // Plugin startup logic
        server.pluginManager.registerEvents(Listenerr(), this)

    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
