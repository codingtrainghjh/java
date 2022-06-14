package com.yedam.java.home;

public interface BookAccess {
	void insert(Book book);

	void update(Book book);

	void delete(int isbn);

	Book[] selectAll();

	Book selectone(int isbn);
}
