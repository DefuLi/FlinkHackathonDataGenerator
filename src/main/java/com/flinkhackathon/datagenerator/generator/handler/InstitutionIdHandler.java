package com.flinkhackathon.datagenerator.generator.handler;

import com.flinkhackathon.datagenerator.model.BusinessDataBean;
import com.flinkhackathon.datagenerator.utils.RandomUtils;

/**
 * 机构号字段 处理器
 *
 * @author Defu Li
 * @since 2022/1/2 10:26
 */
public class InstitutionIdHandler implements IBusinessHandler {
    private static final int INSTITUTION_ID_MIN = 11;

    private static final int INSTITUTION_ID_MAX = 40;

    @Override
    public void handle(BusinessDataBean businessDataBean) {
        int institutionId = RandomUtils.randomGaussianGetId(INSTITUTION_ID_MIN, INSTITUTION_ID_MAX);
        businessDataBean.setInstitutionId(institutionId);
    }


}
