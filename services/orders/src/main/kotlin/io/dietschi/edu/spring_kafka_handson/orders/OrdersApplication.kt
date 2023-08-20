package io.dietschi.edu.spring_kafka_handson.orders

import io.dietschi.edu.spring_kafka_handson.orders.config.KafkaProperties
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties(KafkaProperties::class)
class OrdersApplication {
}

fun main(args: Array<String>) {
    runApplication<OrdersApplication>(*args)
}