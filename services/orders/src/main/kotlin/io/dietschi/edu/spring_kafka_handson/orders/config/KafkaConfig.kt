package io.dietschi.edu.spring_kafka_handson.orders.config

import org.apache.kafka.clients.admin.NewTopic
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.kafka.config.TopicBuilder

@Configuration
class KafkaConfig {

    @Bean
    fun ordersTopic(kafkaProperties: KafkaProperties): NewTopic {

        val topic = kafkaProperties.topic("orders")
        return TopicBuilder.name(topic.name)
            .partitions(10)
            .replicas(1)
            .build()
    }
}