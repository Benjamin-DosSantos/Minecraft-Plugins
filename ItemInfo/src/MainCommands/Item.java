package MainCommands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public class Item extends Command{

	public Item(String name) {
		super(name);
	}

	@Override
	public boolean execute(CommandSender sender, String label, String[] args) {
		sender.sendMessage("It worked");
		return false;
	}
}// End of class