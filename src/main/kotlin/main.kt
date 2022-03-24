fun main() {
    val amount = 80_000_00
    println("Размер комиссии за перевод ${amount.toDouble() / 100} рублей " +
            "составляет ${commission(amount, paySystem = "Visa")} копеек")
}