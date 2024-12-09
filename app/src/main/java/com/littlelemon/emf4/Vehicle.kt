package com.littlelemon.emf4

abstract class Vehicle(
    val make:String,
    val model:String,
    val year:Int
) {
    abstract fun displayProperties()
}

class Car(
    make: String,
    model: String,
    year: Int,
    val numberOfDoors:Int
):Vehicle(
    make,
    model,
    year
) {
    override fun displayProperties() {
        println("$make is of model $model and year $year")
    }
}

class MotorCycle(
    make: String,
    model: String,
    year: Int,
    private val sideCar:Boolean
):Vehicle(make, model, year)  {
    override fun displayProperties() {
        println("$make is of model $model and year $year and have side car = $sideCar")
    }
}


class Truck(
    make: String,
    model: String,
    year: Int,
    private val loadCapacity:Int
):Vehicle(make, model, year)  {
    override fun displayProperties() {
        println("$make is of model $model and year $year and have a load capasity of $loadCapacity Liters")
    }
}

fun main() {
    val vehicle1 = Car("TATA","Curve-ev",2024,4)
    val vehicle2 = MotorCycle("Hero","Spender",2018,false)
    val vehicle3 = Truck("Eicher","E555",2021,50000)
    println(vehicle1)
    println(vehicle2)
    println(vehicle3)
}