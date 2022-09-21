package me.leegod.orbitalraces.race

import com.cryptomorin.xseries.SkullUtils
import com.cryptomorin.xseries.XMaterial
import me.lucko.helper.item.ItemStackBuilder
import org.bukkit.inventory.ItemStack

interface Race {

    val name: String
    val description: List<String>
    val texture: String

    val item: ItemStack
        get() = ItemStackBuilder.of(XMaterial.PLAYER_HEAD.parseItem()!!)
            .transformMeta { SkullUtils.applySkin(it, texture) }
            .name(name)
            .lore(
                " ",
                "&8&m--------------------------------"
            )
            .lore(description)
            .lore(
                "&8&m--------------------------------",
                " "
            )
            .build()


}