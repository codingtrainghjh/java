package com.yedam.java.ch0702;

public class ChildTest2 {

	public static void main(String[] args) {
		GrandFa fa = new Father();
		fa.method();
		//fa = new Uncle();
		
		System.out.println();
		if(fa instanceof Father) {
		Father pa = (Father) fa;
		pa.method();
		pa.method2();
		}else {
			System.out.println("fa ������ ������ �ִ� �ν��Ͻ��� Fater�� �ƴմϴ�.");
		}

	}

}
