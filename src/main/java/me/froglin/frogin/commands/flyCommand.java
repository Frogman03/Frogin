package me.froglin.frogin.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class flyCommand implements CommandExecutor {

    private ArrayList<Player> list_of_flying_players = new ArrayList<>();

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player player) {
            if (player.hasPermission("Frogin.flyCommand")) {
                if (args.length == 0) {
                    if (list_of_flying_players.contains(player)) {
                        list_of_flying_players.remove(player);
                        player.setAllowFlight(false);
                        player.sendMessage(ChatColor.RED + "Fly mode has been disabled!");
                        System.out.println(player.getDisplayName() + " Has disabled fly mode.");
                    } else if (!list_of_flying_players.contains(player)) {
                        list_of_flying_players.add(player);
                        player.setAllowFlight(true);
                        player.sendMessage(ChatColor.AQUA + "Fly mode has been enabled.");
                        System.out.println(player.getDisplayName() + " Has enabled fly mode");
                    }
                }
            }
        } else {
            System.out.println("You cant fly when your not on the server silly!");
        }
        assert sender instanceof Player;
        Player p = (Player) sender;
        if (!(p.hasPermission("Frogin.flyCommand"))) {
            p.sendMessage(ChatColor.RED + "You do not have permission to fly.");
            System.out.println(p.getName() + " has attempted to do the fly command!");
            return true;
        }
        return true;
    }
}