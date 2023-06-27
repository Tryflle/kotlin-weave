package com.example

import com.example.commands.TestCommand
import com.example.listener.RenderGameOverlayListener
import net.weavemc.loader.api.ModInitializer
import net.weavemc.loader.api.command.CommandBus
import net.weavemc.loader.api.event.EventBus

class ExampleMod: ModInitializer {
    override fun preInit() {
        println("Weave kotlin works")

        CommandBus.register(TestCommand())

        EventBus.subscribe(RenderGameOverlayListener())
    }
}
