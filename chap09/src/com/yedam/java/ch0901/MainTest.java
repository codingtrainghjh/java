package com.yedam.java.ch0901;

public class MainTest {

	public static void main(String[] args) {
		A a = new A();
		
		System.out.println();
		//�ν��Ͻ� ��� Ŭ����
		A.B b = a.new B();
		b.field1 = 1;
		b.method1();
		System.out.println();
		//���� ��� Ŭ����
		A.C.field2 = 2;
		A.C.method2();
		
		A.C c = new A.C();
		c.field1 = 1;
		c.method1();
		
		System.out.println();
		//���� Ŭ����
		a.method();
		
	}

}



