package com.flinkhackathon.datagenerator.generator.handler;

import com.flinkhackathon.datagenerator.model.BusinessDataBean;

/**
 * 业务数据生成器handler
 *
 * @author Defu Li
 * @since 2022/1/2 1:16
 */
public interface IBusinessHandler {
    void handle(BusinessDataBean businessDataBean);
}
