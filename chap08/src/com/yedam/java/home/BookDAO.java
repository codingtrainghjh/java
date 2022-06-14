package com.yedam.java.home;

public class BookDAO implements BookAccess {
	//싱글톤
	private static BookDAO instance = new BookDAO();
	private BookDAO() {
		init();
	}

	public static BookDAO getInstance() {
		return instance;
	}
	//저장할 공간
	private Book[] dataList;
	private int listIndex;

	private void init() {
		dataList = new Book[100];
		listIndex = -1;
	}

	@Override
	public void insert(Book book) {
		dataList[++listIndex] = book;

	}

	@Override
	public void update(Book book) {
		for (int i = 0; i <= listIndex; i++) {
			if (dataList[i].getIsbn() == book.getIsbn()) {
				dataList[i] = book;
			}
		}
		cleanDataList();
	}

	private void cleanDataList() {
		//기존 필드 -> 임시변수로 값 복사
		Book[] tempList = dataList;
		//기존 필드 초기화
		int tempIndex = listIndex;

		init();

		//임시 변수 -> 기존필드로 값을 옮김
		for (int i = 0; i <= tempIndex; i++) {
			if (tempList[i] != null) {
				dataList[++listIndex] = tempList[i];
			}
		}
	}

	@Override
	public void delete(int isbn) {
		for (int i = 0; i <= listIndex; i++) {
			if (dataList[i].getIsbn() == isbn) {
				dataList[i] = null;
			}
		}

	}

	@Override
	public Book[] selectAll() {
		Book[] list = new Book[listIndex + 1];
		for (int i = 0; i < list.length; i++) {
			list[i] = dataList[i];
		}
		return list;
		
	}

	@Override
	public Book selectone(int isbn) {
		//데이터를 찾으면 알아서 복사
		Book book = null;
		//1.int index = 0;
		for (int i = 0; i <= listIndex; i++) {
			if (dataList[i].getIsbn() == isbn) {
				//1.index = i;
				//1.dataList[i].showInfo();
				book = dataList[i];
				break;
			}
		}
		//1.return dataList[index];
		return book;
	}

}
