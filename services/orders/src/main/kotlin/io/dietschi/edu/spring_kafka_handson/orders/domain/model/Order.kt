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
)
