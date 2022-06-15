package com.yedam.java.ch03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;

public class CharcterConvertExample {

	public static void main(String[] args) throws Exception {
		//기본적으로 입출력스트림은 바이트타입이 좋음(바이트타입이 읽고쓰기에 빠름)
		System.out.print("입력 문장>");
		String data = new Scanner(System.in).nextLine();
		write(data);
		read();

	}
	
	public static void write(String str) throws Exception {
		OutputStream os = new FileOutputStream("D:/dev/temp/text1.txt");
		//보조는 보조일뿐, 입출력스트림을 먼저 만들어야 한다.
		//os.write(str); //output은 스트링기반이므로 바이트타입을 내보낼수 없다. 그래서 별도의 조작없이 데이터를 내보내고 싶을때 보조스트림이 필요하다.
		
		Writer writer = new OutputStreamWriter(os);
		
		writer.write(str);
		writer.flush();
		writer.close();
	}
	public static void read() throws Exception {
		InputStream is
		= new FileInputStream("D:/dev/temp/text1.txt");
		
		Reader reader
		= new InputStreamReader(is); //직접적으로 데이터를 주고받을수 없으므로 타입을 넘겨줘야함.
		
		char[] buffer = new char[100];
		int readCharNum = reader.read(buffer);
		reader.close();
		
		String data = new String(buffer, 0, readCharNum);
		System.out.println(data);
	} //보조스트림은 주요스트림의 값을 그대로 두고서 원하는 값으로 출력받고싶을때 사용하면 된다.
}
