package com.example.kotlin.grammar

open class Human(
    private val name: String = "Default Park"
) {

    constructor(name: String, age: Int) : this(name) {
        println("My name is $name, $age years old")
    }

    init {
        println("Hello !!")
    }

    fun eatingFood() {
        println("My name is $name. This is good~")
    }
}

class Korean(
    private val from: String
) : Human() {

    fun info() {
        println("I'm ${from}. ${eatingFood()}")
    }
}

fun main() {
    val human = Human("Kim")
    human.eatingFood()

    val defaultHuman = Human()
    defaultHuman.eatingFood()

    Human("Song", 30)

    Korean("Korean").info()
}
