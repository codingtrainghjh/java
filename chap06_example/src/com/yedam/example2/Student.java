package com.yedam.example2;

public class Student {
	// �ʵ�
	private static int serialNum = 1000; // �ø���ѹ�(�������)

	private int studentId; // �й�
	private String name; // �̸�

	// ������
	public Student(String name) {
		serialNum++; //�ο��Ҷ� ���� 1�� ����
		this.studentId = serialNum;
		this.name = name;
	}

	// �޼ҵ�
	public static int getSerialNum() { // �ø���ѹ� �ο�
		return serialNum;

	}

	public int getStudentId() { // �й� �ο�
		return studentId;

	}

	public String getName() { // �̸� Ȯ��
		return name;
	}
}
