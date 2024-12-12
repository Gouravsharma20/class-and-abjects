package com.littlelemon.emf4

abstract class Animals(
    private val name:String,
    private val age: Double
) {
    abstract fun makeSound():String
    fun commonProperties() {
        println("Name = $name  Age = $age")
    }
}

class Dog(
    name: String,
    age: Double,
    private val breed:String
):Animals(
    name,
    age
) {
    override fun makeSound(): String = "Breed = $breed  ,Sound = Bark"
}


class Cat(
    name: String,
    age: Double,
    private val colour:String
):Animals(
    name,
    age
) {
    override fun makeSound(): String = "Colour = $colour  ,Sound = Mia"
}


class Birds(
    name: String,
    age: Double,
    private val canFly:Boolean
):Animals(
    name,
    age
) {
    override fun makeSound(): String = "CanFly = $canFly  , Sound = Chirp"
}

fun main() {
    val animalsProperties:List<Animals> = listOf(
        Dog("Coffee",2.6,"German-shepherd"),
        Cat("Creamy",1.6,"Golden"),
        Birds("Parrot",5.6,true),
        Dog("Cookie",4.6,"belgium"),
        Cat("Michane",1.6,"Grey"),
        Birds("Ostrich",2.6,false)
    )

}