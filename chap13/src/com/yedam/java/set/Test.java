package com.yedam.java.set;

import java.util.HashSet;
import java.util.Set;

public class Test {

	public static void main(String[] args) {
		String data1 = "Java";
		String data2 = new String("Java");
		
		if(data1 == data2) {
			System.out.println("���� ���� ��ü�Դϴ�.");
		}else {
			System.out.println("���� �ٸ� ��ü�Դϴ�.");
		}
		
		Set<String> set = new HashSet<>();
		set.add(data1);
		set.add(data2);
		
		System.out.println("�� ��ü �� : " + set.size());
	}

}
