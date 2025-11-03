package com.tic.extracti.Register;

import com.tic.extracti.Content.Modifier.TestModifier;
import com.tic.extracti.ExtraCti;
import net.minecraftforge.eventbus.api.IEventBus;
import slimeknights.tconstruct.library.modifiers.util.ModifierDeferredRegister;
import slimeknights.tconstruct.library.modifiers.util.StaticModifier;

public class ExtraCtiModifier {
    public static ModifierDeferredRegister MODIFIERS = ModifierDeferredRegister.create(ExtraCti.MODID);
    public static final StaticModifier<TestModifier> TEST_MODIFIER_STATIC_MODIFIER = MODIFIERS.register("testmodifier", TestModifier::new);
    public static void register(IEventBus bus){
        MODIFIERS.register(bus);
    }
}
