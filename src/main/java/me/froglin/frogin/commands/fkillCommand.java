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

        if (sender instanceof Player p) {
            if (p.hasPermission("Frogin.fkillCommand")) {


                if (args.length == 0) {
                    p.sendMessage(ChatColor.GRAY + "You decided you were too good for the world and disappeared in an instance");
                    p.setHealth(0.0);
                    System.out.println(p.getDisplayName() + " Has killed themself.");


                } else {

                    String PlayerName = args[0];

                    Player target = Bukkit.getServer().getPlayerExact(PlayerName);

                    if (target == null) {
                        p.sendMessage(ChatColor.GRAY + "Player not found");
                    } else {
                        p.sendMessage(ChatColor.GRAY + "You successfully Erased " + ChatColor.YELLOW + target.getDisplayName());
                        target.sendMessage(ChatColor.GRAY + "You have been Erased by someone");
                        target.setHealth(0.0);
                        System.out.println(target.getDisplayName() + " Has been killed by " + p.getDisplayName());


                        return true;
                    }

                }
            } else {
                p.sendMessage(ChatColor.RED + "You do not have permission to execute this command.");
                System.out.println(p.getDisplayName() + " Has tried to execute a kill command");


            }
            //This code for sout doesn't fucking work so F.
            return true;
        } else {
                System.out.println("You are already invincible and we ain't gonna try to kill you!");

        }
        return true;
    }
}