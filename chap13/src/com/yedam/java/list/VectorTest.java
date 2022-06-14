package com.yedam.java.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		
		
		ThreadA thA = new ThreadA();
		thA.setList(list);
		thA.start();
		ThreadA thB = new ThreadA();
		thB.setList(list);
		thB.start();
		
	}

}
