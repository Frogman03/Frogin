package me.froglin.frogin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.UUID;

public class VersionCommand implements CommandExecutor{
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (!(sender instanceof Player)){

            System.out.println("Hello console! The current version is 0.21 Pre-Release.");


        } else {
            Player player = (Player) sender;

            player.sendMessage("Hello " + ChatColor.YELLOW + player.getDisplayName() + ChatColor.WHITE + " the current version is " + ChatColor.RED + "0.21 Pre-Release!" );


        }

        return true;
    }
}
