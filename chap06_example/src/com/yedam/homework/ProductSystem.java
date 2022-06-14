package com.yedam.homework;

public class ProductSystem {
	private Product[] list;
	private int index;

	public ProductSystem() {
		index = -1;
	}

	// 1.��ǰ �� �Է�
	public void setListSize(int size) {
		list = new Product[size];
	}

	// 2.��ǰ �� ���� �Է�
	public void putProduct(String name, int price) {
		Product product = new Product();
		product.setName(name);
		product.setPrice(price);

		list[++index] = product;
	}

	// 3.��ǰ�� ���� ���
	public void printList() {
		for (int i = 0; i <= index; i++) {
			// ���1
			Product product = list[i];
			System.out.println(product.getName() + " : " + product.getPrice());
			// ���2
			// System.out.println(list[i].getName() + " : " + list[i].getPrice());
			// ���3
			// list[i].showInfo();
		}
	}

	// 4.�м�
	public void analysis() {
		int imax = list[0].getPrice(); //������ ��ǰ���� ����
		String maxName = list[0].getName(); //������ ��ǰ��� ����
		for (int i = 1; i < list.length; i++) {
			if (imax < list[i].getPrice()) { //�ְ��� ��
				imax = list[i].getPrice(); //�ְ��� ��ǰ ���
				maxName = list[i].getName(); //�ְ��� ��ǰ��
			}
		}
		System.out.println("�ְ��� - " + maxName +" : "+ imax);
		
		int sum = 0; //�հ� ���
		for (int j = 0; j < list.length; j++) {
			sum += list[j].getPrice(); //�հ谡�� ��

		}
		sum = sum - imax; //�ְ��� ����

		System.out.println("�ְ��� ������ ���� : " + sum);
	}
	// �������� ���
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
				continue; // �� ������ �����Ҷ��� ���� ���� �����ϰڴ�.
			result += temp.getPrice();

			/*
			 * if(temp.getPrice() < maxInfo.getPrice()){ result += temp.getPrice();
			 */
		}
		return result;
	}
}
