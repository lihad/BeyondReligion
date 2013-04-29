package lihad.BeyondReligion;

import java.util.LinkedList;
import java.util.List;
import java.util.logging.Logger;

import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

//TODO:
// -Make a main lobby/hangout area. This is where players go when they log in and are not a member of a game
// -After a certain number of players are reached on a certain lobby, they are tp'd to a different world, and the Religion starts
//
//

public class BeyondReligion extends JavaPlugin implements Listener{
	protected static String PLUGIN_NAME = "BeyondReligion";
	protected static String header = "[" + PLUGIN_NAME + "] ";
	private static Logger log = Logger.getLogger("Minecraft");
	
	public static List<Team> engagedteams = new LinkedList<Team>();

	//Game Config
	public static int roundtimeinticks;
	public static int lobbytimeinticks;
	public static int maxteams;
	public static List<World> maps;
	public static World lobby;
	
	public class Team{
		String name;
		List<String> players;
		int gold;

		Team(String n, List<String> p, int g){name = n; players = p; gold = g;}
	}
	public class Map{
		
	}

	@Override
	public void onEnable() {
		this.getServer().getPluginManager().registerEvents(this, this);

		//Lobby Timer
		this.getServer().getScheduler().scheduleSyncDelayedTask(this, new Runnable(){
			@Override
			public void run() {

			}
		},0);

		//Game timer
		this.getServer().getScheduler().scheduleSyncRepeatingTask(this, new Runnable(){
			@Override
			public void run() {

			}
		},0,0);

	}
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event){
		
	}
	@EventHandler
	public void onPlayerInteract(PlayerInteractEvent event){
		
	}
	public static void info(String message){ 
		log.info(header + ChatColor.WHITE + message);
	}
	public static void severe(String message){
		log.severe(header + ChatColor.RED + message);
	}
	public static void warning(String message){
		log.warning(header + ChatColor.YELLOW + message);
	}
}
