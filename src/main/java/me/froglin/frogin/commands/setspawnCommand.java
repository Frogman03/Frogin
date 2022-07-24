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

        if (sender instanceof Player player) {

            Location location = player.getLocation();

            if (player.hasPermission("Frogin.setspawnCommand")) {


                //Saves location object directly
                plugin.getConfig().set("spawn", location);

                plugin.saveConfig();

                player.sendMessage(ChatColor.GREEN + "Spawn location has been set!");



            } else {

                player.sendMessage(ChatColor.RED + "You do not have the permission to run this command");

            }

            return true;

        }else {
            System.out.println("You cant set the spawn of the thing you aint in.");
        }


        return true;
    }
}