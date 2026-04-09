package net.gekidolukas.wl_bc_compat.fabric;

import net.fabricmc.api.ModInitializer;

import net.gekidolukas.wl_bc_compat.WLBCCompatMod;

public final class WLBCCompatModFabric implements ModInitializer {
    @Override
    public void onInitialize() {

        WLBCCompatMod.init();
    }
}
