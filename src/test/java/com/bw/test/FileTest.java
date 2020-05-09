package com.bw.test;

import org.junit.Test;

import com.niuxingyuan.common.utils.FileUtil;

public class FileTest {
	@Test
	public void testFile1(){
		String extendName = FileUtil.getExtendName("aaa.txt");
		
		
		System.out.println(extendName);
	}
	@Test
	public void testFile2(){
		String extendName = FileUtil.getExtendName("aaa.txt.js");
		
		
		System.out.println(extendName);
	}
	
}
