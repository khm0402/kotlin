package com.example.kotlin.grammar

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.slf4j.LoggerFactory
import org.springframework.test.context.junit.jupiter.SpringExtension

// @ExtendWith(SpringExtension::class)
class BasicTest {

    private val logger = LoggerFactory.getLogger(BasicTest::class.java)

    @Test
    fun `기본문법1`() {
        val resultIsNotNull = getResult(10, " 결과")
        logger.info(">>>> 기본문법1 notNull : {}", resultIsNotNull)

        val resultIsNull = getResult(20, null)
        logger.info(">>>> 기본문법1 isNull : {}", resultIsNull)
    }

    private fun getResult(number: Int, value: String?): String {
        return number.toString() + (value ?: " Null 값이 존재합니다.")
    }

    @Test
    fun `기본문법2`() {
        val email: String? = "abc@test.com"
        email?.let {
            val result = "my email is $it"
            logger.info(">>>> 기본문법2 - let function : {}", result)
        }

    }
}
