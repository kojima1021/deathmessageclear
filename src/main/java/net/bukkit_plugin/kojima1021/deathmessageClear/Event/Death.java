package net.bukkit_plugin.kojima1021.deathmessageClear.Event;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class Death implements Listener {

	@EventHandler
    public void DeathEvents(PlayerDeathEvent e) {
	e.setDeathMessage(null);
	}
    }
