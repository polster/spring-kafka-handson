package io.dietschi.edu.spring_kafka_handson.orders.adapters.outbound.messaging

import io.dietschi.edu.spring_kafka_handson.schema.avro.OrderPlaced
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Repository

@Repository
class KafkaOrderRepository(
    private val template: KafkaTemplate<String, OrderPlaced>,
    //private val streamsFactory: StreamsBuilderFactoryBean
): OrderRepository {

    override fun events(): List<OrderPlaced> {
        TODO("Not yet implemented")
    }
}