package com.example.maPluginTemplate

import net.mamoe.mirai.console.plugin.jvm.JvmPluginDescription
import net.mamoe.mirai.console.plugin.jvm.KotlinPlugin
import net.mamoe.mirai.utils.info


object PluginMain : KotlinPlugin(
    JvmPluginDescription(
        id = "org.example.mirai-plugin",
        name = "ExamplePlugin",
        version = "0.0.1"
    )
) {
    override fun onEnable() {
        logger.info { "Plugin loaded" }
    }
}
