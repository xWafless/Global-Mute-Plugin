package me.xwafless.globalmute.Events;

import me.xwafless.globalmute.Commands.ServerMute;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.server.ServerEvent;

public class Mute implements Listener {

    @EventHandler
    public void GlobalMute(AsyncPlayerChatEvent e) {
        if (ServerMute.toggle == true) {
            Player p = e.getPlayer();
            p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&cChat is currently muted!"));
            e.setCancelled(true);
            return;
        }
    }
}
