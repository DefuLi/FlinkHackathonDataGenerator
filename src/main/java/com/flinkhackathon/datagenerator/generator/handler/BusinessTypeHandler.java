package com.flinkhackathon.datagenerator.generator.handler;

import com.flinkhackathon.datagenerator.model.BusinessDataBean;
import com.flinkhackathon.datagenerator.utils.RandomUtils;

/**
 * 业务类型字段 处理器
 *
 * @author Defu Li
 * @since 2022/1/2 10:27
 */
public class BusinessTypeHandler implements IBusinessHandler {
    private static final int BUSINESS_TYPE_MIN = 1;

    private static final int BUSINESS_TYPE_MAX = 10;

    @Override
    public void handle(BusinessDataBean businessDataBean) {
        int businessType = RandomUtils.randomGaussianGetId(BUSINESS_TYPE_MIN, BUSINESS_TYPE_MAX);
        businessDataBean.setBusinessType(businessType);
    }
}
