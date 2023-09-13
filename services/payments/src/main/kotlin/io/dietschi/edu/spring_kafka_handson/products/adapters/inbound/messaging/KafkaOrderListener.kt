package io.dietschi.edu.spring_kafka_handson.products.adapters.inbound.messaging

import io.dietschi.edu.spring_kafka_handson.schema.avro.OrderPlaced
import org.slf4j.LoggerFactory
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Component

@Component
class KafkaOrderListener: OrderListener {

    @KafkaListener(topics = ["local.exchange.cmd.orders.1"], groupId = "products")
    override fun event(orderPlaced: OrderPlaced) {

        log.info("Received order placed event: {}", orderPlaced)
    }

    companion object {
        private val log = LoggerFactory.getLogger(KafkaOrderListener::class.java)
    }
}