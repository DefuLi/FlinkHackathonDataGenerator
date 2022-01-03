package com.flinkhackathon.datagenerator.generator.handler;

import com.flinkhackathon.datagenerator.model.BusinessDataBean;
import com.flinkhackathon.datagenerator.utils.RandomUtils;

/**
 * 对公对私字段 处理器
 *
 * @author Defu Li
 * @since 2022/1/3 23:17
 */
public class CompanyHandler implements IBusinessHandler {
    @Override
    public void handle(BusinessDataBean businessDataBean) {
        int randomCompany = RandomUtils.randomUniformGetId(0, 9);
        // 对私的较多
        int company = randomCompany >= 2 ? 1 : 0;
        businessDataBean.setCompany(company);
    }
}
