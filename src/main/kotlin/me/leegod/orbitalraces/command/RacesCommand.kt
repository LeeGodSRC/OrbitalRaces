package me.leegod.orbitalraces.command

import com.cryptomorin.xseries.XSound
import me.leegod.orbitalraces.constant.PermissionConstants
import me.leegod.orbitalraces.menu.RacesGui
import me.lucko.helper.Commands

object RacesCommand {

    fun init() {
        Commands.create()
            .assertPlayer()
            .assertPermission(PermissionConstants.usePermission)
            .handler {
                val player = it.sender()

                XSound.ENTITY_HORSE_ARMOR.play(player)
                RacesGui(player).open()
            }.register("races")
    }

}