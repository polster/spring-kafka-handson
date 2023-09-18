package io.dietschi.edu.spring_kafka_handson.products

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ProductsApplication {
}

fun main(args: Array<String>) {
    runApplication<ProductsApplication>(*args)
}