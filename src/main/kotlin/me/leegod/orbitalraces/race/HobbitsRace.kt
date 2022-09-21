package me.leegod.orbitalraces.race

object HobbitsRace: Race {
    override val name: String
        get() = "&e&lHobbits"
    override val description: List<String>
        get() = listOf(
            "&7&oHobbits really are amazing creatures",
            "&7&oas I have said before. You can learn all that there is to know about their ways in a month",
            "&7&oand yet after a hundred years they can still surprise you at a pinch."
        )
    override val texture: String
        get() = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOTQ0MTk5Mzk4MDY2NjdjMmFjNjg3YmY0MzlkNmE2MmQwZmU3YjBlMjY4NDJkYTQyYjNiMzU1YzU0ZTM5ZDk5YiJ9fX0="
}