package com.yedam.java.ch1202;

public class PrintThread extends Thread {
	@Override
	public void run() {
		//interrupt -> �۾� �� �Ͻ����� �߰��۾��� �ʿ��� ���
		while(true) {
			try {
				System.out.println("������");
				Thread.sleep(1000);
			}catch (InterruptedException e) {
			System.out.println("interrut method ����");
			}
			
			try {
				while(true) {		
			//interrupt -> �۾� �����带 �����ų ���
			System.out.println("������");
			Thread.sleep(1000);
		}
		}catch (InterruptedException e) {
			System.out.println("interrut method ����");
		}
		System.out.println("�ڿ� ����");
		System.out.println("����");
	}
}
	}