package com.flinkhackathon.datagenerator.kafka;

import com.flinkhackathon.datagenerator.constants.KafkaConstants;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Properties;

/**
 * 初始化Kafka生产者
 *
 * @author Defu Li
 * @since 2022/1/2 19:02
 */
public class KafkaClient {
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaClient.class);

    private static KafkaProducer<String, String> producer;

    static {
        Properties configs = initConfig();
        producer = new KafkaProducer<>(configs);
        LOGGER.info("kafka client init success!");
    }

    /**
     * 获取Kafka生产者
     *
     * @return Kafka producer
     */
    public static KafkaProducer<String, String> initKafkaProducer() {
        return producer;
    }

    private static Properties initConfig() {
        Properties properties = new Properties();
        properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, KafkaConstants.HOST);
        properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, StringSerializer.class.getName());
        properties.put(ProducerConfig.LINGER_MS_CONFIG, KafkaConstants.LINGER_MS);
        properties.put(ProducerConfig.BATCH_SIZE_CONFIG, KafkaConstants.BATCH_SIZE);
        return properties;
    }
}
