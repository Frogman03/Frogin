package me.froglin.frogin;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class Frogin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        System.out.println("Hello Console and frog! All is well.");

        getServer().getPluginManager().registerEvents(new JoinLeavelistener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

        System.out.println("Goodbye Console and Frog!");

    }

}
