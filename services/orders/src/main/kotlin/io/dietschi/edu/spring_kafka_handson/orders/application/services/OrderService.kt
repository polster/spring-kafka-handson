package io.dietschi.edu.spring_kafka_handson.orders.application.services

import io.dietschi.edu.spring_kafka_handson.orders.adapters.outbound.messaging.OrderProducer
import io.dietschi.edu.spring_kafka_handson.orders.adapters.toEvent
import io.dietschi.edu.spring_kafka_handson.orders.application.usecases.FetchOrdersUseCase
import io.dietschi.edu.spring_kafka_handson.orders.application.usecases.PlaceOrderUseCase
import io.dietschi.edu.spring_kafka_handson.orders.domain.model.Order
import org.springframework.stereotype.Service

@Service
class OrderService(
    private val orderProducer: OrderProducer
): PlaceOrderUseCase, FetchOrdersUseCase {

    override fun placeOrder(order: Order) {
        orderProducer.event(order.toEvent())
    }

    override fun fetchOrders(): List<Order> {
        TODO("Not yet implemented")
    }
}