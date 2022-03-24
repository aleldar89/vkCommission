const val MASTERCARD_MAESTRO_LIMIT = 75_000_00
const val MASTERCARD_MAESTRO_COMM = 0.006
const val VISA_MIR_COMM = 0.0075
const val VISA_MIR_MINCOMM = 3500
const val DEFAULT_COMMISSION = 0

fun commission(
    amount: Int,
    previousAmount: Int = 0,
    paySystem: String = "VkPay"
): Int {

    val actualCommission = when (paySystem) {
        "Mastercard", "Maestro" -> {
            if (amount + previousAmount <= MASTERCARD_MAESTRO_LIMIT) DEFAULT_COMMISSION
            else (amount * MASTERCARD_MAESTRO_COMM + 2000).toInt()
        }
        "Visa", "Мир" -> {
            if ((amount * VISA_MIR_COMM).toInt() < VISA_MIR_MINCOMM) VISA_MIR_MINCOMM
            else (amount * VISA_MIR_COMM).toInt()
        }
        else -> {
            DEFAULT_COMMISSION
        }
    }
    return actualCommission

}