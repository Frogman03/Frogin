package me.froglin.frogin.commands;

import me.froglin.frogin.Frogin;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SpawnCommand implements CommandExecutor {

    private final Frogin plugin;

    public SpawnCommand(Frogin plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {

            Player player = (Player) sender;

            Location location = plugin.getConfig().getLocation("spawn");

            if (location != null) {

                player.teleport(location);

                player.sendMessage(ChatColor.GRAY + "You have been teleported to spawn!");

            } else {

                if (!(player.hasPermission("Frogin.SpawnCommand"))) {
                    player.sendMessage(ChatColor.RED + "You do not have the permissions to do this.");
                } else {

                    player.sendMessage(ChatColor.RED + "No spawn point has been set. Please set one using /setspawn");
                }


            }


            return true;
        }else {
            System.out.println("You cant go to the spawn of the thing you are not in");
        }


        return false;
    }
}