package com.littlelemon.emf4

import android.health.connect.datatypes.units.Temperature

abstract class ApplianceSystem (
    val brand:String,
    val powerConsumption:Int
) {
    abstract fun displayDetails()
}

class WashingMachine(
    brand: String,
    powerConsumption: Int,
    val loadCapacity:Int
):ApplianceSystem(
    brand,
    powerConsumption
) {
    override fun displayDetails() {
        println("Washing machine is of $brand brand with capacity $loadCapacity and consumes $powerConsumption watt power!")
    }
}

class Refrigerator(
    brand: String,
    powerConsumption: Int,
    val refrigeration:Int):ApplianceSystem(brand, powerConsumption) {
    override fun displayDetails() {
        println("Washing machine is of $brand brand with refrigeration capacity $refrigeration and consumes $powerConsumption watt power!")
    }
    }

class Microwave(brand: String,powerConsumption: Int,val temperature:Int):ApplianceSystem(brand, powerConsumption) {
    override fun displayDetails() {
        println("Microwave is of brand $brand with Temperature capasity $temperature and consumes power $powerConsumption")
    }

}

fun main() {
    val appliance1 = WashingMachine("LG",240,295)
    val appliance2 = Refrigerator("Samsung",260,5)
    val appliance3 = Microwave("Whirlpool",220,1800)

    appliance1.displayDetails()
    appliance2.displayDetails()
    appliance3.displayDetails()

}
