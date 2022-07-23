package me.froglin.frogin.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class hmCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (!(sender instanceof Player)) {
            System.out.println("hmmmm mr.console");

            return false;
        } else {
            Player player = (Player) sender;
            player.sendMessage("hmmmmmmm");

        }

        return false;
    }
}
