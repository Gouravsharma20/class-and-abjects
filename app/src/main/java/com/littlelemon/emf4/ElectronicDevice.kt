package com.littlelemon.emf4

abstract class ElectronicDevice(
    val brand:String,
    val price:Int
) {
    abstract fun uniqueFeatures()
}

class SmartPhone(
    brand: String,
    price: Int,
    private val batteryLife:Double
):ElectronicDevice(
    brand,
    price
) {
    override fun uniqueFeatures() {
        println("$brand phone is of price $price and has a $batteryLife years")
    }
}


class Laptop(
    brand: String,
    price:Int,
    private var ramSize:Int
):ElectronicDevice(
    brand,
    price
) {
    override fun uniqueFeatures() {
        println("$brand of rupees $price has a ramsize of $ramSize gb")
    }
}

class Tablet(
    brand:String,
    price:Int,
    private val screenSize:Double
):ElectronicDevice(
    brand,
    price
) {
    override fun uniqueFeatures() {
        println("$brand has a screensize of $screenSize of price $price")
    }
}

fun main() {
    val device:List<ElectronicDevice> = listOf(
        SmartPhone("Vivo",25655,2.9),
        SmartPhone("Samsung",19999,2.5),
        Tablet("Oppo",18999,8.2),
        Laptop("Dell",49999,32),
        Laptop("Mi-Notebook",47255,16),
        Tablet("Apple",57000,14.45)
    )
    device.forEach{
        it.uniqueFeatures()
    }
}