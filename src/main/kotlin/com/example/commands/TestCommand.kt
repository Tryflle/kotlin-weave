package com.example.commands

import net.minecraft.client.Minecraft
import net.minecraft.util.ChatComponentText
import net.weavemc.loader.api.command.Command

class TestCommand: Command("test", "aliases") {
    override fun handle(args: Array<out String>) {
        Minecraft.getMinecraft().thePlayer.addChatMessage(ChatComponentText("Heyyy i am a test!"))
    }
}