package main;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

import commands.armor;
import commands.armorToughness;
import commands.attackDamage;
import commands.attackSpeed;
import commands.hideModifiers;
import commands.knobackResistance;
import commands.luck;
import commands.maxHealth;
import commands.movementSpeed;
import commands.unbreakable;

public class attributes extends JavaPlugin {

	maxHealth maxHealth = new maxHealth(null);
	knobackResistance knobackResistance = new knobackResistance(null);
	movementSpeed movementSpeed = new movementSpeed(null);
	attackDamage attackDamage = new attackDamage(null);
	armor armor = new armor(null);
	armorToughness armorToughness = new armorToughness(null);
	attackSpeed attackSpeed = new attackSpeed(null);
	luck luck = new luck(null);
	unbreakable unbreakable = new unbreakable(null);
	hideModifiers hideModifiers = new hideModifiers(null);

	String attribute;
	static int level;

	public void onEnable() {

	}// End of onEnable Method

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		switch (cmd.getName().toLowerCase()) {
		case "attribute":
			if (getType(sender, cmd, label, args)) {
				routeCommand(sender, label, args);
				return true;
			} else {
				return false;
			}
		}
		return false;
	}// End of onCommand Method

	private void routeCommand(CommandSender sender, String label, String[] args) {
		switch (attribute) {
		case "maxHealth":
			maxHealth.execute(sender, label, args);
			break;
		case "knobackResistance":
			knobackResistance.execute(sender, label, args);
			break;
		case "movementSpeed":
			movementSpeed.execute(sender, label, args);
			break;
		case "attackDamage":
			attackDamage.execute(sender, label, args);
			break;
		case "armor":
			armor.execute(sender, label, args);
			break;
		case "armorToughness":
			armorToughness.execute(sender, label, args);
			break;
		case "attackSpeed":
			attackSpeed.execute(sender, label, args);
			break;
		case "luck":
			luck.execute(sender, label, args);
			break;
		case "unbreakable":
			unbreakable.execute(sender, label, args);
			break;
		case "hideModifiers":
			hideModifiers.execute(sender, label, args);
			break;
		}
	}// End of routeCommand method

	public boolean getType(CommandSender sender, Command cmd, String label, String[] args) {
		boolean information = checkNotEmpty(args);

		if (information) {
			attribute = args[0];
			level = Integer.parseInt(args[1]);
		} else {
			return false;
		}

		return true;
	}// End of getType method

	public boolean checkNotEmpty(String[] args) {
		if (args[0] == null || args[1] == null) {
			return false;
		} else {
			return true;
		} // End of check for info
	}// End of checkNotEmpty method

	public static int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		attributes.level = level;
	}

	public void onDisable() {

	}// End of onDisable Method
}// End of class
