package com.mvye.eventlistenerpuzzles;

import com.mvye.eventlistenerpuzzles.events.PuzzleEvents;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class EventListenerPuzzles extends JavaPlugin {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new PuzzleEvents(), this);
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "[EventListenerPuzzles]: Plugin is enabled!");
    }
    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[EventListenerPuzzles]: Plugin is disabled!");
    }
}
