package com.littlelemon.emf4

abstract class Animal(
    val species:String
){
    abstract fun move():String
    abstract fun eat():String
}

class Bird(
    species: String,
):Animal(
    species
) {
    override fun eat(): String {
        return "Bird eats chillies"
    }

    override fun move(): String {
        return "Bird flies"
    }
}

class Fish(
    species: String
):Animal(
    species
) {
    override fun move(): String {
        return "Fish swims"
    }

    override fun eat(): String {
        return "eats pulse"
    }
}

class Mammals(
    species: String
):Animal(
    species
) {
    override fun eat(): String {
        return "Mammals eat grains"
    }

    override fun move(): String {
        return "Mammals moves using legs"
    }
}


fun main() {
    val animals:List<Animal> = listOf(
        Bird("HomingBird"),
        Fish("Gold-Fish"),
        Mammals("Chimpanzee")
    )
}