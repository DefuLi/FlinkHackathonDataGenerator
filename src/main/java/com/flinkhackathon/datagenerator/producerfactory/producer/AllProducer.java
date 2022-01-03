package com.flinkhackathon.datagenerator.producerfactory.producer;

import com.flinkhackathon.datagenerator.kafka.KafkaFaced;
import com.flinkhackathon.datagenerator.pravega.BusinessDataPravegaProducer;

import java.util.concurrent.ExecutionException;

/**
 * Kafka、Pravega做为生产者
 *
 * @author Defu Li
 * @since 2022/1/4 0:02
 */
public class AllProducer implements IProducer {
    @Override
    public void sendMessage(String message) throws ExecutionException, InterruptedException {
        KafkaFaced.sendKafka(message);
        BusinessDataPravegaProducer.doWrite(message);
    }
}
