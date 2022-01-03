package com.flinkhackathon.datagenerator.producerfactory.producer;

import com.flinkhackathon.datagenerator.kafka.KafkaFaced;
import com.flinkhackathon.datagenerator.producerfactory.producer.IProducer;

/**
 * Kafka作为生产者
 *
 * @author Defu Li
 * @since 2022/1/4 0:00
 */
public class KafkaProducer implements IProducer {
    @Override
    public void sendMessage(String message) {
        KafkaFaced.sendKafka(message);
    }
}
