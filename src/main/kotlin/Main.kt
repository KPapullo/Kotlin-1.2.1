const val COMMISSION = 75
const val MIN_COMMISION = 3500

fun main() {

    print("Введите сумму перевода в рублях: ")
    var amount = readLine()?.toInt() ?: return

    val commissionForTransfer = if ((amount * 100 * COMMISSION) / 10000 < MIN_COMMISION) MIN_COMMISION else amount * 100 * COMMISSION / 10000
    val commissionForTransferRuble: Double = commissionForTransfer.toDouble() / 100
    println("Комиссия  за перевод: $commissionForTransferRuble рублей")

}







