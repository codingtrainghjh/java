package com.yedam.example1;

public class TakeTrans {

	public static void main(String[] args) {
		Student hong = new Student("Hong", 5000); //Student 클래스에서 가져옴
		Subway green = new Subway("2호선", 1500);

		hong.take(green);

		hong.showInfo();
		green.showInfo();

		System.out.println();

		
		Bus bus = new Bus("323", 1250);

		hong.take(bus);

		hong.showInfo();
		bus.showInfo();
		
	

	}

}
