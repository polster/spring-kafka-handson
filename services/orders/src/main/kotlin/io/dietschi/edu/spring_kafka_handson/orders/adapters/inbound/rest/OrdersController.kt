package io.dietschi.edu.spring_kafka_handson.orders.adapters.inbound.rest

import io.dietschi.edu.spring_kafka_handson.orders.adapters.toModel
import io.dietschi.edu.spring_kafka_handson.orders.application.usecases.PlaceOrderUseCase
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/orders")
class OrdersController(
    private val placeOrderUseCase: PlaceOrderUseCase
) {

    @PostMapping
    fun create(@RequestBody placeOrderRequest: PlaceOrderRequest) {
        placeOrderUseCase.placeOrder(placeOrderRequest.toModel())
    }

    @GetMapping
    fun all(): List<PlaceOrderRequest> {
        // TODO
        return emptyList()
    }
}