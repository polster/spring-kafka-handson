package io.dietschi.edu.spring_kafka_handson.orders.adapters.inbound.rest

import io.swagger.v3.oas.annotations.media.Schema
import java.util.UUID

@Schema(description = "Request for placing a new order.")
data class PlaceOrderRequest(
    val customerId: UUID,
    val productId: UUID,
    val quantity: Int,
    val price: Double
)
