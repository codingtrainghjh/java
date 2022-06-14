package com.yedam.java.home;

public class BookDAO implements BookAccess {
	//�̱���
	private static BookDAO instance = new BookDAO();
	private BookDAO() {
		init();
	}

	public static BookDAO getInstance() {
		return instance;
	}
	//������ ����
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
		//���� �ʵ� -> �ӽú����� �� ����
		Book[] tempList = dataList;
		//���� �ʵ� �ʱ�ȭ
		int tempIndex = listIndex;

		init();

		//�ӽ� ���� -> �����ʵ�� ���� �ű�
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
		//�����͸� ã���� �˾Ƽ� ����
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
