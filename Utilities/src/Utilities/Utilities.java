package Utilities;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

import MainCommands.Hello;

public class Utilities extends JavaPlugin{
	Hello hello = new Hello(null);
	
	public void onEnable(){
		
	}// End of onEnable Method
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		switch (cmd.getName().toLowerCase()){
			case "util":
				hello.execute(sender, label, args);
				return true;
		}
		
		return false;
	}// End of onCommand Method
	
	public void onDisable(){
		
	}// End of onDisable Method
}// End of class
