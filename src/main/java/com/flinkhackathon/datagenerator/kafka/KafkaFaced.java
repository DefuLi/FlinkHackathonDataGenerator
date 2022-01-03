package com.flinkhackathon.datagenerator.kafka;

import com.flinkhackathon.datagenerator.constants.KafkaConstants;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Kafka对外提供的入库能力
 *
 * @author Defu Li
 * @since 2022/1/2 19:11
 */
public class KafkaFaced {
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaFaced.class);

    /**
     * 发送到Kafka
     *
     * @param producer 生产者
     * @param message  消息
     */
    public static void sendKafka(KafkaProducer<String, String> producer, String message) {
        ProducerRecord<String, String> record = new ProducerRecord<>(KafkaConstants.TOPIC, message);
        producer.send(record, (recordMetadata, e) -> {
            if (recordMetadata != null) {
                LOGGER.info("send message success! topic:{}, message:{}", KafkaConstants.TOPIC, message);
            } else {
                LOGGER.error("send message failed!", e);
            }
        });
    }
}
