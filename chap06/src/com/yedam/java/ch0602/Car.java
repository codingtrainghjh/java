package com.yedam.java.ch0602;

public class Car {
	//필드
	String company = "현대자동차";
	String model = "그랜저";
	String color = "검정";
	int maxSpeed = 350;
	int speed;
	
	
	Car() {}    //기본 생성자
	
	Car(String color){
		//this.color = color;
		this("그랜저",color, 350);
		this.company ="기아"; 
	}
	
	Car(String model, String color){
		//this.model = model;
		//this.color = color;
		this(model,color,350);
	}
	
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	

}
