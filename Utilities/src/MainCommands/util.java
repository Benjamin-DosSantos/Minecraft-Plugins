package MainCommands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

public class util extends Command{

	protected util(String name) {
		super(name);
	}

	@Override
	public boolean execute(CommandSender sender, String label, String[] args) {
		sender.sendMessage("It worked");
		return false;
	}

}
