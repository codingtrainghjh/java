package com.yedam.java.example1;

import java.util.Scanner;

public class CustomerSystem {
	// �ʵ�
	private Repo repo = new Repo();
	private Scanner sc = new Scanner(System.in);

	// ������
	public CustomerSystem() {
		while (true) {
			// �޴� ���
			menuPrint();
			// �޴� ����
			int menuNo = menuSelect();
			// �޴�1 - ȸ������
			if (menuNo == 1) {
				signUp();
				// �޴�2 - ȸ������
			} else if (menuNo == 2) {
				myPage();
				// �޴�3 - ������ �ݾ�
			} else if (menuNo == 3) {
				payInfo();
				//�޴�4 - ����
			} else if (menuNo == 4) {
				exit();
				break;

			}
		}
	}
	// �޼ҵ�
	
	void menuPrint() {
		System.out.println("====================================");
		System.out.println("1.ȸ������ | 2.ȸ������ | 3.�����ݾ� | 4.����");
		System.out.println("====================================");
	}
	
	int menuSelect() {
		System.out.println("�޴� >");
		return Integer.parseInt(sc.nextLine());
	}
	
	void signUp() {
		//ȸ�� ���� �Է�
		Customer info = inputAll();
		//����
		repo.insert(info);
	}
	Customer inputAll() {
		//ȸ�� �⺻ ���� �Է�
		System.out.println("���̵� > ");
		int id = Integer.parseInt(sc.nextLine());
		System.out.println("�̸� > ");
		String name = sc.nextLine();
		
		//ȸ�� ��� ����
		int selectGrade = selectGrade();
		Customer customer = null;
		switch(selectGrade) {
		case 1:
			customer = new Customer(id, name);
			break;
		case 2:
			customer = new Gold(id, name);
			break;
		case 3:
			customer = new VIP(id, name, "���ϳ�");
			break;
		}
		return customer;
	}
	//��� ����
	int selectGrade() {
		System.out.println("1.SILVER | 2.GOLD | 3.VIP");
		System.out.println("--------------------------");
		return Integer.parseInt(sc.nextLine());
	}
	
	void myPage() {
		int customerId = inputOne();
		Customer info = repo.selectOne(customerId);
		System.out.println(info.showInfo());
		}
	
	void payInfo() {
		int customerId = inputOne();
		Customer info = repo.selectOne(customerId);
		
		System.out.println("���� �ݾ� >");
		int price = Integer.parseInt(sc.nextLine());
		int pay = info.calcPrice(price);
		System.out.println("���� �ݾ� : " + pay);
	}
	
	void exit() {
		System.out.println("���α׷� ����");
	}
	int inputOne() {
		System.out.println("�� ���̵�>");
		return Integer.parseInt(sc.nextLine());
	}
}
