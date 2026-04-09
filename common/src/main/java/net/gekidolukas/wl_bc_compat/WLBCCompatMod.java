package net.gekidolukas.wl_bc_compat;

import net.bettercombat.logic.PlayerAttackHelper;
import net.bettercombat.logic.PlayerAttackProperties;
import net.minecraft.world.entity.player.Player;
import net.weaponleveling.api.event.ChooseAttackItemEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class WLBCCompatMod {
    public static final String MODID = "wl_bc_compat";
    public static final Logger LOGGER = LogManager.getLogger(MODID);

    public static void init() {
        ChooseAttackItemEvent.EVENT.register(event -> {
            if(event.killer instanceof Player player) {
                if (PlayerAttackHelper.getCurrentAttack(player, ((PlayerAttackProperties)player).getComboCount()) == null) event.itemStack =  player.getMainHandItem();
                else event.itemStack =  PlayerAttackHelper.getCurrentAttack(player, ((PlayerAttackProperties)player).getComboCount()).itemStack();
            }
            else event.itemStack =  event.killer.getMainHandItem();
        });
    }
}
