package com.yedam.java.home;

import java.util.Scanner;

public class MainProgram {
	private Scanner sc = new Scanner(System.in);
	private BookAccess dao = BookDAO.getInstance();
	private BookProgram pro = new BookSystem();

	public MainProgram() {
		while (true) {
			pro.menuPrint();

			int menuNo = menuSelect();

			if (menuNo == 1) {
				pro.inputInfo(dao);
			} else if (menuNo == 2) {
				pro.printAllInfo(dao);
			} else if (menuNo == 3) {
				pro.printInfo(dao);
			} else if (menuNo == 4) {
				pro.printRepot(dao);
			} else if (menuNo == 5) {
				exit();
				break;
			} else {
				System.out.println("��Ȯ�� ���� �Է����ּ���.");
				continue;
			}
		}
	}

	private int menuSelect() {
		System.out.println("����>");
		return Integer.parseInt(sc.nextLine());
	}

	private void exit() {
		System.out.println("���α׷��� �����մϴ�.");
	}
}
