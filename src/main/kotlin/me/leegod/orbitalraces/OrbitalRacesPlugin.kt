package me.leegod.orbitalraces

import me.leegod.orbitalraces.command.RacesCommand
import me.lucko.helper.plugin.ExtendedJavaPlugin
import me.lucko.helper.plugin.ap.Plugin
import me.lucko.helper.plugin.ap.PluginDependency

@Plugin(
    name = "OrbitalRaces",
    version = "1.0.0-SNAPSHOT",
    apiVersion = "1.13",
    depends = [PluginDependency("kotlin-stdlib")]
)
class OrbitalRacesPlugin : ExtendedJavaPlugin() {

    override fun enable() {
        RacesCommand.init()
    }

}