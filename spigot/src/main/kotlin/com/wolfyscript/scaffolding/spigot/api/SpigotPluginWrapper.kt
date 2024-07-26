package com.wolfyscript.scaffolding.spigot.api

import com.wolfyscript.scaffolding.PluginWrapper
import com.wolfyscript.scaffolding.common.api.into
import org.bukkit.plugin.Plugin

class SpigotPluginWrapper(val plugin: Plugin) : PluginWrapper

internal fun PluginWrapper.into() : SpigotPluginWrapper {
    return into<SpigotPluginWrapper>()
}