package app;

import java.util.Scanner;

public class Rentalmanagement {
	private Scanner sc = new Scanner(System.in);
	
	public Rentalmanagement() {
	while (true) {
		// 메뉴 출력
		menuPrint();
		// 메뉴 입력
		int menuNo = selectMenu();

		// 각 기능별 실행
		if (menuNo == 1) {
			// 전체조회
			selectAll();
		} else if (menuNo == 2) {
			// 단건조회
			selectOne();
		} else if (menuNo == 3) {
			// 내용검색
			searchContent();
		} else if (menuNo == 4) {
			// 대여가능
			availableRental();
		} else if (menuNo == 5) {
			// 책 대여
			bookRental();
		} else if (menuNo == 6) {
			//책 반납
			bookReturn();
		} else if (menuNo == 7) {
			//책 등록
			bookRegist();
		} else if (menuNo == 9) {
			// 종료
			exit();
			break;
		} else {
			// 입력오류
			showInputError();
		}
	}
}

	private void menuPrint() {
		System.out.println("-1.전체조회 | 2.단건조회 | 3.내용검색 | 4.대여가능 | 5.책 대여 | "
							+ "6.책 반납 | 7. 책 등록 | 9.종료");
		
}
	private int selectMenu() {
		int menu = 0;
		try {
			menu = Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("숫자 형식으로 기입해주세요.");
		}
		return menu;
	}
	
	private void exit() {
		System.out.println("프로그램을 종료합니다.");
	}

	private void showInputError() {
		System.out.println("메뉴를 참고하여 입력해주시기 바랍니다.");
	}
}