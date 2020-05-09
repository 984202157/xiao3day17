package com.niuxingyuan.common.utils;

import java.util.Calendar;
import java.util.Date;

/**
 * 
 * @ClassName: DateUtil 
 * @Description: TODO
 * @author: 98420
 * @date: 2020年5月9日 上午8:39:23
 * 日期
 */
public class DateUtil {
	//返回当月第一天
	public static Date getDateByInitMonth(Date src){
		//TODO 实现代码
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(src);
		calendar.set(Calendar.DAY_OF_MONTH,1);
		calendar.set(Calendar.HOUR_OF_DAY,0);
		calendar.set(Calendar.MINUTE,0);
		calendar.set(Calendar.SECOND,0);
		return calendar.getTime();
	}
	//返回当月最后一天
	public static Date getDateByFullMonth(Date src){
		//TODO 实现代码
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(src);
		calendar.add(Calendar.MONTH,1);
		calendar.set(Calendar.DAY_OF_MONTH,1);
		calendar.set(Calendar.HOUR_OF_DAY,0);
		calendar.set(Calendar.MINUTE,0);
		calendar.set(Calendar.SECOND,0);
		calendar.add(Calendar.SECOND,-1);
		return calendar.getTime();
	}
}
