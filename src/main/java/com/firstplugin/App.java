package com.firstplugin;
import org.bukkit.plugin.java.JavaPlugin;
public class App extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("Hello, Frog!");
    }
    @Override
    public void onDisable() {
        getLogger().info("Bye Bye Froggie!");
    }
}