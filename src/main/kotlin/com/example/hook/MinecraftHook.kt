package com.example.hook

import net.weavemc.loader.api.Hook
import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type
import org.objectweb.asm.tree.ClassNode
import org.objectweb.asm.tree.MethodInsnNode

class MinecraftHook: Hook("net/minecraft/client/Minecraft") {
    override fun transform(node: ClassNode, cfg: AssemblerConfig) {
        node.methods.stream()
            .filter {
                it.name.equals("startGame")
            }
            .findFirst().orElseThrow()
            .instructions.insert(
                MethodInsnNode(
                    Opcodes.INVOKESTATIC,
                    Type.getInternalName(MinecraftHook::class.java),
                    "onStartGame",
                    "()V"
                )
            )
    }
}