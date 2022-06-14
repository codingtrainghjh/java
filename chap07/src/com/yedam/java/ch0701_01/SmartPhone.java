package com.yedam.java.ch0701_01;

import com.yedam.java.ch0701.Phone;

public class SmartPhone extends Phone{
	
	//상속관계로 만드려면 필요
	public SmartPhone(String model, String color) {
		super(model, color);
		
	}
	
	
	@Override
	protected void bell() { //혹은 public -> 메소드를 재정의 할 때는 그 이상의 권한을 부여해줘야 함
		super.bell();
		System.out.println("벨소리 : 싸이 - that that!");
	}

	@Override
	public void call() {
		super.call();
		System.out.println("안내 문구 : 전화는 용건만 간단히");
	}
	
	
	

}
