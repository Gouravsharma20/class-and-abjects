package com.littlelemon.emf4

interface PaymentMethod {
    fun pay(amount:Double)
    fun refund(amount:Double)
}

class CreditCard(
    private val cardNumber:Long,
    private val cardHolder:String
):PaymentMethod {
    override fun pay(amount: Double) {
        println("dear $cardHolder $amount has been debited from $cardNumber")
    }

    override fun refund(amount: Double) {
        println("Dear $cardHolder $amount has been refunded to $cardNumber successfully")
    }
}

class PayPal(
    private val phoneNumber:Long,
    private val pin:Int
):PaymentMethod {
    override fun pay(amount: Double) {
        TODO("Not yet implemented")
    }

    override fun refund(amount: Double) {
        TODO("Not yet implemented")
    }
}


class CryptoWallet(
    private val id:String,
    private val code:Int
):PaymentMethod {
    override fun pay(amount: Double) {
        TODO("Not yet implemented")
    }

    override fun refund(amount: Double) {
        TODO("Not yet implemented")
    }
}

fun main() {
    val paymentMethod:List<PaymentMethod> = listOf(
        CreditCard(4799598794895763,"Gourav Sharma"),
        PayPal(8750316283,201012),
        CryptoWallet("M6874H2586G6283S80263",130502)
    )

    println("Processing Payment:")
    paymentMethod.forEach { it.pay(500.00) }
    println()

    println("Processing Refund:")
    paymentMethod.forEach { it.refund(200.00) }
    println()
}