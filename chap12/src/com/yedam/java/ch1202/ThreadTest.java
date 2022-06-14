package com.yedam.java.ch1202;

public class ThreadTest {

	public static void main(String[] args) {
		ThreadA thread = new ThreadA();
		thread.start();
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		thread.setStop(true);
		
		System.out.println("-------------------------");
		
		Thread sub = new Thread() {
			@Override
			public void run() {
				while(true) {
					if(Thread.interrupted())
						break;
					System.out.println("============���� ��");
				}
				System.out.println("============�ڿ� ����");
				System.out.println("============����");
			}
		};
		
		sub.start();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		sub.interrupt();
	}

}
