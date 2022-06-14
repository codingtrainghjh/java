package com.yedam.java.list;

import java.util.List;

public class ThreadB {
	private List<Integer> list;

	public void setList(List<Integer> list) {
		this.list = list;
	}
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			list.remove(1 + i);
		}

		for (int data : list) {
			System.out.println(Thread.currentThread().getName() + " : " + data);
		}
	}
}
