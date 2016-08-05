package main;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;

import net.minecraft.server.v1_10_R1.Item;

public class featherGUI {
	public Inventory inv;
	public int guiSize = 9;
	public String guiName = "Fast Ban";
	
	Material[] items = new Material[guiSize];
	
	public void openGUI(CommandSender p){
	    //format: null, size of inventory (must be divisible by 9), "GUI name"
	    inv = createNewInv(null, 9, guiName);
	    populateGUI();
	    ((HumanEntity) p).openInventory(inv);
	}// end of openGUI
	
	public void populateGUI(){
		items[0] = Material.PAPER;
		items[1] = Material.DIAMOND;
		items[2] = Material.DIAMOND;
		items[3] = Material.DIAMOND;
		items[4] = Material.DIAMOND;
		items[5] = Material.DIAMOND;
		items[6] = Material.DIAMOND;
		items[7] = Material.DIAMOND;
		items[8] = Material.PAPER;
		
		addItemsToGUI();
	}// End of populateGUI method
	
	public void addItemsToGUI(){
		for(int i = 0; i < items.length; i++){
			inv.setItem(i, new ItemStack(items[i]));
		}// End of for the size of the array
	}// End of addItemsToGUI Method
	
	public Inventory createNewInv(InventoryHolder inventoryOwner, int size, String inventoryName){
		return Bukkit.createInventory(inventoryOwner, size, inventoryName);
	};
	
	@EventHandler //MAKE SURE YOU HAVE THIS
	public void InventoryClick(InventoryClickEvent e){
	    Player p = (Player) e.getWhoClicked();  

	    if(e.getInventory().getTitle().contains(guiName)){
	        //Cancel the event so they can't take items out of the GUI
	        e.setCancelled(true);
	       
	        Material clickedItem = e.getCurrentItem().getType();
	        
	        switch (clickedItem){
	        	case items[0]:
	        		break;
	        	case items[1]:
	        		break;
	        }
	    }
	}
	
}// End of class
