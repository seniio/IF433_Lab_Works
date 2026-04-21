package oop_113412_SeanAntonio.Week09

fun main() {
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 50, -10.0, "CLOSED"),
        TradeLog("SOLUSDT", "LONG", 15, 25.0, "OPEN"),
        TradeLog("ETHUSDT", "LONG", 20, 40.0, "CLOSED"),
        TradeLog("BNBUSDT", "SHORT", 10, -2.5, "CLOSED")
    )
    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
    val winningTrades = closedTrades.filter { it.roe > 0 }
}