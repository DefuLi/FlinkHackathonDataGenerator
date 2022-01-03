package com.flinkhackathon.datagenerator.producerfactory.producer;

import com.flinkhackathon.datagenerator.pravega.BusinessDataPravegaProducer;

import java.util.concurrent.ExecutionException;

/**
 * Pravega作为生产者
 *
 * @author Defu Li
 * @since 2022/1/4 0:01
 */
public class PravegaProducer implements IProducer {
    @Override
    public void sendMessage(String message) throws ExecutionException, InterruptedException {
        BusinessDataPravegaProducer.doWrite(message);
    }
}
