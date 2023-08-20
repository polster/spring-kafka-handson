package io.dietschi.edu.spring_kafka_handson.orders.config

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix = "app.kafka")
data class KafkaProperties(
    val topics: Map<String, Topic>
)

data class Topic(
    val name: String
)