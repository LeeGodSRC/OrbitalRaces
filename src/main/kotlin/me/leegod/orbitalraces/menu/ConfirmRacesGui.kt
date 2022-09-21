package me.leegod.orbitalraces.menu

import com.cryptomorin.xseries.XMaterial
import com.cryptomorin.xseries.XSound
import me.leegod.orbitalraces.race.Race
import me.lucko.helper.item.ItemStackBuilder
import me.lucko.helper.menu.Gui
import me.lucko.helper.menu.Item
import me.lucko.helper.menu.scheme.MenuScheme
import org.bukkit.ChatColor
import org.bukkit.EntityEffect
import org.bukkit.entity.Player
import org.bukkit.event.inventory.ClickType

class ConfirmRacesGui(player: Player, private val race: Race) : Gui(player, 3, "&c&lAre You Sure?") {

    private val scheme = MenuScheme()
        .mask("111111111")
        .mask("000000000")
        .mask("111111111")

    override fun redraw() {
        val populator = scheme.newPopulator(this)
        while (populator.hasSpace())
            populator.accept(Item.builder(
                ItemStackBuilder.of(XMaterial.BLACK_STAINED_GLASS_PANE.parseItem()!!)
                    .name(" ")
                    .build()
            ).build())

        setItem(11, Item.builder(ItemStackBuilder.of(XMaterial.REDSTONE_BLOCK.parseItem()!!)
                .name("&c&lYes")
                .lore("&7Click to confirm")
                .build())
            .bind(ClickType.LEFT) { _ ->
                player.closeInventory()
                handleConfirmButtonClicked()
            }
            .build())

        setItem(13, Item.builder(race.item).build())

        setItem(15, Item.builder(ItemStackBuilder.of(XMaterial.LAPIS_BLOCK.parseItem()!!)
                .name("&9&lNo")
                .lore("&7Click to cancel")
                .build())
            .bind(ClickType.LEFT) { event ->
                player.closeInventory()
                RacesGui(player).open()
            }
            .build())
    }

    private fun handleConfirmButtonClicked() {
        player.sendTitle(
            "${ChatColor.GOLD}You are now",
            ChatColor.translateAlternateColorCodes('&', race.name),
        10,
        100,
        10)
        XSound.ENTITY_PLAYER_LEVELUP.play(player)
        player.playEffect(EntityEffect.TOTEM_RESURRECT);
    }
}