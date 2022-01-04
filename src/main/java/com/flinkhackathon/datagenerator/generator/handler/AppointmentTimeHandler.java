package com.flinkhackathon.datagenerator.generator.handler;

import com.flinkhackathon.datagenerator.model.BusinessDataBean;
import com.flinkhackathon.datagenerator.utils.RandomUtils;

import java.util.Date;

/**
 * 预约处理时间字段 处理器
 *
 * @author Defu Li
 * @since 2022/1/2 10:29
 */
public class AppointmentTimeHandler implements IBusinessHandler {
    private static final String APPOINTMENT_TIME_BEGIN = "2022-01-03";

    private static final String APPOINTMENT_TIME_END = "2022-01-15";

    @Override
    public void handle(BusinessDataBean businessDataBean) {
        Date date = RandomUtils.randomDate(APPOINTMENT_TIME_BEGIN, APPOINTMENT_TIME_END);
        businessDataBean.setAppointmentTime(date);
    }
}
