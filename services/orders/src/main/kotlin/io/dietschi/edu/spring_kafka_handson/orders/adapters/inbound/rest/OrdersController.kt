package io.dietschi.edu.spring_kafka_handson.orders.adapters.inbound.rest

import io.dietschi.edu.spring_kafka_handson.orders.adapters.toModel
import io.dietschi.edu.spring_kafka_handson.orders.application.usecases.FetchOrdersUseCase
import io.dietschi.edu.spring_kafka_handson.orders.application.usecases.PlaceOrderUseCase
import io.dietschi.edu.spring_kafka_handson.orders.domain.model.Order
import io.swagger.v3.oas.annotations.Operation
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/orders")
class OrdersController(
    private val placeOrderUseCase: PlaceOrderUseCase,
    private val fetchOrdersUseCase: FetchOrdersUseCase
) {

    @Operation(summary = "Place a new order.")
    @PostMapping
    fun create(@RequestBody placeOrderRequest: PlaceOrderRequest) {
        placeOrderUseCase.placeOrder(placeOrderRequest.toModel())
    }

    @Operation(summary = "Get all orders.")
    @GetMapping
    fun all(): List<Order> = fetchOrdersUseCase.fetchOrders()
}