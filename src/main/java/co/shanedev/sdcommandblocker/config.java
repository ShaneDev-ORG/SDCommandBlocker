package co.shanedev.sdcommandblocker;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class config {
    private static File file;
    private static FileConfiguration customFile;


    //finds or generates config file
    public static void setup() {
        file = new File(Bukkit.getServer().getPluginManager().getPlugin("SDCommandBlocker").getDataFolder(), "config.yml");

        if(!file.exists()){
            try {
                file.createNewFile();
            }catch (IOException e) {
                ///eeeee
            }
        }
        customFile = YamlConfiguration.loadConfiguration(file);
    }

    public static FileConfiguration get(){
        return customFile;
    }

    public static void save(){
        try{
            customFile.save(file);
        }catch (IOException e) {
            System.out.println("Couldn't save file.");
        }
    }

    public static void reload() {
        customFile = YamlConfiguration.loadConfiguration(file);
    }


}
