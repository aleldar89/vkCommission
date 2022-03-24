import org.junit.Test

import org.junit.Assert.*

class InsidesKtTest {

    @Test
    fun commissionMastercardDefaultComm() {
        val amount = 75_000_00
        val previousAmount = 0
        val paySystem = "Mastercard"

        val result = commission(
            amount = amount,
            previousAmount = previousAmount,
            paySystem = paySystem
        )

        assertEquals(0, result)
    }

    @Test
    fun commissionMastercard() {
        val amount = 80_000_00
        val previousAmount = 0
        val paySystem = "Mastercard"

        val result = commission(
            amount = amount,
            previousAmount = previousAmount,
            paySystem = paySystem
        )

        assertEquals(50000, result)
    }

    @Test
    fun commissionMaestroDefaultComm() {
        val amount = 75_000_00
        val previousAmount = 0
        val paySystem = "Maestro"

        val result = commission(
            amount = amount,
            previousAmount = previousAmount,
            paySystem = paySystem
        )

        assertEquals(0, result)
    }

    @Test
    fun commissionMaestro() {
        val amount = 80_000_00
        val previousAmount = 0
        val paySystem = "Mastercard"

        val result = commission(
            amount = amount,
            previousAmount = previousAmount,
            paySystem = paySystem
        )

        assertEquals(50000, result)
    }

    @Test
    fun commissionVisaMinComm() {
        val amount = 1_000_00
        val previousAmount = 0
        val paySystem = "Visa"

        val result = commission(
            amount = amount,
            previousAmount = previousAmount,
            paySystem = paySystem
        )

        assertEquals(3500, result)
    }

    @Test
    fun commissionVisa() {
        val amount = 80_000_00
        val previousAmount = 0
        val paySystem = "Visa"

        val result = commission(
            amount = amount,
            previousAmount = previousAmount,
            paySystem = paySystem
        )

        assertEquals(60000, result)
    }

    @Test
    fun commissionMirMinComm() {
        val amount = 1_000_00
        val previousAmount = 0
        val paySystem = "Visa"

        val result = commission(
            amount = amount,
            previousAmount = previousAmount,
            paySystem = paySystem
        )

        assertEquals(3500, result)
    }

    @Test
    fun commissionMir() {
        val amount = 80_000_00
        val previousAmount = 0
        val paySystem = "Мир"

        val result = commission(
            amount = amount,
            previousAmount = previousAmount,
            paySystem = paySystem
        )

        assertEquals(60000, result)
    }

    @Test
    fun commission_VkPay() {
        val amount = 80_000_00
        val previousAmount = 0
        val paySystem = "VkPay"

        val result = commission(
            amount = amount,
            previousAmount = previousAmount,
            paySystem = paySystem
        )

        assertEquals(0, result)
    }
}