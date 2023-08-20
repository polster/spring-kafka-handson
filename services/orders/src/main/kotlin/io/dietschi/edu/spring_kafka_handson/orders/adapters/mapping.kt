package io.dietschi.edu.spring_kafka_handson.orders.adapters

import io.dietschi.edu.spring_kafka_handson.orders.adapters.inbound.rest.PlaceOrderRequest
import io.dietschi.edu.spring_kafka_handson.orders.domain.model.Order
import io.dietschi.edu.spring_kafka_handson.schema.avro.OrderPlaced
import java.time.ZoneOffset

fun PlaceOrderRequest.toModel(): Order {
    return Order(
        customerId = this.customerId,
        productId = this.productId,
        quantity = this.quantity,
        price = this.price
    )
}

fun Order.toEvent(): OrderPlaced {
    return OrderPlaced.newBuilder()
        .setId(this.id.toString())
        .setCustomerId(this.customerId.toString())
        .setProductId(this.productId.toString())
        .setQuantity(this.quantity)
        .setPrice(this.price)
        .setOrderDate(this.orderDateTime.toInstant(ZoneOffset.UTC))
        .build()
}