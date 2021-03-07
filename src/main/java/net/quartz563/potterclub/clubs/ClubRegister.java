package net.quartz563.potterclub.clubs;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.mineacademy.fo.FileUtil;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class ClubRegister {

	@Getter
	private static final ClubRegister instance = new ClubRegister();

	@Getter
	public final List<Clubs> loadedClubs = new ArrayList<>();

	public void createClub(String name){
		Clubs club = new Clubs(name);
		club.save();
		loadedClubs.add(club);
	}

	public Clubs getClub(String name){
		for(Clubs club:loadedClubs)
			if(club.getName().equals(name))
				return club;
		return null;
	}

	public void loadClubs(){
		loadedClubs.clear();
		for(File file: FileUtil.getFiles("clubs", ".yml")){
			Clubs club = new Clubs(file.getName());
			loadedClubs.add(club);
		}
	}

}
