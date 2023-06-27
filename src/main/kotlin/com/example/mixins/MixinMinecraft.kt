package com.example.mixins

import net.minecraft.client.Minecraft
import org.spongepowered.asm.mixin.Mixin
import org.spongepowered.asm.mixin.injection.At
import org.spongepowered.asm.mixin.injection.Inject
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo

@Mixin(Minecraft::class)
class MixinMinecraft {
    @Inject(method = ["startGame"], at = [At("HEAD")])
    fun onStartGame(ci: CallbackInfo) {
        println("mixin")
    }
}