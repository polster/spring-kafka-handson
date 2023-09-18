package io.dietschi.edu.spring_kafka_handson.products.adapters.inbound.messaging

import io.dietschi.edu.spring_kafka_handson.schema.avro.OrderPlaced

interface OrderListener {

    fun event(orderPlaced: OrderPlaced)
}