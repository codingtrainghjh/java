package com.yedam.java.ch0602;

public class Car {
	//�ʵ�
	String company = "�����ڵ���";
	String model = "�׷���";
	String color = "����";
	int maxSpeed = 350;
	int speed;
	
	
	Car() {}    //�⺻ ������
	
	Car(String color){
		//this.color = color;
		this("�׷���",color, 350);
		this.company ="���"; 
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
