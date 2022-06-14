package com.yedam.homework;

import java.util.Scanner;

public class MainProduct {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		ProductSystem productSystem = new ProductSystem();

		while (run) {
			System.out.println("1.��ǰ �� | 2. ��ǰ �� �����Է� | 3. ��ǰ�� ���� | 4.�м� | 5.����");
			System.out.print("����> ");
			int selectNo = 0;
			// ������ �Է��� �Ǻ��ϴ� ��ɾ�(try-catch)
			try {
				selectNo = Integer.parseInt(sc.nextLine());
				//nextLine�� '����'�� ������ ������ �״�� �о����
				// 1��
				if (selectNo == 1) {
					System.out.println("��ǰ ���� �Է����ּ���.");
					System.out.print("��ǰ ��> ");
					int size = Integer.parseInt(sc.nextLine());
					productSystem.setListSize(size);
					// 2��
				} else if (selectNo == 2) {
					System.out.println("��ǰ��� ������ �Է����ּ���.");
					System.out.print("��ǰ��> ");
					String name = sc.nextLine();
					System.out.print("����> ");
					int price = Integer.parseInt(sc.nextLine());
					productSystem.putProduct(name, price);
					// 3��
				} else if (selectNo == 3) {
					productSystem.printList();
					// 4��
				} else if (selectNo == 4) {
					productSystem.analysis();
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
