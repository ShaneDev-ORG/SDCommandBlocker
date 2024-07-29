package co.shanedev.sdcommandblocker.events;

import co.shanedev.sdcommandblocker.config;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

import java.util.List;

public class CommandBlocker implements Listener {


    @EventHandler
    public void onCommand(PlayerCommandPreprocessEvent event) {

        Player player = event.getPlayer();
        String message = event.getMessage();

        if(!player.hasPermission("sdcb.blocker.bypass")) {

            if(isCommandBlocked(message)) {
                event.setCancelled(true);
                if (!config.get().getString("BlockedCommandsMessage").isEmpty()) {
                    player.sendMessage(config.get().getString("BlockedCommandsMessage").replace("&", "§"));
                }
            }
        }
    }

    public static boolean isCommandBlocked(String command) {
        List<String> blockedCommands = config.get().getStringList("Blocked-Commands");
        for (String blockedCommand : blockedCommands) {
            if (command.startsWith(blockedCommand)) {
                // If the command starts with any blocked command, consider it blocked
                return true;
            }
        }
        return false;
    }

}
