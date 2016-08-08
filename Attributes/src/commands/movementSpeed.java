package commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import main.attributes;

public class movementSpeed extends Command{

	public movementSpeed(String name) {
		super(name);
	}// End of Item constructor

	@Override
	public boolean execute(CommandSender sender, String label, String[] args) {
		Player player = (Player) sender;
		
		player.setWalkSpeed(attributes.getLevel());
		
		return true;
	}// End of execute Command
}// End of class
