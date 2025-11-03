package com.tic.extracti;

import com.tic.extracti.Register.ExtraCtiModifier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ExtraCti.MODID)
public class ExtraCti {
    public static final String MODID = "extracti";
    public ExtraCti() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ExtraCtiModifier.register(modEventBus);
    }
}
