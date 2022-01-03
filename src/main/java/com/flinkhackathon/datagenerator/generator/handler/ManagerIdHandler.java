package com.flinkhackathon.datagenerator.generator.handler;

import com.flinkhackathon.datagenerator.model.BusinessDataBean;
import com.flinkhackathon.datagenerator.utils.RandomUtils;

/**
 * 预约客户经理字段 处理器
 *
 * @author Defu Li
 * @since 2022/1/2 10:29
 */
public class ManagerIdHandler implements IBusinessHandler {

    private static final int MANAGER_ID_MIN = 100000;

    private static final int MANAGER_ID_MAX = 200000;

    @Override
    public void handle(BusinessDataBean businessDataBean) {
        int managerId = RandomUtils.randomUniformGetId(MANAGER_ID_MIN, MANAGER_ID_MAX);
        businessDataBean.setManagerId(managerId);
    }
}
