package com.flinkhackathon.datagenerator.generator.handler;

import com.flinkhackathon.datagenerator.model.BusinessDataBean;

/**
 * 客户编号字段 处理器
 *
 * @author Defu Li
 * @since 2022/1/2 10:26
 */
public class CustomIdHandler implements IBusinessHandler {
    private static int customId = 10001;

    @Override
    public void handle(BusinessDataBean businessDataBean) {
        businessDataBean.setCustomId(customId++);
    }
}
