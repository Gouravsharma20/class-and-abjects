package com.littlelemon.emf4

import androidx.compose.material3.AlertDialogDefaults.shape

abstract class Shape {
    abstract fun area():Double
    abstract fun parameter():Double
}

class Circle(
    private val radius:Double
):Shape() {
    override fun area(): Double = Math.PI * radius *radius

    override fun parameter(): Double = Math.PI * 2 * radius
}

class Rectangle(
    private val length:Double,
    private val width:Double
):Shape() {
    override fun area(): Double = length * width

    override fun parameter(): Double = 2 * (length+width)
}


class Triangle(
    private val base:Double,
    private val height:Double,
    private val hypotenuse:Double
):Shape() {
    override fun area(): Double = .5 * base *height

    override fun parameter(): Double = base + height + hypotenuse
}

fun main() {
     val shapes:List<Shape> = listOf (
         Circle(4.8),
         Triangle(12.14,25.15,22.82),
         Rectangle(4.5,7.2)
     )
    shapes.forEach {
        shape -> println(
        "${Shape::class.simpleName} Area=${shape.area()}  Perimeter=${shape.parameter()}")
    }
}