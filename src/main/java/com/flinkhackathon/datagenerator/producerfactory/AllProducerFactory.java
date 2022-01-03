package com.flinkhackathon.datagenerator.producerfactory;

import com.flinkhackathon.datagenerator.producerfactory.producer.AllProducer;
import com.flinkhackathon.datagenerator.producerfactory.producer.IProducer;
import org.springframework.stereotype.Component;

/**
 * kafka、pravega生产者工厂
 *
 * @author Defu Li
 * @since 2022/1/4 0:09
 */
@Component
public class AllProducerFactory implements IProducerFactory {
    private static final String TYPE = "all";

    @Override
    public IProducer createProducer() {
        return new AllProducer();
    }

    @Override
    public boolean isMatch(String type) {
        return TYPE.equals(type);
    }
}
