package com.yedam.java.ch0604;

import java.util.Scanner;

public class Calculator_prototype {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		Calculator Calculator = new Calculator();

		// ����

		while (run) {
			System.out.println("1.�����Է� | 2.�����Է� | 3.���� | 4.���� | 5.���� | 6.������ | 7.����");
			System.out.print("����> ");
			int selectNo = Integer.parseInt(sc.nextLine());

			// 1.���� �Է�
			if (selectNo == 1) {
				System.out.println("������ �Է����ּ���.");
				System.out.print("�Է�> ");
				int size = Integer.parseInt(sc.nextLine());
				Calculator.setArraySize(size);
				// 2.���� �Է�
			} else if (selectNo == 2) {
				System.out.println("���ڸ� �Է����ּ���.");
				System.out.print("�Է�> ");
				int num = Integer.parseInt(sc.nextLine());
				Calculator.setNum(num);
			} else if (selectNo == 3) {
				Calculator.plus();
			} else if (selectNo == 4) {
				Calculator.minus();
			} else if (selectNo == 5) {
				Calculator.multiply();
			} else if (selectNo == 6) {
				Calculator.division();
			} else if (selectNo == 7) {
				run = false;
				System.out.println("����� �����մϴ�.");
				

			}

		}

	}
}
