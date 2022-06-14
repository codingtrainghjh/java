package com.yedam.java.home;

import java.util.Scanner;

public class BookSystem implements BookProgram {
	private Scanner sc = new Scanner(System.in);

	@Override
	public void menuPrint() {
		System.out.println("==========================================");
		System.out.println("1.�����Է� | 2.��ü��ȸ | 3.�˻� | 4.�м� | 5.����");
		System.out.println("==========================================");
	}

	@Override
	public void inputInfo(BookAccess access) {
		Book info = inputAll();
		access.insert(info);
		

	}

	private Book inputAll() {
		
		System.out.println("����>");
		String title = sc.nextLine();
		System.out.println("����>");
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
			System.out.println("���� : " + data.getTitle() + ", ���� : " + data.getPrice());
			
		} catch (Exception e) {
			System.out.println("�������� �ʴ� �����Դϴ�.");

		}

	}

	private int inputIsbn() {
		System.out.println("�˻� ��ȣ>");
		return Integer.parseInt(sc.nextLine());
	}

	@Override
	public void printRepot(BookAccess access) {
		// �ְ� ����
		System.out.println("�ְ� ����>");
		Book maxInfo = selectMaxPrice(access);
		maxInfo.showInfo();

		// ���� ����
		System.out.println("���� ����>");
		Book minInfo = selectMinPrice(access);
		minInfo.showInfo();

		// ���
		System.out.println("��հ�>");
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
	 * sum += info.getPrice();(���ǿ� �����ϴ� ����� ����)
	 * info.shoInfo();(���ǿ� �����ϴ� ����� ������ ���)
	 * 	}
	 * }
	 * double avg = (double)sum / (list.length -2);
	 * System.out.print("�ְ��ݰ� ���������� ������ ��� >");
	 * System.out.printf(%.2f\n", avg);
	 */
}
