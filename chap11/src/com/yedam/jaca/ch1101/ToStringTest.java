package com.yedam.jaca.ch1101;

import java.util.Date;

public class ToStringTest {

	public static void main(String[] args) {
		Object obj1 = new Object();
		System.out.println(obj1.toString());
		
		Date date = new Date();
		System.out.println(date.toString());
		
		Member member = new Member("ȫ�浿");
		System.out.println(member);
		System.out.println(member.toString()); //�Ѵ� ����
	}

}
