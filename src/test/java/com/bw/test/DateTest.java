package com.bw.test;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.niuxingyuan.common.utils.DateUtil;

public class DateTest {
	@Test
	public void testData1(){
		Date dateByInitMonth = DateUtil.getDateByInitMonth(new Date());
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String format = simpleDateFormat.format(dateByInitMonth);
		System.out.println(format);
	}
	@Test
	public void testData2(){
		Date dateByInitMonth = DateUtil.getDateByFullMonth(new Date());
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String format = simpleDateFormat.format(dateByInitMonth);
		System.out.println(format);
	}
}
