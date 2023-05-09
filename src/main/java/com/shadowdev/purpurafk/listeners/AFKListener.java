package com.shadowdev.purpurafk.listeners;

import org.bukkit.event.Listener;
import org.bukkit.metadata.MetadataValue;
import org.purpurmc.purpur.event.PlayerAFKEvent;

import com.shadowdev.purpurafk.PurpurAFK;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;

public final class AFKListener implements Listener {
	public AFKListener(PurpurAFK purpurAfk) {
		purpurAfk.getServer().getPluginManager().registerEvents(this, purpurAfk);
	}

	@EventHandler(priority = EventPriority.HIGHEST)
	public void onPlayerAFKEvent(PlayerAFKEvent event) {
		Player player = event.getPlayer();

		boolean vanished = false;
		for (MetadataValue metadataValue : player.getMetadata("vanished")) {
			if (metadataValue.asBoolean()) {
				vanished = true;
				break;
			}
		}

		if (vanished)
			event.setCancelled(true);
	}
}