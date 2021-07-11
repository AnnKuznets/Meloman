fun main() {
    val purchase = 76549.00
    val totalPurchase = 5_000.00
    val discountStandart = 100.00
    val discount = totalPurchase * 0.05
    val meloman = true
    val discountMeloman = 0.01

    val result = if (totalPurchase > 1_001.00 && totalPurchase <= 10_000.00) {
        purchase - discountStandart
    } else if (totalPurchase >= 10_001.00) {
        purchase - discount
    } else purchase

    val discountMelomanTotal = result * discountMeloman
    val resultMeloman = result - discountMelomanTotal


    if (meloman == true) {
        println("Сумма покупок = $resultMeloman")
    } else println("Сумма покупок = $result")


}