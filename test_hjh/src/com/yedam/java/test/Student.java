package com.yedam.java.test;

public class Student {
	// �ʵ�
	private int studentNo;
	private String name;
	private int score;

	// ������
	public Student() {}
	
	public Student(int studentNo, String name, int score) {
		this.studentNo = studentNo;
		this.name = name;
		this.score = score;
	}
	//�޼ҵ�
	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}
	public int getStudentNo() {
		return this.studentNo;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public int getScore() {
		return this.score;
	}
}
