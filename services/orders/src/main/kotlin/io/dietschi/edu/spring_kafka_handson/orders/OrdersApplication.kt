package io.dietschi.edu.spring_kafka_handson.orders

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class OrdersApplication {
}

fun main(args: Array<String>) {
    runApplication<OrdersApplication>(*args)
}