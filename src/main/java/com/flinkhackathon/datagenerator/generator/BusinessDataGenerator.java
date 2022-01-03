package com.flinkhackathon.datagenerator.generator;

import com.flinkhackathon.datagenerator.generator.handler.*;
import com.flinkhackathon.datagenerator.model.BusinessDataBean;

import java.util.ArrayList;
import java.util.List;

/**
 * 业务数据生成器责任链
 *
 * @author Defu Li
 * @since 2022/1/2 1:15
 */
public class BusinessDataGenerator {
    private static final List<IBusinessHandler> BUSINESS_HANDLERS = new ArrayList<>();

    static {
        BUSINESS_HANDLERS.add(new CustomIdHandler());
        BUSINESS_HANDLERS.add(new InstitutionIdHandler());
        BUSINESS_HANDLERS.add(new BusinessTypeHandler());
        BUSINESS_HANDLERS.add(new BusinessAmountHandler());
        BUSINESS_HANDLERS.add(new CreateTimeHandler());
        BUSINESS_HANDLERS.add(new AppointmentTimeHandler());
        BUSINESS_HANDLERS.add(new ManagerIdHandler());
    }

    /**
     * 生成业务数据bean
     *
     * @return 业务数据bean
     */
    public static BusinessDataBean buildBusinessData() {
        BusinessDataBean businessDataBean = new BusinessDataBean();
        for (IBusinessHandler handler : BUSINESS_HANDLERS) {
            handler.handle(businessDataBean);
        }
        return businessDataBean;
    }
}
