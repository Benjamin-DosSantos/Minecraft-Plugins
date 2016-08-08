package commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public class unbreakable extends Command{

	public unbreakable(String name) {
		super(name);
	}// End of Item constructor

	@Override
	public boolean execute(CommandSender sender, String label, String[] args) {
		return true;
	}// End of execute Command
}// End of class
