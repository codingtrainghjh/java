package com.yedam.homework;

public class ProductSystem {
	private Product[] list;
	private int index;

	public ProductSystem() {
		index = -1;
	}

	// 1.상품 수 입력
	public void setListSize(int size) {
		list = new Product[size];
	}

	// 2.상품 및 가격 입력
	public void putProduct(String name, int price) {
		Product product = new Product();
		product.setName(name);
		product.setPrice(price);

		list[++index] = product;
	}

	// 3.제품별 가격 출력
	public void printList() {
		for (int i = 0; i <= index; i++) {
			// 방법1
			Product product = list[i];
			System.out.println(product.getName() + " : " + product.getPrice());
			// 방법2
			// System.out.println(list[i].getName() + " : " + list[i].getPrice());
			// 방법3
			// list[i].showInfo();
		}
	}

	// 4.분석
	public void analysis() {
		int imax = list[0].getPrice(); //가져올 상품가격 지정
		String maxName = list[0].getName(); //가져올 상품목록 지정
		for (int i = 1; i < list.length; i++) {
			if (imax < list[i].getPrice()) { //최고가격 비교
				imax = list[i].getPrice(); //최고가격 물품 담기
				maxName = list[i].getName(); //최고가격 물품명
			}
		}
		System.out.println("최고가격 - " + maxName +" : "+ imax);
		
		int sum = 0; //합계 담기
		for (int j = 0; j < list.length; j++) {
			sum += list[j].getPrice(); //합계가격 식

		}
		sum = sum - imax; //최고가격 제외

		System.out.println("최고가를 제외한 총합 : " + sum);
	}
	// 교수님의 방법
	public Product getMaxPriceInfo() {
		Product maxInfo = list[0];
		for (int i = 1; i < index; i++) {
			if (maxInfo.getPrice() < list[i].getPrice())
				;
			maxInfo = list[i];
		}
		return maxInfo;
	}

	public int getTotalprice() {
		int sum = 0;
		for (Product temp : list) {
			sum += temp.getPrice();
		}
		Product maxInfo = getMaxPriceInfo();
		int result = sum - maxInfo.getPrice();
		// int result = sum - getMaxPriceInfo().getPrice();

		for (Product temp : list) {
			if (temp.getPrice() == maxInfo.getPrice())
				continue; // 위 조건을 만족할때만 다음 값을 실행하겠다.
			result += temp.getPrice();

			/*
			 * if(temp.getPrice() < maxInfo.getPrice()){ result += temp.getPrice();
			 */
		}
		return result;
	}
}
