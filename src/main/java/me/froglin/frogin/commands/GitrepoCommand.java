package me.froglin.frogin.commands;


import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GitrepoCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (!(sender instanceof Player)) {
            ;

            System.out.println("The website for the plugin repo is https://github.com/Frogman03/Frogin");

        } else {

            Player player = (Player) sender;

            player.sendMessage("Hello " + ChatColor.YELLOW + player.getDisplayName() + " The github website for this plugin is " + ChatColor.RED + "https://github.com/Frogman03/Frogin");

            return false;
        }


        return false;
    }

}
