package me.froglin.frogin.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class AdminonlyCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        // Output if executed by an oped player
        if (sender instanceof Player player) {
            if (player.hasPermission("Frogin.AdminonlyCommand")) {
                player.sendMessage("Hello " + ChatColor.RED + "Administrator!");

                // Code for when a normal player executes the player
            } else {
                Player p = (Player) sender;
                p.sendMessage(ChatColor.RED + "You do not have the correct Administrator permissions to run this command. Please contact a system admin if you believe this is a mistake.");


            }
            // code for when its executed from console
            return true;
        } else {
            System.out.println("Hello All-mighty Console-kun");
        }


        return true;
    }
}