package com.yedam.homework;

public class Product {
	//��ǰ�� ���� ������ ������ Ŭ����
	//�ʵ�
	private String name;
	private int price;
	//������
	public Product() {}
	
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	//�޼ҵ�
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return this.price;
	}
	//������� ���3
	private void showInfo() {
		System.out.println(name + " : " + price);
		
	}

}
