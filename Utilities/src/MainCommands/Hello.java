package MainCommands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public class Hello extends Command{

	public Hello(String name) {
		super(name);
	}

	@Override
	public boolean execute(CommandSender sender, String label, String[] args) {
		sender.sendMessage("It worked");
		return false;
	}
}// End of class
