package com.flinkhackathon.datagenerator.generator.handler;

import com.flinkhackathon.datagenerator.model.BusinessDataBean;
import com.flinkhackathon.datagenerator.utils.RandomUtils;

/**
 * 业务金额字段 处理器
 *
 * @author Defu Li
 * @since 2022/1/2 10:28
 */
public class BusinessAmountHandler implements IBusinessHandler {

    private static final int BUSINESS_AMOUNT_BASIC_MIN = 5;

    private static final int BUSINESS_AMOUNT_BASIC_MAX = 100;

    private static final int UNIT = 10000;

    @Override
    public void handle(BusinessDataBean businessDataBean) {
        int businessAmount = RandomUtils.randomGaussianGetId(BUSINESS_AMOUNT_BASIC_MIN, BUSINESS_AMOUNT_BASIC_MAX);
        businessDataBean.setBusinessAmount(businessAmount * UNIT);
    }
}
