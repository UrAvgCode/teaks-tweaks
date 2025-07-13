package me.teakivy.teakstweaks.oldcommands;

import me.teakivy.teakstweaks.packs.afkdisplay.AFK;
import me.teakivy.teakstweaks.utils.ErrorType;
import me.teakivy.teakstweaks.utils.oldcommand.*;
import me.teakivy.teakstweaks.utils.permission.Permission;
import org.bukkit.entity.Player;

public class AFKCommand extends AbstractCommand {

    public AFKCommand() {
        super(CommandType.PLAYER_ONLY, "afk-display", "afk", Permission.COMMAND_AFK, Arg.optional("uninstall"));
    }

    @Override
    public void playerCommand(PlayerCommandEvent event) {
        Player player = event.getPlayer();
        if (event.isArgsSize(1) && event.isArg(0, "uninstall")) {
            if (!checkPermission(Permission.COMMAND_AFK_UNINSTALL)) return;

            AFK.uninstall();
        }

        if (!getPackConfig().getBoolean("allow-afk-command")) {
            sendError(ErrorType.COMMAND_DISABLED);
            return;
        }

        if (AFK.afk.containsKey(player.getUniqueId())) {
            if (AFK.afk.get(player.getUniqueId())) {
                AFK.unAFK(player);
                return;
            }

            AFK.afk(player, true);
        }
    }
}
