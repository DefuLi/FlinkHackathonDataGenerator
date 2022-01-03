package com.flinkhackathon.datagenerator.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * 业务数据bean
 *
 * @author Defu Li
 * @since 2022/1/2 0:11
 */
@Getter
@Setter
@ToString
public class BusinessDataBean {
    /**
     * 客户编号
     */
    private int customId;

    /**
     * 机构号
     */
    private int institutionId;

    /**
     * 业务类型
     */
    private int businessType;

    /**
     * 业务金额
     */
    private int businessAmount;

    /**
     * 办理时间
     */
    private Date createTime;

    /**
     * 预约处理时间
     */
    private Date appointmentTime;

    /**
     * 预约客户经理
     */
    private int managerId;

    /**
     * 对公或对私
     */
    private int company;
}
