package com.yedam.java.ch1201;

public class ThreadB extends Thread {
	//메소드를 오버라이딩하거나 클래스를 상속받아도 쓰레드는 돌아감
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			System.out.println("현재 순서 : " + i);
			try {
				Thread.sleep(500); //0.5초(밀리단위)
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
