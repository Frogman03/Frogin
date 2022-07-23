package me.froglin.frogin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class AdminonlyCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (player.hasPermission("Frogin.AdminonlyCommand")) {
                player.sendMessage("Hello " + ChatColor.RED + "Administrator!");

            } else {
                Player p = (Player) sender;
                p.sendMessage(ChatColor.RED + "You do not have the correct Administrator permissions to run this command. Please contact a system admin if you believe this is a mistake.");


            }

            return false;
        }


        return false;
    }
}