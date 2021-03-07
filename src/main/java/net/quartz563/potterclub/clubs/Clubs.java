package net.quartz563.potterclub.clubs;


import lombok.Getter;
import org.bukkit.Location;
import org.mineacademy.fo.settings.YamlConfig;

import java.util.List;

@Getter
public class Clubs extends YamlConfig {

	private String clubLeaderUUID;
	private Location clubLocation;
	private List<String> members;

	public Clubs(final String clubName){
		setHeader("Welcome to the primary club file");
		loadConfiguration("clubs-template.yml", "clubs/" + clubName + (!clubName.endsWith(".yml") ? ".yml":""));
	}

	public String getName(){
		return getFileName().replace(".yml", "");
	}

}
