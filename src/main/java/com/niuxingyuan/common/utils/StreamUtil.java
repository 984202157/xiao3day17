package com.niuxingyuan.common.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * 流
 * @ClassName: StreamUtil 
 * @Description: TODO
 * @author: 98420
 * @date: 2020年5月9日 上午8:39:58
 */
public class StreamUtil {
	public static void closeAll(){
		//TODO 实现代码
	}//关闭流
	public static String readTextFile(InputStream src){
		//TODO 实现代码
		return "关闭成功";
	}//读取文件
	public static List<String> readTextFile(File txtFile) throws IOException{
		BufferedReader reader = new BufferedReader(new FileReader(txtFile));
		List<String> list=new ArrayList<>();
		String s="";
		while((s=reader.readLine())!=null){
			list.add(s);
		}
		return list;
	}
}
