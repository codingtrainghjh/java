package com.yedam.java.ch0603;

import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		Program program = new Program();
		
		while(run) {
			System.out.println("1.�л� �� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.print("����> ");
			int selectNo = Integer.parseInt(sc.nextLine());
			
			if(selectNo == 1) {
				System.out.print("�л� ��>");
				int student = Integer.parseInt(sc.nextLine());
				program.setStudentNum(student);
			}else if(selectNo == 2) {
				System.out.print("����> ");
				int score = Integer.parseInt(sc.nextLine());
				program.setStudentScore(score);
			}else if(selectNo == 3) {
				program.printScores();
			}else if(selectNo == 4) {
				program.printResult();	
			}else if(selectNo == 5) {
				run = false;
				System.out.println("���α׷� ����");
			}
			
			
			
			
		}

	}

}
