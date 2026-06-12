package io.github.derexxd.antiEndermanGrief;

import org.bukkit.plugin.java.JavaPlugin;

public final class AntiEndermanGrief extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        // Register listener to prevent Endermen from picking up blocks
        getServer().getPluginManager().registerEvents(new EndermanPickupListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
