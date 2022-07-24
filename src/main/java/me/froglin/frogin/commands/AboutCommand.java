package me.froglin.frogin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class AboutCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        // Output when a player executes the command
        if (sender instanceof Player player) {

            player.sendMessage(ChatColor.GRAY + "Hello " + ChatColor.YELLOW + player.getDisplayName() + ChatColor.GRAY + " This plugin is described as the Frog-Made plugin!");

        // Command output when executed from console
        } else {
            System.out.println("Hello there console, this plugin is described as the Frog-made plugin");
            return true;
        }

        return true;
    }
}


