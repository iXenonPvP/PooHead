package fr.ixenon;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import fr.ixenon.listeners.JoinListener;

public class PooHead extends JavaPlugin{
	
	@Override
	public void onEnable() {
		System.out.println("PooHead started");
		registerListener();
	}
	
	private void registerListener() {
		PluginManager pm = Bukkit.getPluginManager();
		pm.registerEvents(new JoinListener(), this);
	}

	@Override
	public void onDisable() {
		System.out.println("PooHead finished");
	}


}
