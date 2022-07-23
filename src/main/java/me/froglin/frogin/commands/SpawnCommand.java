package me.froglin.frogin.commands;

import me.froglin.frogin.Frogin;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SpawnCommand implements CommandExecutor {

    private final Frogin plugin;

    public SpawnCommand(Frogin plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args){

        if (sender instanceof Player){

            Player player = (Player) sender;

            Location location = plugin.getConfig().getLocation("spawn");

            if (location != null){

                player.teleport(location);

                player.sendMessage("You have been teleported to spawn!");

            }else{
                player.sendMessage("No spawn point has been set. Please set one using /setspawn");
            }




        }


        return true;
    }


}
