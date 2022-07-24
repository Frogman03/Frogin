package me.froglin.frogin.commands;

import org.bukkit.ChatColor;
import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.UUID;


public class CreditCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        // code for when its executed from console
        if (!(sender instanceof Player player)) {

            System.out.println("Hello console! All credits go to FrogMan for making the plugin");

            //Code for when executed from a player
        } else {
            player.sendMessage("Hello " + ChatColor.YELLOW +player.getDisplayName() + ChatColor.WHITE + " All credit goes to FrogMan, Credit to Tuchan for the tutorial videos which made the plugin go as far as it did.");

        }

        return true;
    }
}
