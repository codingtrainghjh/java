package com.yedam.jaca.ch1101;

public class ObjectTest {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();

		if (obj1.equals(obj2)) {
			System.out.println("obj1�� obj2�� �������� �����մϴ�.");
		}

		if (obj1 == obj2) {
			System.out.println("obj1�� obj2�� �������� �����մϴ�.");
		}
	}

	Member m1 = new Member("blue");
	Member m2 = new Member("blue");
	Member m3 = new Member("red");
	{

		if (m1.equals(m2)) {
			System.out.println("m1�� m2�� �����մϴ�.");
		} else {
			System.out.println("m1�� m2�� �������� �ʽ��ϴ�");
		}
		if (m1.equals(m3)) {
			System.out.println("m1�� m3�� �����մϴ�.");
		} else {
			System.out.println("m1�� m3�� �������� �ʽ��ϴ�.");
		}

	}
}