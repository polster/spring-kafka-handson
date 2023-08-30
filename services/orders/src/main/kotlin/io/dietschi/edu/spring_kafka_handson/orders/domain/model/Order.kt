package io.dietschi.edu.spring_kafka_handson.orders.domain.model

import java.time.LocalDateTime
import java.util.UUID

data class Order(
    val id: UUID = UUID.randomUUID(),
    val customerId: UUID,
    val productId: UUID,
    val quantity: Int,
    val price: Double,
    val orderDateTime: LocalDateTime = LocalDateTime.now()
) {
    companion object {
        fun validated(
            customerId: UUID,
            productId: UUID,
            quantity: Int,
            price: Double
        ): Order {
            require(quantity > 0) { "Quantity must be greater than 0" }
            require(price > 0) { "Price must be greater than 0" }

            return Order(
                customerId = customerId,
                productId = productId,
                quantity = quantity,
                price = price
            )
        }
    }
}
