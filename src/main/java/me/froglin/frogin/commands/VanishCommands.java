package me.froglin.frogin.commands;

import me.froglin.frogin.Frogin;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class VanishCommands implements CommandExecutor {

    ArrayList<Player> invisible_list = new ArrayList<>();

    Frogin plugins;

    public VanishCommands(Frogin plugins) {
        this.plugins = plugins;
    }


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player player) {
            if (player.hasPermission("Frogin.VanishCommands")) {
                if (invisible_list.contains(player)) {
                    for (Player people : Bukkit.getOnlinePlayers()) {
                        people.showPlayer(plugins, player);
                    }
                    invisible_list.remove(player);
                    player.sendMessage(ChatColor.RED + "You have unvanished you can now be seen by others");
                    System.out.println(player.getDisplayName() + " Has reappeared!");

                } else if (!(invisible_list.contains(player))) {
                    for (Player people : Bukkit.getOnlinePlayers()) {
                        people.hidePlayer(plugins, player);
                    }
                    invisible_list.add(player);
                    player.sendMessage(ChatColor.GREEN + "You are now Vanished!");
                    System.out.println(player.getDisplayName() + " Has vanished.");
                }

                if (!(sender instanceof Player)) {
                    System.out.println("You cant go into vanish if your not there dumbie.");
                }


                return true;
            }else {
                player.sendMessage(ChatColor.RED + "You do not have the permission to vanish.");
                System.out.println(player.getDisplayName() + " Has attempted to vanish/ unvanish.");
            }


        }


        return false;
    }
}
