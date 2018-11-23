
package com.dy.AutoTest.web.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileUtil {
	private static File file;
	
	
	public static void loadFile(String path) {
		file = new File(path);		//文件路径（路径+文件名）
		if (!file.exists()) {	//文件不存在则创建文件，先创建目录
			File dir = new File(file.getParent());
			dir.mkdirs();
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void writeFileByByte(String content) {
		
		byte[] contentByte=content.getBytes();
		FileOutputStream outStream;
		try {
			outStream = new FileOutputStream(file);
			outStream.write(contentByte);
			outStream.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
