package com.yedam.java.ch0701;

public class ComputerTest {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		System.out.println("�� ���� : " 
					+ cal.areaCircle(10));

	
		Computor com = new Computor();
			System.out.println("�� ���� : " 
					+ com.areaCircle(10));
			
			System.out.println();
			//��¿����� �ڽ��� �� ����, �θ�� ���� �������־����
			com.print();
			
	}	
}
