package com.yedam.java.example2;

import java.util.Scanner;

public class StudentProgram implements Program {
	private Scanner sc = new Scanner(System.in);

	@Override
	public void menuPrint() {
		System.out.println("=========================================");
		System.out.println("1.�����Է� | 2.��ü��ȸ | 3.�˻� | 4.�м� | 5.����");
		System.out.println("=========================================");
	}

	@Override
	public void inputInfo(Access access) {
		// ����ڰ� ������ �Է�
		Student info = inputAll();
		// ����ҿ� ���
		access.insert(info);
	}

	private Student inputAll() {
		System.out.println("�й�>");
		int id = Integer.parseInt(sc.nextLine());
		System.out.println("�̸�>");
		String name = sc.nextLine();
		System.out.println("����>");
		int score = Integer.parseInt(sc.nextLine());

		return new Student(id, name, score);
	}

	@Override
	public void printAllInfo(Access access) {
		// ����ҿ��� �����͸� ������
		Student[] list = access.selectAll();
		// ������ ��ü ���
		for (Student student : list) {
			student.showInfo();
		}

	}

	@Override
	public void printInfo(Access access) {
		try {

			// �˻� ���� �Է�
			int id = inputId();
			// ����ҿ��� �˻�
			Student info = access.selectone(id);

			// ���
			info.showInfo();
		} catch (Exception e) {
			System.out.println("�������� �ʴ� �л��Դϴ�.");
		}
	}

	private int inputId() {
		System.out.println("�˻� �й�>");
		return Integer.parseInt(sc.nextLine());
	}

	@Override
	public void printRepot(Access access) {
		// �ְ� ����
		System.out.println("�ְ� ���� >");
		Student maxInfo = selectMaxScore(access);
		maxInfo.showInfo();
		// ���� ����
		System.out.println("���� ���� >");
		Student minInfo = selectMinScore(access);
		minInfo.showInfo();
		// ���
		System.out.println("��� �� >");
		double avgResult = calcAvg(access);
		System.out.println(avgResult);
	}

	private Student selectMaxScore(Access access) {
		Student[] list = access.selectAll();

		Student maxInfo = list[0];
		for (int i = 1; i < list.length; i++) {
			if (maxInfo.getScore() < list[i].getScore()) {
				maxInfo = list[i];
			}
		}
		return maxInfo;
	}

	private Student selectMinScore(Access access) {
		Student[] list = access.selectAll();

		Student minInfo = list[0];
		for (int i = 1; i < list.length; i++) {
			if (minInfo.getScore() > list[i].getScore()) {
				minInfo = list[i];
			}
		}
		return minInfo;
	}

	private double calcAvg(Access access) {
		Student[] list = access.selectAll();

		int sum = 0;
		for (Student info : list) // �캯�� �ִ°� �º��� ��ƶ�
		{
			sum += info.getScore();

		}
		return (double) sum / list.length;
	}
}