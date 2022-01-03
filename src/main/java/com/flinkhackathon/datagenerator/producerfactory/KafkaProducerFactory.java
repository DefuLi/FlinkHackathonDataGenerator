package com.flinkhackathon.datagenerator.producerfactory;

import com.flinkhackathon.datagenerator.producerfactory.producer.IProducer;
import com.flinkhackathon.datagenerator.producerfactory.producer.KafkaProducer;
import org.springframework.stereotype.Component;

/**
 * kafka生产者工厂
 *
 * @author Defu Li
 * @since 2022/1/4 0:00
 */
@Component
public class KafkaProducerFactory implements IProducerFactory {
    private static final String TYPE = "kafka";

    @Override
    public IProducer createProducer() {
        return new KafkaProducer();
    }

    @Override
    public boolean isMatch(String type) {
        return TYPE.equals(type);
    }
}
