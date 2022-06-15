package com.yedam.java.ch03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferStreamExample {

	public static void main(String[] args) throws Exception {
		//buffer 스트림이 없는 경우
		String originalFilePath1
		= BufferStreamExample.class.getResource("originalFile1.jpg").getPath(); //패키지를 찾아서 그안의 파일을 찾는 프로그램
		String targetFilePath1 = "D:/dev/temp/targetFile1.jpg";
		InputStream fis1 = new FileInputStream(originalFilePath1);
		OutputStream fos1 = new FileOutputStream(targetFilePath1);
		
		long nonBufferTime = copy(fis1, fos1);
		System.out.println("버퍼를 사용하지 않았을 때 : " + nonBufferTime + "ns");
		
		fis1.close();
		fos1.close();
		
		//buffer 스트림이 있는 경우
		String originalFilePath2
		= BufferStreamExample.class.getResource("originalFile2.jpg").getPath();
		String targetFilePath2 = "D:/dev/temp/targetFile2.jpg";
		InputStream fis2 = new FileInputStream(originalFilePath2);
		OutputStream fos2 = new FileOutputStream(targetFilePath2);
		
		BufferedInputStream bis = new BufferedInputStream(fis2);
		BufferedOutputStream bos = new BufferedOutputStream(fos2);
		long bufferTime = copy(bis, bos); //보조스트림을 통해서 값을 받아들이겠다.(*,*)
		System.out.println("버퍼를 사용했을 때 : " + bufferTime + "ns");
	
		bis.close();
		bos.close();
		
		
		
	}
	static int data = -1;
	public static long copy(InputStream is, OutputStream os) throws Exception{
		long start = System.nanoTime();
		while(true) {
			data = is.read();
			if(data == -1)break;
			os.write(data);
		}
		long end = System.nanoTime();
		return (end-start);

}
}
