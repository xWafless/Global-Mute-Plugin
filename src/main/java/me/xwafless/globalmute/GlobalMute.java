package me.xwafless.globalmute;

import me.xwafless.globalmute.Commands.ServerMute;
import me.xwafless.globalmute.Events.Mute;
import org.bukkit.Server;
import org.bukkit.plugin.java.JavaPlugin;

public final class GlobalMute extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        getServer().getPluginManager().registerEvents(new Mute(), this);
        getCommand("globalmute").setExecutor(new ServerMute());
    }
    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
