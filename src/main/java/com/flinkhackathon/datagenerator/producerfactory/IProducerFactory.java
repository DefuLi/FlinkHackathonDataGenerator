package com.flinkhackathon.datagenerator.producerfactory;

import com.flinkhackathon.datagenerator.producerfactory.producer.IProducer;

/**
 * 生产者工厂 接口
 *
 * @author Defu Li
 * @since 2022/1/3 23:54
 */
public interface IProducerFactory {
    IProducer createProducer();

    boolean isMatch(String type);

}
