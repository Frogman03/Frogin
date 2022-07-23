package me.froglin.frogin.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class fkillCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player p = (Player) sender;
        if (sender instanceof Player) {
            Player player = (Player) sender;


            if (args.length == 0) {
                p.sendMessage("You decided that your too good for the world and disappeared in an instance");
                p.setHealth(0.0);


            } else {

                String PlayerName = args[0];

                Player target = Bukkit.getServer().getPlayerExact(PlayerName);

                if (target == null) {
                    p.sendMessage("Player not found");
                } else {
                    p.sendMessage("You successfully Erased " + target.getDisplayName());
                    target.sendMessage("You have been Erased by someone");
                    target.setHealth(0.0);


                    return false;
                }

            }
        }
        return false;
    }
}