package com.yedam.java.ch1201;

public class UserTest {
//쓰레드는 길?
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		//cal.setMemory(100);
		
		User user1 = new User();
		user1.setCalculator(cal);
		user1.start();
		//200
		
		
		User user2 = new User();
		user2.setCalculator(cal);
		user2.start();
		//300
	}

}
