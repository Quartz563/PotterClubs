package net.quartz563.potterclub.commands;

import net.quartz563.potterclub.commands.club.CreateClubCommand;
import org.mineacademy.fo.command.SimpleCommandGroup;

public class ClubsGroupCommand extends SimpleCommandGroup {


	@Override
	protected void registerSubcommands() {
		registerSubcommand(new CreateClubCommand(this));
	}


	@Override
	protected String getCredits() {
		return "Visit pottercraftmc.com for more information";
	}
}
