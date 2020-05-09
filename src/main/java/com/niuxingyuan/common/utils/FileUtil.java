package com.niuxingyuan.common.utils;
/**
 * 文件
 * @ClassName: FileUtil 
 * @Description: TODO
 * @author: 98420
 * @date: 2020年5月9日 上午8:39:47
 */
public class FileUtil {
	public static String getExtendName(String fileName){
		String s=fileName.substring(fileName.lastIndexOf("."));
		return s;
	}
}
