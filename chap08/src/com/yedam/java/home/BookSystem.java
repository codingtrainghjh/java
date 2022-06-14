package com.yedam.java.home;

import java.util.Scanner;

public class BookSystem implements BookProgram {
	private Scanner sc = new Scanner(System.in);

	@Override
	public void menuPrint() {
		System.out.println("==========================================");
		System.out.println("1.도서입력 | 2.전체조회 | 3.검색 | 4.분석 | 5.종료");
		System.out.println("==========================================");
	}

	@Override
	public void inputInfo(BookAccess access) {
		Book info = inputAll();
		access.insert(info);
		

	}

	private Book inputAll() {
		
		System.out.println("제목>");
		String title = sc.nextLine();
		System.out.println("가격>");
		int price = Integer.parseInt(sc.nextLine());

		return new Book(title, price);
	}

	@Override
	public void printAllInfo(BookAccess access) {
		Book[] list = access.selectAll();
		for (Book book : list) {
			book.showInfo();
		}

	}

	@Override
	public void printInfo(BookAccess access) {
		try {
			int isbn = inputIsbn();
			
			Book data = access.selectone(isbn);
			System.out.println("제목 : " + data.getTitle() + ", 가격 : " + data.getPrice());
			
		} catch (Exception e) {
			System.out.println("존재하지 않는 도서입니다.");

		}

	}

	private int inputIsbn() {
		System.out.println("검색 번호>");
		return Integer.parseInt(sc.nextLine());
	}

	@Override
	public void printRepot(BookAccess access) {
		// 최고 가격
		System.out.println("최고 가격>");
		Book maxInfo = selectMaxPrice(access);
		maxInfo.showInfo();

		// 최저 가격
		System.out.println("최저 가격>");
		Book minInfo = selectMinPrice(access);
		minInfo.showInfo();

		// 평균
		System.out.println("평균가>");
		double avgResult = calcAvg(access);
		System.out.println(avgResult);
	}

	private Book selectMaxPrice(BookAccess access) {
		Book[] list = access.selectAll();

		Book maxInfo = list[0];
		for (Book info : list) {
			if (maxInfo.getPrice() < info.getPrice()) {
				maxInfo = info;
			}
		}
		return maxInfo;
	}

	private Book selectMinPrice(BookAccess access) {
		Book[] list = access.selectAll();

		Book minInfo = list[0];
		for (Book info : list) {
			if (minInfo.getPrice() > info.getPrice()) {
				minInfo = info;
			}
		}
		return minInfo;
	}

	private double calcAvg(BookAccess access) {
		Book[] list = access.selectAll();

		int sum = 0;
		for (Book info : list) {
			sum += info.getPrice();
		}
		return (double) sum / list.length;
	}
	/* Book[] maxInfo = selectMaxPrice(access);
	 * Book[] minInfo = selectMinPrice(access);
	 *
	 * 
	 * Book[] list = access.selectAll();
	 *
	 * int sum = 0;
	 * for(Book info : list){
	 * if(data.getPrice()>minInfo.getPrice() && info.getPrice() < maxInfo.getPrice()) {
	 * sum += info.getPrice();(조건에 만족하는 경우의 총합)
	 * info.shoInfo();(조건에 만족하는 경우의 정보를 출력)
	 * 	}
	 * }
	 * double avg = (double)sum / (list.length -2);
	 * System.out.print("최고가격과 최저가격을 제외한 평균 >");
	 * System.out.printf(%.2f\n", avg);
	 */
}
