package com.yedam.java.ch1601;

public class MainTest {

	public static void main(String[] args) {
		MyFunctionalInterface fi 
		= () -> {System.out.println("���ٽ� ����");};
		
		fi.method();
		
		MyFunctionalInterface mfi
		= new MyFunctionalInterface() {
			
			@Override
			public void method() {
				System.out.println("�͸� ���� ��ü ����");
				
			}
		};
		mfi.method();
		
	}

}
