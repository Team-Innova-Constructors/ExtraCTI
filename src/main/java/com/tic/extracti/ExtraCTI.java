package com.tic.extracti;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ExtraCTI.MODID)
public class ExtraCTI {
    public static final String MODID = "extracti";
    public ExtraCTI() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
    }
}
