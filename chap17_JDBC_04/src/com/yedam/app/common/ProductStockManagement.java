package com.yedam.app.common;

import com.yedam.app.products.Product;

public class ProductStockManagement extends Management {
	public ProductStockManagement() {
		while (true) {
			menuPrint();

			int menuNo = menuSelect();
			// 재고 확인
			// 이름으로 검색해서 재고 갯수가 나오게 하는 방식
			if (menuNo == 1) {
				checkProductStock();

				// 뒤로가기
			} else if (menuNo == 9) {
				back();
				break;

				// 입력오류
			} else {
				showInputError();
			}
		}
	}

	@Override
	protected void menuPrint() {
		System.out.println("===================");
		System.out.println(" 1.재고 확인 9.뒤로가기");
		System.out.println("===================");
	}

	private void back() {
		System.out.println("메인으로 돌아갑니다.");
	}

	private void checkProductStock() {
		String productName = inputName();
		//제품정보 검색
		//-1 products 테이블에서 정보
		Product product = pDAO.selectOne(productName);
		
		if(product == null) {
			System.out.println("등록된 정보가 없습니다.");
			return;
		}
		System.out.println("제품 이름 : " + productName);
		System.out.println("재고 수량 : " + product.getProductStock());
	}
	
	private String inputName() {
		System.out.println("제품이름>");
		return sc.nextLine();
	}
}
