package oop_113412_SeanAntonio.Week07

class Weapon private constructor(val item: GameItem, val durability: Int, ) {
    companion object {
        fun forgeStarterSword(): Weapon {
            val sword = GameItem("Pedang Kayu Bapuk", 5, ItemRarity.COMMON)
            return Weapon(sword, 50)
        }

        fun forgeEpicSword(): Weapon {
            val sword = GameItem("Excalibur", 99, ItemRarity.EPIC)
            return Weapon(sword, 100)
        }
    }
}