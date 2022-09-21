package me.leegod.orbitalraces.race

object HumanRace : Race {
    override val name: String
        get() = "&e&lHumans"
    override val description: List<String>
        get() = listOf(
            "&7&oWhy is it that this whole continent was ruled by humans?",
            "&7&oIs it because we are a race that specializes in violence?",
            "&7&oWe can't use magic like the Elves",
            "&7&onor do we have the longevity of the Dwarves.",
            "&7&oWhy were we able to rule the continent?",
            "&7&oIs it because we were masters of war?",
            "&7&oI tell you it is not! We fought and survived because we are weak!"
        )
    override val texture: String
        get() = "eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMTk5ZGQ3YzFkZDRhZmNmZGZiOTdjMjg0MzZlNTZmMGFiNmRkZWQzYmQwYmY1ZGIyYWQzZmM0ZTM0NDQ3YzU1MCJ9fX0="
}