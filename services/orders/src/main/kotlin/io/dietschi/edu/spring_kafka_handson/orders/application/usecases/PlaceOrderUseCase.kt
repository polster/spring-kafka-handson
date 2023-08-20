package io.dietschi.edu.spring_kafka_handson.orders.application.usecases

import io.dietschi.edu.spring_kafka_handson.orders.domain.model.Order

interface PlaceOrderUseCase {

    fun placeOrder(order: Order)
}