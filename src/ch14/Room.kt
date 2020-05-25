package ch14

open class Room(val name: String) {
    fun description() = "Room: $name"
    fun load() = "Nothing much to see here..."
}

class TownSquare : Room("Town Square")