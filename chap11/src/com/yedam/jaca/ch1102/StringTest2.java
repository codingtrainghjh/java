package com.yedam.jaca.ch1102;

public class StringTest2 {

	public static void main(String[] args) {
		// toLowerCase & toUpperCase
		String str1 = "Java Programing";
		String str2 = "JAVA PROGRAMING";
		if (str1.equals(str2)) {
			System.out.println("str1�� str2�� ���� ���Դϴ�.");
		} else {
			System.out.println("str1�� str2�� �ٸ� ���Դϴ�.");
		}

		String val1 = str1.toLowerCase();
		String val2 = str1.toLowerCase();
		if (val1.equals(val2)) {
			System.out.println("val1�� val2�� ���� ���Դϴ�.");
		} else {
			System.out.println("val1�� val2�� �ٸ� ���Դϴ�.");
		}
		
		if(str1.equalsIgnoreCase(str2)) {
			System.out.println("str1�� str2�� ���� ���Դϴ�.");
		} else {
			System.out.println("str1�� str2�� �ٸ� ���Դϴ�.");
		}
		
		//trim
		String subject = "      �ڹ�        ���α׷���         ";
		String newData = subject.trim();
		System.out.println(newData);
		int location = newData.indexOf(" ");
		System.out.println(location);
		System.out.println(newData.substring(0,location) +" "+ newData.substring(location).trim());
		
		//valueOf
		String value1 = String.valueOf(10);
		String value2 = String.valueOf(10.5);
		String value3 = String.valueOf(true);
		
		String value4 = "" + 100;
		
	}

}
