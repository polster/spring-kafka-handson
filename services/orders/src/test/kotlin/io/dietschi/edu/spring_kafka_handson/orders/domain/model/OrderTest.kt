package io.dietschi.edu.spring_kafka_handson.orders.domain.model

import org.junit.jupiter.api.Test
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
}