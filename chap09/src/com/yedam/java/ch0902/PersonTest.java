package com.yedam.java.ch0902;

public class PersonTest {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		
		//�ʵ� - �͸� ��ü
		anony.field.wake();
		//���� ���� - �͸� ��ü
		anony.method1();
		//�Ű� ���� - �͸� ��ü
		anony.method2(new Person() {
			//�ʵ�
			String job = "�л�";
			//�޼ҵ�
			void study() {
				System.out.println("�����մϴ�.");
			}
			@Override
			void wake() {
				System.out.println("8�ÿ� �Ͼ�ϴ�.");
				study();
			}
		});
	}

}
