package com.yedam.jaca.ch1102;

public class WrapTest {

	public static void main(String[] args) {
		Integer obj1 = new Integer(100);
		Integer obj2 = Integer.valueOf("100");
		Integer obj3 = 100;
		
		int val2 = obj2.intValue(); //intŸ���� ���� ����� �޼ҵ�
		int val3 = obj3; 
		
		int result = obj2 + val3;
		
		Integer object1 = 300;
		Integer object2 = 300;
		
		System.out.println("== ��� : " + (object1 == object2));
		System.out.println("��ڽ� �� == ��� : " + (object1.intValue() == object2.intValue()));
		System.out.println("equls() ��� : " + object1.equals(object2));	//������ �� ��� Ŭ������ ��
		
	}

}
