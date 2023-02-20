package com.teampotato.unmending;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod(Main.ID)
public class Main {
    public static final String ID = "unmending";
    public Main() {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
