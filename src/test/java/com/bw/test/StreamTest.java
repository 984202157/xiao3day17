package com.bw.test;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.junit.Test;

import com.niuxingyuan.common.utils.StreamUtil;

public class StreamTest {
	@Test
	public void testFile1() throws IOException{
		 List<String> readTextFile = StreamUtil.readTextFile(new File("D:\\data.txt"));
		for (String string : readTextFile) {
			System.out.println(string);
		}
	
	}
	
}
