package me.froglin.frogin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.checkerframework.checker.units.qual.K;

public class GodCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player p) {


            if (p.isInvulnerable()) {

                p.setInvulnerable(false);
                p.sendMessage(ChatColor.RED + "God Mode Disabled");
            } else {
                p.setInvulnerable(true);
                p.sendMessage(ChatColor.GREEN + "God mode enabled");
            }

            return false;
        }
        if (!(sender instanceof Player ));
        System.out.println("Your already playing god, why do you need to become unkillable?");
        return false;
    }
}