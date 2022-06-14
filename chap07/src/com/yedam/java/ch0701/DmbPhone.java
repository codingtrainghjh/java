package com.yedam.java.ch0701;

public class DmbPhone extends Phone{ //extends = 상속
	int ch;


	
	public DmbPhone(String model, String color){
		//super(); //자바 스스로 만든 생성자 호출 파일, 클래스 범위를 부모로 좁힘
		//생성자가 둘 이상일 경우 자바는 읽지 못하므로 개발자가 지정해 주어야 함
		super(model, color);
		//super.model = model;
		//super.color = color;
		//클래스가 아닌 인스턴스에 접근하기 위해 this를 씀
		this.ch = 10;
	}
	
	void turnOnDmb() {
		System.out.println("채널 " + ch + "번 방송 수신을 시작합니다.");
	}
	void turnOffDmb() {
		System.out.println("방송 수신을 종료합니다.");
	}
	void changeChannel(int ch) {
		this.ch = ch;
		System.out.println("채널 " + ch + "번으로 전환합니다.");
	}
}
