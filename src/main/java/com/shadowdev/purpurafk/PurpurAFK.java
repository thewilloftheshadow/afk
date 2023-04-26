package com.shadowdev.purpurafk;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import com.shadowdev.purpurafk.commands.AFKCommand;

public final class PurpurAFK extends JavaPlugin {
    public final Logger logger = this.getLogger();
    public PurpurAFK purpurAfk;

    @Override
    public void onEnable() {
        getCommand("afk").setExecutor(new AFKCommand(this));
    }

    @Override
    public void onDisable() {
        logger.info("PurpurAFK has been disabled.");
    }
}