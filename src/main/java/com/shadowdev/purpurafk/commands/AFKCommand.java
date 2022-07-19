package com.shadowdev.purpurafk.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.shadowdev.purpurafk.PurpurAFK;

public class AFKCommand implements CommandExecutor {

    private final PurpurAFK plugin;

    public AFKCommand(PurpurAFK unbMC) {
        this.plugin = unbMC;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            player.setAfk(true);
        } else
            this.plugin.logger.info("This command can only be run by players");

        return true;
    }
}