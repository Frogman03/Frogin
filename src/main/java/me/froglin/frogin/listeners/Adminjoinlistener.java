package me.froglin.frogin.listeners;

import me.froglin.frogin.Frogin;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class Adminjoinlistener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {

        Player player = event.getPlayer();

        if (player.hasPermission("Frogin.Adminjoinlistener")) {
            event.setJoinMessage(ChatColor.YELLOW + player.getDisplayName() + " Has returned!");

            if (event.getPlayer().getUniqueId().equals("530ee96d-1aae-4191-8610-b781c866a6a6"));
            event.setJoinMessage(ChatColor.YELLOW + player.getDisplayName() + " Has clocked in.");

        }else {

            if(player.hasPlayedBefore()){
                event.setJoinMessage(ChatColor.YELLOW + player.getDisplayName() + " has returned to the server.");

             if(!(player.hasPlayedBefore())){
                 event.setJoinMessage(ChatColor.YELLOW + player.getDisplayName() + " has joined for the first ever time.");
                }
            }

            }

        }

        @EventHandler
        public void onLeave(PlayerQuitEvent event){

        Player p = event.getPlayer();

        if(p.hasPermission("Frogin.Adminjoinlistener")){
            event.setQuitMessage(ChatColor.YELLOW + p.getDisplayName() + " Has left, Wish them well!");

            if (event.getPlayer().getUniqueId().equals("530ee96d-1aae-4191-8610-b781c866a6a6"));
            event.setQuitMessage(ChatColor.YELLOW + p.getDisplayName() + " Has left the office");

        }else {
            if (!(p.hasPermission("Frogin.Adminjoinlistener"))){
                event.setQuitMessage(ChatColor.YELLOW + p.getDisplayName() + " Has left the server, Wish them well!");
            }
        }

        }

    }

