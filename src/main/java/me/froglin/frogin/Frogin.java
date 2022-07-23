package me.froglin.frogin;

import me.froglin.frogin.commands.*;
import me.froglin.frogin.listeners.Adminjoinlistener;
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

            //config.yml
            getConfig().options().copyDefaults();
            saveDefaultConfig();


        getServer().getPluginManager().registerEvents(new Adminjoinlistener(), this);
        getCommand("god").setExecutor(new GodCommand());
        getCommand("version").setExecutor(new VersionCommand());
        getCommand("credit").setExecutor(new CreditCommand());
        getCommand("website").setExecutor(new GitrepoCommand());
        getCommand("Adminhello").setExecutor(new AdminonlyCommand());
        getCommand("About").setExecutor(new AboutCommand());
        getCommand("hm").setExecutor(new hmCommand());
        getCommand("fkill").setExecutor(new fkillCommand());
        getCommand("setspawn").setExecutor(new setspawnCommand(this));
        getCommand("spawn").setExecutor(new SpawnCommand(this));
        getCommand("fly").setExecutor(new flyCommand());
        getCommand("bangui").setExecutor(new BanGUICommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic

        System.out.println("Goodbye Console and Frog!");

    }


}
