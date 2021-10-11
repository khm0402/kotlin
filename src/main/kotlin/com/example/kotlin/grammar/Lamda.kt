package com.example.kotlin.grammar


val square1: (Int) -> (Int) = { number -> number * number }
val square2 = { number: Int -> number * number }

val nameAge = { name: String, age: Int ->
    println("My name is ${name}. I'm ${age}.")
}

fun main() {
    println(square1(10))
    println(square2(10))
    println(nameAge("Kim", 20))

    val a = "Kim said"
    val b = "Song said"
    println(a.pizzaIsGreat())
    println(b.pizzaIsGreat())

    println(extendString("Kim", 20))

    println(calculateGrade(97))

    println(invokeLamda { it > 3.23 })
}

// 확장함수
val pizzaIsGreat: String.() -> String = {
    "$this pizza is good."
}

fun extendString(name: String, age: Int): String {
    val introduceMyself: String.(Int) -> String = {
        "I am $this and $it years old"
    }

    return name.introduceMyself(age)
}

// 람다 Return
val calculateGrade: (Int) -> String = {
    when (it) {
        in 0..40 -> "fail"
        in 41..70 -> "pass"
        in 71..100 -> "success"
        else -> "Error"
    }
}

// 람다 표현 방법
fun invokeLamda(lamda: (Double) -> Boolean): Boolean {
    return lamda(5.234)
}




