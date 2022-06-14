package com.yedam.java.ch0701;

public class ComputerTest {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		System.out.println("원 면적 : " 
					+ cal.areaCircle(10));

	
		Computor com = new Computor();
			System.out.println("원 면적 : " 
					+ com.areaCircle(10));
			
			System.out.println();
			//출력우위는 자식이 더 높음, 부모는 따로 지정해주어야함
			com.print();
			
	}	
}
