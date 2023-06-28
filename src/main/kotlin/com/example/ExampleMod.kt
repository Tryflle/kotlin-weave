package com.example

import com.example.commands.TestCommand
import com.example.listener.RenderGameOverlayListener
import net.minecraft.client.Minecraft
import net.minecraft.util.ChatComponentText
import net.weavemc.loader.api.ModInitializer
import net.weavemc.loader.api.command.CommandBus
import net.weavemc.loader.api.event.EventBus
import net.weavemc.loader.api.event.KeyboardEvent
import org.lwjgl.input.Keyboard

class ExampleMod: ModInitializer {
    override fun preInit() {
        println("Weave kotlin works")

        CommandBus.register(TestCommand())

        EventBus.subscribe(KeyboardEvent::class.java) {
            if (Minecraft.getMinecraft().currentScreen == null && it.keyState) {
                Minecraft.getMinecraft().thePlayer?.addChatMessage(
                    ChatComponentText("Key pressed: ${Keyboard.getKeyName(it.keyCode)}")
                )
            }
        }

        EventBus.subscribe(RenderGameOverlayListener())
    }
}
