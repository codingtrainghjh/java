package com.yedam.java.test;

public class StudentSystem {
	private Student[] list;
	private int index;

	public StudentSystem() {
		index = -1;
	}

	// 1.학생수 입력
	public void Student(int size) {
		list = new Student[size];
	}

	// 2.학생정보 등록
	public void studInfo(int studentNo, String name, int score) {
		Student student = new Student();
		student.setStudentNo(studentNo);
		student.setName(name);
		student.setScore(score);

		list[++index] = student;
	}

	// 3.학생정보 전체조회
	public void studList() {
		for (int i = 0; i <= index; i++) {
			;

			Student student = list[i];
			System.out.println(student.getStudentNo() + " 학번의 점수는 " + student.getScore() + "점 입니다.");
		}
	}

	// 4.학생정보 분석
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
		System.out.println("최고점수 : " + max + "점, 학번 : " + maxNo);
		System.out.println("최저점수 : " + min + "점, 학번 : " + minNo);
		System.out.println("최고점, 최저점을 제외한 평균 점수는 " + avg + "점 입니다.");

	}
}
