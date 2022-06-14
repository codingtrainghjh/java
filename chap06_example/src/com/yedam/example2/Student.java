package com.yedam.example2;

public class Student {
	// 필드
	private static int serialNum = 1000; // 시리얼넘버(정적멤버)

	private int studentId; // 학번
	private String name; // 이름

	// 생성자
	public Student(String name) {
		serialNum++; //부여할때 마다 1씩 증가
		this.studentId = serialNum;
		this.name = name;
	}

	// 메소드
	public static int getSerialNum() { // 시리얼넘버 부여
		return serialNum;

	}

	public int getStudentId() { // 학번 부여
		return studentId;

	}

	public String getName() { // 이름 확인
		return name;
	}
}
