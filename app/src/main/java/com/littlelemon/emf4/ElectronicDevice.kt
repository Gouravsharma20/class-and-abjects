package com.littlelemon.emf4

abstract class ElectronicDevice(
    val brand:String,
    val price:Int
) {
    abstract fun uniqueFeatures()
    fun displayCommonProperties() {
        println("Brand:$brand Price:$price")
    }
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
        println("BatteryLife = $batteryLife years")
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
        println("Ramsize = $ramSize Gb")
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
        println("price = $price")
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
        it.displayCommonProperties()
    }
}