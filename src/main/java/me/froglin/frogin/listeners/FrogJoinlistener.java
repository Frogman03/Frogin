package me.froglin.frogin.listeners;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class FrogJoinlistener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){

        Player player = event.getPlayer();

        if (event.getPlayer().getUniqueId().equals("530ee96d-1aae-4191-8610-b781c866a6a6"));
        event.setJoinMessage(ChatColor.YELLOW + player.getDisplayName() + " Has clocked in.");




    }

    @EventHandler
    public void onLeave(PlayerQuitEvent event){

        Player p = event.getPlayer();

        if (event.getPlayer().getUniqueId().equals("530ee96d-1aae-4191-8610-b781c866a6a6"));
        event.setQuitMessage(ChatColor.YELLOW + p.getDisplayName() + " Has left the office here.");


    }


}

