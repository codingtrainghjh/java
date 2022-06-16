package com.yedam.app;

public class StockManagement {
	
	public StockManagement() {
		while(true) {
			//메뉴 출력
			menuPrint();
			//메뉴 입력
			menuInsert();
			//각 기능별 실행
		}
	}
	
	private void menuPrint() {
		System.out.println(" 1.제품등록 2.입고 3.출고 4.제품재고 5.전체재고 9.종료 ");
	}
	
	private void menuInsert() {
		int menu = 0;
		if(menu == 1) {
			System.out.println("제품ID>>");
			System.out.println("제품명>>");
			System.out.println("제품가격");
		}
	}
}
