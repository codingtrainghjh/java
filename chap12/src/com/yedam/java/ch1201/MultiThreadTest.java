package com.yedam.java.ch1201;

public class MultiThreadTest {
	/*
	 * 메인의 실행문과 쓰레드의 반복문이 동시실행
	 */
	public static void main(String[] args) {
		Thread main = Thread.currentThread();
		System.out.println("메인 스레드 : " + main.getName());
//		Runnable a = new ThreadA();
//		Thread thread = new Thread(a);
		Thread thread = new ThreadB();
		thread.setName("threadA");
		System.out.println("작업 스레드 : " + thread.getName());
		thread.start();
		
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
