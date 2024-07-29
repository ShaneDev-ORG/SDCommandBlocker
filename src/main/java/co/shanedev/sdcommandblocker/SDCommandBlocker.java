package co.shanedev.sdcommandblocker;

import co.shanedev.sdcommandblocker.events.CommandBlocker;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class SDCommandBlocker extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

        getConfig().options().copyDefaults();
        saveDefaultConfig();

        config.setup();
        config.get().addDefault("Prefix", "&f&lBLOCKER &8&l» ");

        config.get().options().copyDefaults(true);


        getServer().getPluginManager().registerEvents(new CommandBlocker(), this);


        getServer().getConsoleSender().sendMessage("§b==================================================");
        getServer().getConsoleSender().sendMessage(" ");
        getServer().getConsoleSender().sendMessage("§cPlugin: §7SDCommandBlocker");
        getServer().getConsoleSender().sendMessage("§cAuthor: §7ShaneDev");
        getServer().getConsoleSender().sendMessage("§cVersion: §71.0");
        getServer().getConsoleSender().sendMessage("§cDiscord: §7discord.gg/Z6eF4QP4gD");
        getServer().getConsoleSender().sendMessage(" ");
        getServer().getConsoleSender().sendMessage("§b==================================================");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
