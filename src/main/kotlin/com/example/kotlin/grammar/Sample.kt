package com.example.kotlin.grammar

object CarFactory {
    val cars = mutableListOf<Car>()

    fun makeCar(horsePower: Int) : Car {
        val car = Car(horsePower)
        cars.add(car)
        return car
    }
}

data class Car(
    val horsePower : Int
)

fun main() {
    val car1 = CarFactory.makeCar(100)
    var car2 = CarFactory.makeCar(200)

    println(car1)
    println(car2)
    println(CarFactory.cars.size)
}
