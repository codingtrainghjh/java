package com.yedam.java.question;

public interface Payment {
	public static final double OFFLINE_PAYMENT_RATIO = 0.01;
	public static final double ONLINE_PAYMENT_RATIO = 0.03;
	public static final double SIMPLE_PAYMENT_RATIO = 0.05;
	
	int offline(int price);
	int online(int price);
	int simple(int price);
	void showCardInfo();
	
		
	
	
}
