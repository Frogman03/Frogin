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
                System.out.println(player.getDisplayName() + " Has killed themself.");


            } else {

                String PlayerName = args[0];

                Player target = Bukkit.getServer().getPlayerExact(PlayerName);

                if (target == null) {
                    p.sendMessage(ChatColor.GRAY + "Player not found");
                } else {
                    p.sendMessage(ChatColor.GRAY + "You successfully Erased " + ChatColor.YELLOW + target.getDisplayName());
                    target.sendMessage(ChatColor.GRAY + "You have been Erased by someone");
                    target.setHealth(0.0);
                    System.out.println(target.getDisplayName() + " Has been killed by " + player.getDisplayName());


                    return false;
                }

            }
        }
        if (!(sender instanceof Player)) {
            System.out.println("You cant be killed already and its staying that way.");

        }
        return false;
    }
}