package com.littlelemon.emf4

abstract class Properties(
    private val tittle:String,
    private val duration:Int,
    private val rating: Double
) {
    open fun `displayDetails`() {
        println("Tittle:$tittle is of duration $duration and rating is$rating")
    }
}

class Movie(
    tittle:String,
    duration:Int,
    rating:Double
):Properties(
    tittle,
    duration,
    rating
) {
    override fun displayDetails() {
        super.displayDetails()
    }
}

class TvShow(
    tittle: String,
    duration: Int,
    rating: Double
):Properties(
    tittle,
    duration,
    rating
) {
    override fun displayDetails() {
        super.displayDetails()
    }
}

class Documentary(
    tittle: String,
    duration: Int,
    rating: Double
):Properties(
    tittle,
    duration,
    rating
) {
    override fun displayDetails() {
        super.displayDetails()
    }
}

fun main() {
    val entertainment1 = TvShow("Hey-Melody",120,7.8)
    val entertainment2 = Documentary("Kashmir files",180,8.2)
    val entertainment3 = Movie("Pushpa",199,9.1)
}