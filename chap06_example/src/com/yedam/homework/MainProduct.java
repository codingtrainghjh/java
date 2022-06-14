package com.yedam.homework;

import java.util.Scanner;

public class MainProduct {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		ProductSystem productSystem = new ProductSystem();

		while (run) {
			System.out.println("1.상품 수 | 2. 상품 및 가격입력 | 3. 제품별 가격 | 4.분석 | 5.종료");
			System.out.print("선택> ");
			int selectNo = 0;
			// 정수값 입력을 판별하는 명령어(try-catch)
			try {
				selectNo = Integer.parseInt(sc.nextLine());
				//nextLine은 '엔터'를 포함한 문장을 그대로 읽어들임
				// 1번
				if (selectNo == 1) {
					System.out.println("상품 수를 입력해주세요.");
					System.out.print("상품 수> ");
					int size = Integer.parseInt(sc.nextLine());
					productSystem.setListSize(size);
					// 2번
				} else if (selectNo == 2) {
					System.out.println("상품명과 가격을 입력해주세요.");
					System.out.print("상품명> ");
					String name = sc.nextLine();
					System.out.print("가격> ");
					int price = Integer.parseInt(sc.nextLine());
					productSystem.putProduct(name, price);
					// 3번
				} else if (selectNo == 3) {
					productSystem.printList();
					// 4번
				} else if (selectNo == 4) {
					productSystem.analysis();
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
