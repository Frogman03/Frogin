package me.froglin.frogin.commands;

import me.froglin.frogin.Frogin;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class setspawnCommand implements CommandExecutor {

    private final Frogin plugin;

    public setspawnCommand(Frogin plugin) {
        this.plugin = plugin;

    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;

            Location location = player.getLocation();

            if (player.hasPermission("Frogin.setspawnCommand")) {


                //Saves location object directly
                plugin.getConfig().set("spawn", location);

                plugin.saveConfig();

                player.sendMessage("Spawn location has been set!");

                if (!(sender instanceof Player))
                    System.out.println("The console cant set a spawn location because its not even in a location Silly!");


            } else {

                player.sendMessage(ChatColor.RED + "You do not have the permission to run this command");

            }

            return true;

        }


        return false;
    }
}