package com.yedam.java.example2;

public class Student {
	//�ʵ�
	private int id;
	private String name;
	private int score;
	
	//������
	public Student() {}
	
	public Student(int id, String name, int score) {
		this.id = id;
		this.name = name;
		this.score = score;
	}
	//�޼ҵ�

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public void showInfo() {
		System.out.println("�й� : " + id + ", �̸� : " + name + ", ���� :" + score);
		
	}
}
