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
     * [10001, max] 递增
     */
    private int customId;

    /**
     * 机构号
     * [2001, 3000]正态分布
     */
    private int institutionId;

    /**
     * 业务类型
     * [1, 10]正态分布
     */
    private int businessType;

    /**
     * 业务金额
     * （5~100） * w = 5w ~ 100w 正态分布
     */
    private int businessAmount;

    /**
     * 办理时间
     * 当前时间一天内，正态分布
     */
    private Date createTime;

    /**
     * 预约处理时间
     * 当前时间后3~5天内，正态分布
     */
    private Date appointmentTime;

    /**
     * 预约客户经理
     * [100000, 200000]随机选
     */
    private int managerId;
}
