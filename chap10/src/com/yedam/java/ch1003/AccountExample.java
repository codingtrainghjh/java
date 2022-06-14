package com.yedam.java.ch1003;

public class AccountExample {

	public static void main(String[] args) {
		Account account = new Account();

		account.deposit(100000);
		System.out.println("���ݾ� : " + account.getBalnace());

		try {
			account.withDraw(3000000);
		} catch (BalanceInsufficientException e) {
			// e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
