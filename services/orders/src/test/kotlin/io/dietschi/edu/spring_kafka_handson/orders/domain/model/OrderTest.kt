package io.dietschi.edu.spring_kafka_handson.orders.domain.model

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import java.util.*

class OrderTest {

    @Test
    fun `should create order with unique id`() {

        // Given

        // When
        val order = Order(
            customerId = UUID.randomUUID(),
            productId = UUID.randomUUID(),
            quantity = 1,
            price = 1.0
        )

        // Then
        assert(order.id != UUID.randomUUID())
    }

    @Test
    fun `should create order passing validation`() {

        // Given

        // When
        val order = Order.validated(
            customerId = UUID.randomUUID(),
            productId = UUID.randomUUID(),
            quantity = 1,
            price = 1.0
        )

        // Then
        assert(order.id != UUID.randomUUID())
    }

    @Test
    fun `should throw exception when quantity is less than 1`() {

        // Given

        // When
        val exception = assertThrows<IllegalArgumentException> {
            Order.validated(
                customerId = UUID.randomUUID(),
                productId = UUID.randomUUID(),
                quantity = 0,
                price = 1.0
            )
        }

        // Then
        assertEquals("Quantity must be greater than 0", exception.message)
    }

    @Test
    fun `should throw exception when price is less than 1`() {

        // Given

        // When
        val exception = assertThrows<IllegalArgumentException> {
            Order.validated(
                customerId = UUID.randomUUID(),
                productId = UUID.randomUUID(),
                quantity = 1,
                price = 0.0
            )
        }

        // Then
        assertEquals("Price must be greater than 0", exception.message)
    }
}