package com.yedam.java.ch0604;

import java.util.Scanner;

public class Calculator_prototype {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		Calculator Calculator = new Calculator();

		// 계산기

		while (run) {
			System.out.println("1.갯수입력 | 2.숫자입력 | 3.덧셈 | 4.뺄셈 | 5.곱셈 | 6.나눗셈 | 7.종료");
			System.out.print("선택> ");
			int selectNo = Integer.parseInt(sc.nextLine());

			// 1.갯수 입력
			if (selectNo == 1) {
				System.out.println("갯수를 입력해주세요.");
				System.out.print("입력> ");
				int size = Integer.parseInt(sc.nextLine());
				Calculator.setArraySize(size);
				// 2.숫자 입력
			} else if (selectNo == 2) {
				System.out.println("숫자를 입력해주세요.");
				System.out.print("입력> ");
				int num = Integer.parseInt(sc.nextLine());
				Calculator.setNum(num);
			} else if (selectNo == 3) {
				Calculator.plus();
			} else if (selectNo == 4) {
				Calculator.minus();
			} else if (selectNo == 5) {
				Calculator.multiply();
			} else if (selectNo == 6) {
				Calculator.division();
			} else if (selectNo == 7) {
				run = false;
				System.out.println("계산을 종료합니다.");
				

			}

		}

	}
}
