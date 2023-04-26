import org.bukkit.event.Listener;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;

public final class AFKListener implements Listener {
	public AFKListener(PurpurAFK purpurAfk) {
		purpurAfk.getServer().getPluginManager().registerEvents(this, purpurAfk);
	}

	@EventHandler(priority = EventPriority.HIGHEST)
	public void onPlayerAFKEvent(PlayerAFKEvent event) {

}