package me.froglin.frogin;

import net.md_5.bungee.chat.SelectorComponentSerializer;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class JoinLeavelistener implements Listener {

    @EventHandler
    public void onLeave(PlayerQuitEvent event){

        Player player = event.getPlayer();

        event.setQuitMessage(ChatColor.YELLOW + player.getDisplayName() + " has left the game, Let's hope they enjoyed!");
    }

    @EventHandler
    public void  onPlayerJoin(PlayerJoinEvent event) {

        Player player = event.getPlayer();

        if (player.hasPlayedBefore()){
            event.setJoinMessage(ChatColor.YELLOW + player.getDisplayName() + " has returned to the server.");
    }else{

           event.setJoinMessage(ChatColor.YELLOW + player.getDisplayName() + " has joined for the first ever time.");

        }


    }
}
