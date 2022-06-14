package com.yedam.java.ch01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("d:/dev/temp/test1.db");
		
		byte a = 10;
		byte b = 20;
		byte c = 30;
		
		os.write(a);
		os.write(b);
		os.write(c);
		
		os.flush(); //출력스트림을 닫아야 하는 경우에는 스트림안에 남아있을지 모를 데이터를 밀어내고 닫아야한다.
		os.close(); 
		
		os = new FileOutputStream("d:/dev/temp/test2.db");
		
		byte[] array1 = {10, 20, 30};
		os.write(array1);
		
		os.flush();
		os.close();
		
		os = new FileOutputStream("d:/dev/temp/test3.db");
		
		byte[] array2 = {10, 20, 30, 40, 50};
		os.write(array2, 3, 2);
		
		os.flush();
		os.close();
		
		
	}

}
