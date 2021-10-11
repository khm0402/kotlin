package com.example.kotlin.grammar

class Book private constructor(val id : Int, val name : String) {

    companion object : IdProvider {

        override fun getId(): Int {
            return 1234
        }

        val myBook = "name"
        fun create() = Book(0, myBook)
    }
}

interface IdProvider {
    fun getId() : Int
}

fun main() {
    val book = Book.Companion.create()
    val bookId = Book.Companion.getId()

    println("${book.id}, ${book.name}")
    println("${bookId}, ${book.name}")
}
