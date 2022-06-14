package com.yedam.jaca.ch1102;

import java.io.UnsupportedEncodingException;

public class StringTest1 {

	public static void main(String[] args) {
		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };

		String str1 = new String(bytes);
		System.out.println(str1);

		String str2 = new String(bytes, 6, 4);
		System.out.println(str2);

		System.out.println();

		// String -> byte -> String
		String str = "�ȳ��ϼ���";

		byte[] bytes1 = str.getBytes();
		System.out.println(bytes1);
		String strs1 = new String(bytes1);
		System.out.println(strs1);

		try {
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println(bytes2);
			String strs2 = new String(bytes2, "EUC-KR");
			System.out.println(strs2);
		} catch (UnsupportedEncodingException e) {

			e.printStackTrace();
		}
		System.out.println();
		// charAt
		String ssn = "010123-1234567";
		char gender = ssn.charAt(7);
		switch (gender) {
		case '1':
		case '3':
			System.out.println("�����Դϴ�");
			break;
		case '2':
		case '4':
			System.out.println("�����Դϴ�");
			break;
		}
		for (int i = 0; i < ssn.length(); i++) {
			System.out.println(ssn.charAt(i));
		}
		System.out.println();
		
		// equals
		// ���ο� �ν��Ͻ��� �ʿ��ϴٸ� new�����ڸ� ����ؾ� �Ѵ�.
		String val1 = "�Ź�ö";
		String val2 = "�Ź�ö";
		String val3 = new String("�Ź�ö");

		if (val1.equals(val2)) {
			System.out.println("val1�� val2�� ���� �����ϴ�.");
		} else {
			System.out.println("vall�� val2�� ���� �ٸ��ϴ�.");
		}
		if (val1.equals(val3)) {
			System.out.println("val�� val3�� ���� �����ϴ�");
		} else {
			System.out.println("val1�� val3�� ���� �ٸ��ϴ�.");
		}
		if (val1 == val2) {
			System.out.println("val1�� val2�� ���� �ν��Ͻ��Դϴ�.");
		} else {
			System.out.println("vall�� val2�� �ٸ� �ν��Ͻ��Դϴ�.");
		}
		if (val1 == val3) {
			System.out.println("val�� val3�� ���� �ν��Ͻ��Դϴ�");
		} else {
			System.out.println("val1�� val3�� �ٸ� �ν��Ͻ��Դϴ�.");
		}
		
		System.out.println();
		//indexOf
		String subject = "�ڹ�     ���α׷��� & ������ ����";
		
		int location = subject.indexOf(" ");
		System.out.println(location + "dfd");
		
		if(subject.indexOf("�ڹ�") != -1) {
			System.out.println("�ڹٿ� ���õ� å");
		}else {
			System.out.println("�ڹٿ� ���þ��� å");
		}
		
		//substring
		String result1 = subject.substring(subject.indexOf("���α׷���"));
		System.out.println(result1);
		
		String ssn1 = "960130-1234567";
		System.out.println("������� : " + ssn1.substring(0, 6));
		System.out.println("�������� : " + ssn1.substring(7));
		
		System.out.println();
		
		//length
		String[] temp = {"1","2"};
		int val = temp.length;
		
		System.out.println(ssn1.length());
		
		System.out.println();
		
		//replace
		String oldStr = "Java ���α׷��� Java";
		String newStr = oldStr.replace("Java", "�ڹ�");
		System.out.println(oldStr + " -> " + newStr);
	}

}
