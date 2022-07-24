package me.froglin.frogin.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.*;

public class TabCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player p) {

            ScoreboardManager manager2 = Bukkit.getScoreboardManager();
            Scoreboard scoreboard2 = manager2.getNewScoreboard();

            Objective objective = scoreboard2.registerNewObjective("Frogin", "dumbie", ChatColor.AQUA + "Frogin");
            objective.setDisplaySlot(DisplaySlot.BELOW_NAME);

            Score score = objective.getScore(ChatColor.DARK_GREEN + "Status: Testing");
            score.setScore(1);

            p.setScoreboard(scoreboard2);
            System.out.println(p.getDisplayName() + " Has successfully executed the tab command");
            p.sendMessage(ChatColor.GREEN + "Command executed successfully!");


        }
        return false;
    }
}