package com.flinkhackathon.datagenerator.generator.handler;

import com.flinkhackathon.datagenerator.model.BusinessDataBean;
import com.flinkhackathon.datagenerator.utils.RandomUtils;

/**
 * 客户编号字段 处理器
 *
 * @author Defu Li
 * @since 2022/1/2 10:26
 */
public class CustomIdHandler implements IBusinessHandler {
    private static final int CUSTOM_ID_MIN = 10000;

    private static final int CUSTOM_ID_MAX = 11000;

    @Override
    public void handle(BusinessDataBean businessDataBean) {
        int customId = RandomUtils.randomGaussianGetId(CUSTOM_ID_MIN, CUSTOM_ID_MAX);
        businessDataBean.setCustomId(customId);
    }
}
