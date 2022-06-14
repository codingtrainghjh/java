package com.yedam.java.ch1501;
//제네릭 타입 => 클래스, 인터페이스 타입을 대체
public class Bag {
	private Object object;
	public void set(Object object) {
		this.object = object;
	}
	
	public Object get() {
		return object;
	}
}
