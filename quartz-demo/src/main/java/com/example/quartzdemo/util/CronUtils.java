package com.example.quartzdemo.util;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.quartz.CronExpression;

import java.util.Date;

/**
 * @author luoYong
 * @version 1.0
 * @date 2023/8/30 10:33
 */
public class CronUtils {

    private static final String CRON_DATE_FORMAT = "ss mm HH dd MM ? yyyy";

    /***
     * 将Date类型时间转成cron表达式eg.  "0 07 10 15 1 ? 2021"
     * @param date  : 时间点
     */
    public static String convertDateToCron(Date date) {
        return DateFormatUtils.format(date, CRON_DATE_FORMAT);
    }

    /**
     * 返回一个布尔值代表一个给定的Cron表达式的有效性
     *
     * @param cronExpression Cron表达式
     * @return boolean 表达式是否有效
     */
    public static boolean isValid(String cronExpression) {
        return CronExpression.isValidExpression(cronExpression);
    }

}
