package com.yedam.java.test;

public class StudentSystem {
	private Student[] list;
	private int index;

	public StudentSystem() {
		index = -1;
	}

	// 1.�л��� �Է�
	public void Student(int size) {
		list = new Student[size];
	}

	// 2.�л����� ���
	public void studInfo(int studentNo, String name, int score) {
		Student student = new Student();
		student.setStudentNo(studentNo);
		student.setName(name);
		student.setScore(score);

		list[++index] = student;
	}

	// 3.�л����� ��ü��ȸ
	public void studList() {
		for (int i = 0; i <= index; i++) {
			;

			Student student = list[i];
			System.out.println(student.getStudentNo() + " �й��� ������ " + student.getScore() + "�� �Դϴ�.");
		}
	}

	// 4.�л����� �м�
	public void findMaxMin() {
		int max = list[0].getScore();
		int maxNo = list[0].getStudentNo();
		int min = list[0].getScore();
		int minNo = list[0].getStudentNo();
		double avg = 0;
		int sum = 0;

		for (int i = 0; i < list.length; i++) {
			if (max < list[i].getScore()) {
				max = list[i].getScore();
				maxNo = list[i].getStudentNo();
			}
			if (min > list[i].getScore()) {
				min = list[i].getScore();
				minNo = list[i].getStudentNo();
			}

		}
		for (Student temp : list) {
			sum += temp.getScore();

		}
		avg = (sum - max - min) / (list.length - 2);
		System.out.println("�ְ����� : " + max + "��, �й� : " + maxNo);
		System.out.println("�������� : " + min + "��, �й� : " + minNo);
		System.out.println("�ְ���, �������� ������ ��� ������ " + avg + "�� �Դϴ�.");

	}
}
