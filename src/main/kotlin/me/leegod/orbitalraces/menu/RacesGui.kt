package me.leegod.orbitalraces.menu

import com.cryptomorin.xseries.XMaterial
import com.cryptomorin.xseries.XSound
import me.leegod.orbitalraces.race.*
import me.lucko.helper.item.ItemStackBuilder
import me.lucko.helper.menu.Gui
import me.lucko.helper.menu.Item
import me.lucko.helper.menu.scheme.MenuScheme
import org.bukkit.entity.Player
import org.bukkit.event.inventory.ClickType

class RacesGui(player: Player) : Gui(player, 5, "&d&lOrbital &f&lRaces") {

    private val out: MenuScheme = MenuScheme()
        .mask("111000111")
        .mask("110000011")
        .mask("100000001")
        .mask("110000011")
        .mask("111000111")
    private val `in`: MenuScheme = MenuScheme()
        .mask("000111000")
        .mask("001101100")
        .mask("010111010")
        .mask("001101100")
        .mask("000111000")

    override fun redraw() {
        if (isFirstDraw) {
            val outPopulator = out.newPopulator(this)

            while (outPopulator.hasSpace())
                outPopulator.accept(
                    Item.builder(
                        ItemStackBuilder.of(XMaterial.GRAY_STAINED_GLASS_PANE.parseItem()!!)
                            .name(" ")
                            .build()
                    ).build()
                )

            val inPopulator = `in`.newPopulator(this)
            while (inPopulator.hasSpace())
                inPopulator.accept(
                    Item.builder(
                        ItemStackBuilder.of(XMaterial.LIGHT_GRAY_STAINED_GLASS_PANE.parseItem()!!)
                            .name(" ")
                            .build()
                    ).build()
                )
        }

        drawRaceButton(HumanRace)
        drawRaceButton(ElvesRace)
        drawRaceButton(DwarvesRace)
        drawRaceButton(HobbitsRace)
    }

    private fun drawRaceButton(race: Race) {
        setItem(firstEmpty, Item.builder(race.item)
            .bind(ClickType.LEFT) { _ ->
                player.closeInventory()
                XSound.UI_BUTTON_CLICK.play(player)
                ConfirmRacesGui(player, race).open()
            }
            .build())
    }

}