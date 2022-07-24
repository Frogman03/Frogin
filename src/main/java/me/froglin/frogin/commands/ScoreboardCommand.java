package me.froglin.frogin.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.*;


public class ScoreboardCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player p) {
            if (p.hasPermission("Frogin.ScoreboardCommand")) {

                ScoreboardManager manager = Bukkit.getScoreboardManager();
                Scoreboard scoreboard = manager.getNewScoreboard();

                Objective objective = scoreboard.registerNewObjective("Frogin", "dumbie", ChatColor.AQUA + "Frogin");
                objective.setDisplaySlot(DisplaySlot.SIDEBAR);

                Score score = objective.getScore(ChatColor.DARK_GREEN + "Status: Working");
                score.setScore(3);
                Score score1 = objective.getScore(ChatColor.DARK_GREEN + "If you see this its working");
                score1.setScore(5);
                Score score2 = objective.getScore(ChatColor.BLUE + "Everything is working! Very cool");
                score2.setScore(6);
                Score score3 = objective.getScore(ChatColor.GRAY + "You are logged in as: " + ChatColor.YELLOW + p.getDisplayName());
                score3.setScore(2);
                Score score4 = objective.getScore(" ");
                score4.setScore(4);



                p.setScoreboard(scoreboard);

                System.out.println(p.getDisplayName() + " Has done the scoreboard command!");
                p.sendMessage(ChatColor.GREEN + "Command executed successfully, Scoreboard has been enabled!");
                for (Player people : Bukkit.getOnlinePlayers()) {
                    people.setScoreboard(scoreboard);
                }


            }else {
                p.sendMessage(ChatColor.RED + "You do not have permission to execute this command.");
                System.out.println(p.getDisplayName() + " Has attemped to execute the scoreboard command!");
            }


            return false;

        }


        return false;
    }
}

