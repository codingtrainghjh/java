package com.yedam.java.ch1003;

public class Account {
	private long balance;

	public long getBalnace() {
		return balance;
	}

	public void deposit(int money) {
		balance += money;
	}

	public long withDraw(int money) throws BalanceInsufficientException {
		if (balance < money) { // �޼ҵ峻���� ���ο츦 �߻���Ű�� ������ �ܺο��� ó���ϵ��� �����ϱ� ���ؼ��̴�.(������ ����X)
			try {
				throw new BalanceInsufficientException("�ܰ���� : " + (money - balance) + "���ڶ��ϴ�.");
			} catch (BalanceInsufficientException e) {
				e.printStackTrace();
			}
		}
		balance -= money;
		return balance;
	}

}
