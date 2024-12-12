package com.littlelemon.emf4

interface Driveable {
    fun start()
    fun stop()
    fun drive()
}

class Cars(
    private val make:String,
    private val model:String
):Driveable {
    override fun start() {
        println("$make $model is starting")
    }

    override fun stop() {
        println("$make $model is stopped")
    }

    override fun drive() {
        println("$make $model is being drove")
    }
}


class Bike(
    private val make:String,
    private val model:String
):Driveable {
    override fun start() {
        println("$make $model is starting")
    }

    override fun stop() {
        println("$make $model is stopped")
    }

    override fun drive() {
        println("$make $model is being drove")
    }
}


class Trucks(
    private val companyName:String,
    private val capacity:Int
):Driveable {
    override fun start() {
        println("$companyName is starting")
    }

    override fun stop() {
        println("$companyName is stopped")
    }

    override fun drive() {
        println("$companyName is being drove")
    }
}

fun main() {
    val vehicle1 = Cars("Tata","Curve")
    val vehicle2 = Bike("Honda","Spender")
    val vehicle3 = Trucks("Tata",20000)

    println(vehicle1)
    println(vehicle2)
    println(vehicle3)

}