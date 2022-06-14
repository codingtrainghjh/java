package com.yedam.java.question;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�������� >>");
		int record = scanner.nextInt();
		
		Member member = Member.getMemberShip(record);
		member.showMemberInfo();
		
		Payment myCard = null;
		if(member instanceof Gold) {
			myCard = new VIPCard();
		}else if(member instanceof Silver) {
			myCard = new GreenCard();
		}
		System.out.println("=== ��޿� ���� ī�� ���� ���� ����ݾ� ===");
		System.out.println("����� �ݾ� >>");
		int price = scanner.nextInt();
		System.out.println("������� : 1.��������, 2.�¶���, 3.�������");
		int pay= scanner.nextInt();
		
		int result = 0;
		switch(pay) {
		case 1:
			result = myCard.offline(price);
			break;
		case 2:
			result = myCard.online(price);
			break;
		case 3:
			result = myCard.simple(price);
			break;
		}
		
		System.out.println("���� ���� �ݾ� : " + result);
		myCard.showCardInfo();
	}

}
