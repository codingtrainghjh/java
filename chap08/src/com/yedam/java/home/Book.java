package com.yedam.java.home;

//VO, DTO Ŭ����
public class Book {
	private static int serialNum=1000;
	
	private int isbn;
	private String title;
	private int price;
	
	public Book() {}
	//�ø��� �ѹ��� �ڵ����� ����
	public Book(String title, int price) {
		serialNum++;
		this.isbn = serialNum;
		this.title = title;
		this.price = price;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	public void showInfo() {
		System.out.println("ISBN : " + isbn + ", ���� : " + title + ", ���� : " + price);
	}
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", title=" + title + ", price=" + price + "]";
	}
	
	
}
