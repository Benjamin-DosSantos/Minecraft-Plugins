package main;

import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.plugin.java.JavaPlugin;


public class feather extends JavaPlugin implements Listener{
	
	featherGUI gui = new featherGUI();
	
	public void onEnable(){
		this.getServer().getPluginManager().registerEvents(this, this);
		this.getServer().getPluginManager().registerEvents(new featherGUI(), this);
	}// End of onEnable Method
	
	@EventHandler
	public void onPlayerInteract(PlayerInteractEntityEvent e) {
		Player player = e.getPlayer();
		if(e.getPlayer().isOp()){
	        Entity entity = e.getRightClicked();
	        if((entity instanceof Player == true) && player.getInventory().getItemInMainHand().getType().equals(Material.FEATHER)){   
	        	gui.openGUI(player);
	        	gui.setPlayerHit(entity);
	        }// End of if you hit a player with a feather
		}// end of if player is OP
	}// End of onPlayerInteract method
	
	public void onDisable(){
		
	}// End of onDisable Method
}// End of class
