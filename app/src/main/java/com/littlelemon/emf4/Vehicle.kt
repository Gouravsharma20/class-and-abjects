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
):Vehicle(
    make,
    model,
    year
)  {
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
    val vehicles:List<Vehicle> = listOf(
        Car("Tata","Curve-ev",2021,4),
        MotorCycle("Hero","Splended",2018,false),
        Truck("Eicher","E756",2022,50000),
        MotorCycle("Honda","crosser",2016,true),
        Car("Mercenaries","Q2-ecv",2023,2),
        Truck("Tata","R246Y",2019,68700)
    )
    vehicles.forEach{
        it.displayProperties()
    }
}
