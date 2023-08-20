package io.dietschi.edu.spring_kafka_handson.orders.adapters.inbound.rest

import java.util.UUID

data class PlaceOrderRequest(
    val customerId: UUID,
    val productId: UUID,
    val quantity: Int,
    val price: Double
)
