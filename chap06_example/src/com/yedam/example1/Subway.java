package com.yedam.example1;

public class Subway {
	//�ʵ�
	 //ž������, �������, ž�°� ��, ����
	private String lineNumber;
	private int money;
	private	int passengerCount;
	private int pay;
	//������
	public Subway(String lineNumber, int pay) { //ȣ���� �ݾ� �޴°�
		this.lineNumber = lineNumber;
		this.pay = pay;
	}
	//�޼���
	public int getPay() { //�ݾ�����
		return pay;
		
	}
	public void take(int money) { //����
		this.money += money;
		this.passengerCount++;
		
	}
	public void showInfo() {
		System.out.print(lineNumber + "�� �°��� ");
		System.out.print(passengerCount + "���̰�, ������ ");
		System.out.println(money + "�� �Դϴ�.");
		
	}

}
