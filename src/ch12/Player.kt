package ch12

class Player {
    val name = "madrigal"
        get() = field.capitalize()

    fun castFireball(numFireball: Int = 2) =
        println("A glass of Fireball springs into existence.(x$numFireball)")
}