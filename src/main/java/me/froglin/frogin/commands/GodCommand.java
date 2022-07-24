package me.froglin.frogin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GodCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player p) {
            if (p.hasPermission("Frogin.GodCommand")) {


                if (p.isInvulnerable()) {

                    p.setInvulnerable(false);
                    p.sendMessage(ChatColor.RED + "God Mode Disabled");
                    System.out.println(p.getDisplayName() + " Has disabled God mode!");
                } else {
                    p.setInvulnerable(true);
                    p.sendMessage(ChatColor.GREEN + "God mode enabled");
                    System.out.println(p.getDisplayName() + " Has enabled God mode!");
                }


            } else {
                p.sendMessage(ChatColor.RED + "You do not have permission to execute this command.");
                System.out.println(p.getDisplayName() + " Has attempted to execute the god command.");
            }
        }else
            System.out.println("Your already invincible, why do you want to be more unkillable?");

        return true;
    }
}