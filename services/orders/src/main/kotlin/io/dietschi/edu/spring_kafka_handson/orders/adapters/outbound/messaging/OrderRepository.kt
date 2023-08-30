package io.dietschi.edu.spring_kafka_handson.orders.adapters.outbound.messaging

import io.dietschi.edu.spring_kafka_handson.schema.avro.OrderPlaced

interface OrderRepository {

    fun events(): List<OrderPlaced>
}