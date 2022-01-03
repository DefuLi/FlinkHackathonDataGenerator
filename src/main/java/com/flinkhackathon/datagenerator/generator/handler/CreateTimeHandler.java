package com.flinkhackathon.datagenerator.generator.handler;

import com.flinkhackathon.datagenerator.model.BusinessDataBean;
import com.flinkhackathon.datagenerator.utils.RandomUtils;

import java.util.Date;

/**
 * 办理时间字段 处理器
 *
 * @author Defu Li
 * @since 2022/1/2 10:28
 */
public class CreateTimeHandler implements IBusinessHandler {

    private static final String CREATE_TIME_BEGIN = "2022-01-02";

    private static final String CREATE_TIME_END = "2022-01-03";

    @Override
    public void handle(BusinessDataBean businessDataBean) {
        Date date = RandomUtils.randomDate(CREATE_TIME_BEGIN, CREATE_TIME_END);
        businessDataBean.setCreateTime(date);
    }
}
