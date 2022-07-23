package me.froglin.frogin;

import me.froglin.frogin.commands.*;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;
import sun.java2d.opengl.WGLSurfaceData;

public final class Frogin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        System.out.println("Hello Console and frog! All is well.");

        getServer().getPluginManager().registerEvents(new JoinLeavelistener(), this);
        getCommand("god").setExecutor(new GodCommand());
        getCommand("version").setExecutor(new VersionCommand());
        getCommand("credit").setExecutor(new CreditCommand());
        getCommand("website").setExecutor(new GitrepoCommand());
        getCommand("Adminhello").setExecutor(new AdminonlyCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

        System.out.println("Goodbye Console and Frog!");

    }


}
