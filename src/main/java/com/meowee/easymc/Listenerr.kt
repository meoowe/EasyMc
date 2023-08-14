package com.meowee.easymc

import org.bukkit.ChatColor
import org.bukkit.Material
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.entity.EntityDamageEvent
import org.bukkit.event.player.PlayerBedLeaveEvent
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.inventory.ItemStack

class Listenerr : Listener {
    @EventHandler
    fun greetAndFood(event: PlayerJoinEvent) {
        val p = event.player
        val greet = (ChatColor.GREEN.toString() + "Hello, " + ChatColor.BOLD + p.name + "!")
        p.sendMessage(greet)
        val food = ChatColor.LIGHT_PURPLE.toString() + "Here's some food and a bed"
        p.sendMessage(food)
        p.inventory.addItem(ItemStack(Material.CARROT, 128))
        p.inventory.addItem(ItemStack(Material.RED_BED, 1))
        val armor = ChatColor.LIGHT_PURPLE.toString() + "Here, have some armor too."
        p.sendMessage(armor)
        p.inventory.helmet = ItemStack(Material.NETHERITE_HELMET, 1)
        p.inventory.chestplate = ItemStack(Material.NETHERITE_CHESTPLATE, 1)
        p.inventory.leggings = ItemStack(Material.NETHERITE_LEGGINGS, 1)
        p.inventory.boots = ItemStack(Material.NETHERITE_BOOTS, 1)
    }
    @EventHandler
    fun goodMorning(event: PlayerBedLeaveEvent) {
        val p = event.player
        val message = (ChatColor.AQUA.toString() + "Good morning," + ChatColor.BOLD + p.name + "!")
        p.sendMessage(message)
    }
    }

