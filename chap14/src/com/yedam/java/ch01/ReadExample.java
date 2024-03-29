package com.yedam.java.ch01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ReadExample {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("D:/dev/temp/test1.db");
		while (true) {
			int data = is.read();
			if (data == -1)
				break;
			System.out.println(data);
		}
		is.close();
		System.out.println("--------------------------");

		is = new FileInputStream("D:/dev/temp/test2.db");
		byte[] buffer = new byte[100];
		buffer[0] = 0;
		while (true) {
			int readByteNum = is.read(buffer);
			if (readByteNum == -1)
				break;
			for (int i = 0; i < readByteNum; i++) {
				System.out.println(buffer[i]);
			}
		}
		is.close();

		System.out.println("--------------------------");
		System.out.println("\ntest3.db====");
		is = new FileInputStream("D:/dev/temp/test3.db");
		while (true) {
			int data = is.read();
			if (data == -1)
				break;
			System.out.println(data);
		}

		int readByteNum = is.read(buffer, 3, 2);
		for(int i=0; i<(3+readByteNum); i++) {
			System.out.println(buffer[i]);
			
		}
		
		
		is.close();
		}

	
}