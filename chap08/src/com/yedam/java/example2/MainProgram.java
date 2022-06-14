package com.yedam.java.example2;

import java.util.Scanner;

public class MainProgram {
	//�ʵ�
	private Scanner sc = new Scanner(System.in);
	private Access dao = StudentRepo.getInstance();		//�����
	private Program pro = new StudentProgram();	//���α׷�
	
	//������
	public MainProgram() {
		while(true) {
			//�޴����
			pro.menuPrint();
			//�޴�����
			int menuNo = menuSelect();
			//�� �޴� ����
			if(menuNo == 1) {
				pro.inputInfo(dao);
			}else if(menuNo == 2) {
				pro.printAllInfo(dao);
			}else if(menuNo == 3) {
				pro.printInfo(dao);
			}else if(menuNo == 4) {
				pro.printRepot(dao);
			}else if(menuNo == 5) {
				exit();
				break;
			}else {
				
				
			}
		}
	}
	//�޼ҵ�
	private int menuSelect() {
		System.out.println("����>");
		return Integer.parseInt(sc.nextLine());
	}
	private void exit() {
		System.out.println("���α׷��� �����մϴ�.");
	}
}
