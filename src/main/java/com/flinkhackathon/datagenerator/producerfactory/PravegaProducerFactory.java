package com.flinkhackathon.datagenerator.producerfactory;

import com.flinkhackathon.datagenerator.producerfactory.producer.IProducer;
import com.flinkhackathon.datagenerator.producerfactory.producer.PravegaProducer;
import org.springframework.stereotype.Component;

/**
 * pravega生产者工厂
 *
 * @author Defu Li
 * @since 2022/1/4 0:08
 */
@Component
public class PravegaProducerFactory implements IProducerFactory {
    private static final String TYPE = "pravega";

    @Override
    public IProducer createProducer() {
        return new PravegaProducer();
    }

    @Override
    public boolean isMatch(String type) {
        return TYPE.equals(type);
    }
}
