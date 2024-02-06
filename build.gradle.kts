plugins {
    kotlin("jvm") version "1.9.22"
    id("com.github.weave-mc.weave-gradle") version "fac948db7f"
}

group = "com.example"
version = "1.0"

minecraft.version("1.8.9")

repositories {
    maven("https://jitpack.io")
    maven("https://repo.spongepowered.org/maven/")
}

dependencies {
    compileOnly("com.github.weave-mc:weave-loader:v0.2.5")
    compileOnly("org.spongepowered:mixin:0.8.5")
}

kotlin {
    jvmToolchain(17)
}
