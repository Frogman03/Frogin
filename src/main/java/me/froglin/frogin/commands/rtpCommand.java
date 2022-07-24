package me.froglin.frogin.commands;

import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Random;

public class rtpCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){
            Player p = (Player) sender;

            Random random = new Random();

            int x = random.nextInt(1000);
            int y = 150;
            int z = random.nextInt(1000);


            Location randomL = new Location(p.getWorld(), x, y, z);

            y = randomL.getWorld().getHighestBlockYAt(randomL);
            randomL.setY(y);
            p.sendMessage(ChatColor.GRAY + "You have successfully been teleported to a random location!");
            System.out.println(p.getDisplayName() + " Has randomly teleported!");
            p.teleport(randomL);




        }












        return true;
    }
}
