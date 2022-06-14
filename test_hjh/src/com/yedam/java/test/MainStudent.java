package com.yedam.java.test;

import java.util.Scanner;

public class MainStudent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		StudentSystem studentSystem = new StudentSystem();
		
		while (run) {
			System.out.println("=== 1.�л��� �Է�, 2.�л����� ���, 3. �л����� ��ü��ȸ, 4.�л����� �м�, 5.���� ===");
			System.out.print("����> ");
			int selectNo = 0;
			try {
				selectNo = Integer.parseInt(sc.nextLine());
				// 1��
				if (selectNo == 1) {
					System.out.println("�л� ���� �Է����ּ���.");
					System.out.print("�л� ��> ");
					int size = Integer.parseInt(sc.nextLine());
					studentSystem.Student(size);
					// 2��
				} else if (selectNo == 2) {
					System.out.println("�л������� �Է����ּ���.");
					System.out.print("�й�> ");
					int no = Integer.parseInt(sc.nextLine());
					System.out.print("�̸�> ");
					String name = sc.nextLine();
					System.out.print("����> ");
					int score = Integer.parseInt(sc.nextLine());
					studentSystem.studInfo(no, name, score);
					// 3��
				} else if (selectNo == 3) {
					studentSystem.studList();
					// 4��
				} else if (selectNo == 4) {
					studentSystem.findMaxMin();
					// 5��
				} else if (selectNo == 5) {
					System.out.println("���α׷��� �����մϴ�.");
					run = false;
					// �߸��� �� �Է½�
				} else {
					System.out.println("��Ȯ�� ���� �Է����ּ���.");
				}
			} catch (NumberFormatException e) {
				System.out.println("�߸��� ���Դϴ�.");
				System.out.println("�ٽ� �Է����ּ���.");
			}

		}

	}

}
