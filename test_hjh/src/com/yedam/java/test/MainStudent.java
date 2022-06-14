package com.yedam.java.test;

import java.util.Scanner;

public class MainStudent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		StudentSystem studentSystem = new StudentSystem();
		
		while (run) {
			System.out.println("=== 1.학생수 입력, 2.학생정보 등록, 3. 학생정보 전체조회, 4.학생정보 분석, 5.종료 ===");
			System.out.print("선택> ");
			int selectNo = 0;
			try {
				selectNo = Integer.parseInt(sc.nextLine());
				// 1번
				if (selectNo == 1) {
					System.out.println("학생 수를 입력해주세요.");
					System.out.print("학생 수> ");
					int size = Integer.parseInt(sc.nextLine());
					studentSystem.Student(size);
					// 2번
				} else if (selectNo == 2) {
					System.out.println("학생정보를 입력해주세요.");
					System.out.print("학번> ");
					int no = Integer.parseInt(sc.nextLine());
					System.out.print("이름> ");
					String name = sc.nextLine();
					System.out.print("점수> ");
					int score = Integer.parseInt(sc.nextLine());
					studentSystem.studInfo(no, name, score);
					// 3번
				} else if (selectNo == 3) {
					studentSystem.studList();
					// 4번
				} else if (selectNo == 4) {
					studentSystem.findMaxMin();
					// 5번
				} else if (selectNo == 5) {
					System.out.println("프로그램을 종료합니다.");
					run = false;
					// 잘못된 값 입력시
				} else {
					System.out.println("정확한 값을 입력해주세요.");
				}
			} catch (NumberFormatException e) {
				System.out.println("잘못된 값입니다.");
				System.out.println("다시 입력해주세요.");
			}

		}

	}

}
