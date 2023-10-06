package io.dietschi.edu.spring_kafka_handson.orders.adapters.outbound.messaging

import io.dietschi.edu.spring_kafka_handson.orders.config.KafkaProperties
import io.dietschi.edu.spring_kafka_handson.schema.avro.OrderPlaced
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Component

@Component
class KafkaOrderProducer(
    private val kafkaTemplate: KafkaTemplate<String, OrderPlaced>,
    kafkaProperties: KafkaProperties
): OrderProducer {

    private val topic = kafkaProperties.topic("orders")

    override fun event(orderPlaced: OrderPlaced) {
        kafkaTemplate.send(topic.name, orderPlaced)
    }
}