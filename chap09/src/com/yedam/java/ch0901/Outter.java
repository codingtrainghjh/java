package com.yedam.java.ch0901;

public class Outter {
	String field = "�ٱ�Ŭ���� - �ʵ�";
	void method() {
		System.out.println("�ٱ�Ŭ���� - �޼ҵ�");
	}
	void methodA() {
		System.out.println("�ٱ�Ŭ���� - �޼ҵ� A");
	}
	
	//�ν��Ͻ� ��� Ŭ����
	class Nested{
		String field = "��øŬ���� - �ʵ�";
		void method() {
			System.out.println("��øŬ���� - �޼ҵ�");
		}
		
		void print() {
			methodA();
			System.out.println(field);
			this.method();
			System.out.println(Outter.this.field);
			Outter.this.method();
		}
	}
	interface I {
		int FIELD = 100;
		
		void method();
	}
	static interface N {
		int FIELD = 100;
		void method();
	}
}
