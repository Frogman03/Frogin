package me.froglin.frogin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.UUID;


public class CreditCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (!(sender instanceof Player)) {

            System.out.println("Hello console! All credits go to FrogMan for making the plugin");


        } else {
            Player player = (Player) sender;

            player.sendMessage("Hello " + ChatColor.YELLOW +player.getDisplayName() + ChatColor.WHITE + " All credit goes to FrogMan!");


        }

        return false;
    }
}
