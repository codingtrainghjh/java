package com.yedam.java.ch1201;

public class ThreadB extends Thread {
	//�޼ҵ带 �������̵��ϰų� Ŭ������ ��ӹ޾Ƶ� ������� ���ư�
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {
			System.out.println("���� ���� : " + i);
			try {
				Thread.sleep(500); //0.5��(�и�����)
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
