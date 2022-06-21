package com.yedam.app.common;

import java.util.Scanner;

import com.yedam.app.deal.ReceivingGoodsDAO;
import com.yedam.app.products.ProductInfoManagement;
import com.yedam.app.products.ProductsDAO;

public class Management {
	//필드
	//상속이 필드에서 먹을수도 있음
	protected Scanner sc = new Scanner(System.in);
	protected ProductsDAO pDAO = ProductsDAO.getInstance();
	protected ReceivingGoodsDAO rDAO = ReceivingGoodsDAO.getInstance();
	protected TakeOutGoodsDAO tDAO = TakeOutGoodsDAO.getInstance();
	
	//생성자 -> run
	public void run() {
		while(true) {
			menuPrint();
			
			int menuNo = menuSelect();
			
			//제품정보관리
			if(menuNo == 1) {
				new ProductInfoManagement();
				
				//제품재고관리
			}else if(menuNo == 2) {
				new ProductStockManagement();
				
				//프로그램종료
			}else if(menuNo == 9) {
				exit();
				break;
				
				//입력오류
			}else {
				showInputError();
			}
		}
	}
	
	//메소드
	protected void menuPrint() {
		System.out.println("==============================");
		System.out.println(" 1. 제품정보관리 2.제품재고관리 9.종료");
		System.out.println("==============================");
	}
	protected int menuSelect() {
		int menuNo = 0;
		try {
			menuNo = Integer.parseInt(sc.nextLine());
		}catch(NumberFormatException e) {
			System.out.println("숫자를 입력해주시기 바랍니다.");
		}
		return menuNo;
	}
	protected void exit() {
		System.out.println("프로그램을 종료합니다.");
	}
	protected void showInputError() {
		System.out.println("메뉴에서 입력해주시기 바랍니다.");
	}
}
