package me.xwafless.globalmute.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ServerMute implements CommandExecutor {
    public static boolean toggle = false;

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (toggle == true) {
            toggle = false;
            for (Player player : Bukkit.getOnlinePlayers()) {
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&8&m+--------------------------------------------+"));
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', " "));
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "         &8* &a&lGLOBAL MUTE HAS BEEN LIFTED! &8*"));
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "                &7You will now be able to chat."));
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "                    &eLifted by:" + "&f " + sender.getName()));
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', " "));
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&8&m+-------------------------------------------+"));
            }
            }else{
                toggle = true;
                for (Player player : Bukkit.getOnlinePlayers()) {
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&8&m+--------------------------------------------+"));
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', " "));
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "  &8* &c&lGLOBAL MUTE HAS BEEN PUT INTO EFFECT! &8*"));
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "       &7You will not be able to chat during this time."));
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "                    &eMuted by:" + "&f " + sender.getName()));
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', " "));
                player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&8&m+--------------------------------------------+"));
                }
            }
        return false;
    }
}