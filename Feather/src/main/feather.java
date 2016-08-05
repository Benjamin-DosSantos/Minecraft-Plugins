package main;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.java.JavaPlugin;


public class feather extends JavaPlugin{
	
	featherGUI gui = new featherGUI();
	
	public void onEnable(){
		
	}// End of onEnable Method
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		switch (cmd.getName().toLowerCase()){
			case "gui":
				gui.openGUI(sender);
				return true;
		}
		return false;
	}// End of onCommand Method
	
	public void onPlayerInteract(PlayerInteractEvent e) {
		Player player = e.getPlayer();
		Action eAction = e.getAction();
		//if(e.getPlayer().hasPermission("feather.hit")){
			if (!(eAction == Action.RIGHT_CLICK_AIR || eAction == Action.RIGHT_CLICK_BLOCK) && (player.getInventory().getItemInMainHand().getType().equals(Material.FEATHER))){
				player.sendMessage("Open GUI Here");
				gui.openGUI(player);
			}else{
				gui.openGUI(player);
			}
		//}
	} 
	
	public void onDisable(){
		
	}// End of onDisable Method
}// End of class
