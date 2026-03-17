package oop_113412_SeanAntonio.Week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> println("Awas! Muncul monster: ${event.monsterName}")
        is BattleState.LootDropped -> {

            val (name, dmg, rarity) = event.item
            println("Dapat Loot: $name | Damage: $dmg | Rarity: $rarity")
        }
        is BattleState.GameOver -> println("Game Over: ${event.reason}")
        BattleState.SafeZone -> println("Kamu berada di zona aman.")
    }
}