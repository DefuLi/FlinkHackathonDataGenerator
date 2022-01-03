package com.flinkhackathon.datagenerator.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * 随机数工具类
 *
 * @author Defu Li
 * @since 2022/1/2 10:59
 */
public class RandomUtils {

    private static final Random RANDOM = new Random();

    /**
     * 正态分布
     *
     * @param min 最小值
     * @param max 最大值
     * @return 正态分布随机数
     */
    public static int randomGaussianGetId(int min, int max) {
        return (int) ((RANDOM.nextGaussian() + 3) * (max - min) / 6 + min);
    }

    /**
     * 均匀分布
     *
     * @param min 最小值
     * @param max 最大值
     * @return 均匀分布随机数
     */
    public static int randomUniformGetId(int min, int max) {
        return min + (int) (Math.random() * (max - min + 1));
    }

    /**
     * 随机时间
     *
     * @param beginDate 开始日期
     * @param endDate   结束日期
     * @return 随机日期
     */
    public static Date randomDate(String beginDate, String endDate) {
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            Date start = format.parse(beginDate);
            Date end = format.parse(endDate);
            if (start.getTime() >= end.getTime()) {
                return null;
            }
            long date = doRandomDate(start.getTime(), end.getTime());
            return new Date(date);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static long doRandomDate(long begin, long end) {
        long rtn = begin + (long) (Math.random() * (end - begin));
        if (rtn == begin || rtn == end) {
            return doRandomDate(begin, end);
        }
        return rtn;
    }

}
