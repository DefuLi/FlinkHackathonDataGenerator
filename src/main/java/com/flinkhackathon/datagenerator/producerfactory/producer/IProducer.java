package com.flinkhackathon.datagenerator.producerfactory.producer;

import java.util.concurrent.ExecutionException;

/**
 * 生产者类型 接口
 *
 * @author Defu Li
 * @since 2022/1/3 23:58
 */
public interface IProducer {
    void sendMessage(String message) throws ExecutionException, InterruptedException;
}
