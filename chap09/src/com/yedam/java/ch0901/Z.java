package com.yedam.java.ch0901;

public class Z {
	//�ν��Ͻ� �ɹ� -> Z Ŭ������ �ν��Ͻ��� ����
	B field1 = new B();	//ZŬ������ �ν��Ͻ��� ����
	C field2 = new C();	//ZŬ������ ������ ������ ��
	
	void method1() {
		B var1 = new B();
		C var2 = new C();
	}
	//���� ��� -> ZŬ������ �ν��Ͻ��� ���� �� �ִ�.
	static B field3 = new B(); //�ݵ�� ZŬ������ �ν��Ͻ��� �ʿ�
	static C field4 = new C(); //ZŬ������ ������ �ʿ�
	
	static void method2() {
		B var1 = new B();
		C var2 = new C();
	}
	//�ν��Ͻ� ��� Ŭ����
	class B {}
	//���� ��� Ŭ����
	static class C {} 
}
