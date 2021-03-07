package net.quartz563.potterclub;

import net.quartz563.potterclub.clubs.ClubRegister;
import net.quartz563.potterclub.commands.ClubsGroupCommand;
import net.quartz563.potterclub.settings.Settings;
import org.mineacademy.fo.Common;
import org.mineacademy.fo.plugin.SimplePlugin;
import org.mineacademy.fo.settings.YamlStaticConfig;

import java.util.Arrays;
import java.util.List;

public class PotterClub extends SimplePlugin {

    @Override
    protected void onPluginStart() {
        Common.log("PotterClubs is online!");
        registerCommands("club|clubs|c", new ClubsGroupCommand());
        ClubRegister.getInstance().loadClubs();
    }

    @Override
    public List<Class<? extends YamlStaticConfig>> getSettings() {
        return Arrays.asList(Settings.class);
    }

}
