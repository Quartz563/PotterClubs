package net.quartz563.potterclub.commands.club;

import org.mineacademy.fo.command.SimpleCommandGroup;
import org.mineacademy.fo.command.SimpleSubCommand;

public class CreateClubCommand extends SimpleSubCommand {

	public CreateClubCommand(SimpleCommandGroup parent) {
		super(parent, "create|c");
		setMinArguments(2);
		setUsage("<Club Name> <Club Leader>");
		setPermission("potterclubs.admin");
		setDescription("Create a new club");
	}

	@Override
	protected void onCommand() {
		checkConsole();

	}

}
