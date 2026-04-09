package net.gekidolukas.wl_bc_compat.forge;

import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import net.gekidolukas.wl_bc_compat.WLBCCompatMod;

@Mod(WLBCCompatMod.MODID)
public final class WLBCCompatModForge {
    @SuppressWarnings(("removal"))
    public WLBCCompatModForge() {
        // Submit our event bus to let Architectury API register our content on the right time.
        EventBuses.registerModEventBus(WLBCCompatMod.MODID, FMLJavaModLoadingContext.get().getModEventBus());


        WLBCCompatMod.init();
    }
}
