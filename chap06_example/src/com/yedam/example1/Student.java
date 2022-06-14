package com.yedam.example1;

public class Student {
	// �ʵ�
	// �ʿ������� : �̸�, �ܾ�
	private String name;
	private int money;

	// ������
	public Student(String name, int money) { // �л��̸��� �ܾ� ����
		this.name = name; // �л��̸� ����
		this.money = money; // �ܾ� ����

	}

	// �޼���
	public void take(Subway subway) { // Subway �� ����
		int pay = subway.getPay(); // �������
		this.money -= pay; // ��ݰ��
		subway.take(pay); // ����ö����� ����̵�

	}

	// �޼ҵ� �����ε�
	public void take(Bus bus) { // Bus �� ����
		int pay = bus.getPay(); // �������
		this.money -= pay; // ��ݰ��
		bus.take(pay); // ������ ����̵�

	}

	public void showInfo() { // �ܾ� ���
		System.out.println(name + " ���� ���� ���� " + this.money + " �� �Դϴ�.");
	}
}
