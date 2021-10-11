package com.example.kotlin.grammar

data class Ticket(
    val companyName : String,
    val name : String,
    var date : String,
    var seatNumber : Int
)

/**
 * data class 선언 시 아래 메소드 자동적으로 생성
 * toString(), hashCode(), equals(), copy()
 */

fun main() {
    val ticketA = Ticket("koreanAir", "Kim", "2021-10-10", 14)
}
