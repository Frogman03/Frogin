package me.froglin.frogin.commands;

import me.froglin.frogin.Frogin;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class VanishCommands implements CommandExecutor {

    ArrayList<Player> invisible_list = new ArrayList<>();

    Frogin plugins;

    public VanishCommands(Frogin plugins){
        this.plugins = plugins;
    }


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){

    if (sender instanceof Player){
        Player player = (Player) sender;
        if (invisible_list.contains(player)){
            for (Player people : Bukkit.getOnlinePlayers()){
                people.showPlayer(plugins, player);
            }
            invisible_list.remove(player);
            player.sendMessage("You have unvanished and now can be seen");

        } else if (!(invisible_list.contains(player))) {
            for (Player people : Bukkit.getOnlinePlayers()) {
                people.hidePlayer(plugins, player);
            }
                 invisible_list.add(player);
                 player.sendMessage("You are now Vanished!");
        }

        }

        return true;
    }




}
