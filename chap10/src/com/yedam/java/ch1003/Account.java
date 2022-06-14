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
		if (balance < money) { // 메소드내에서 스로우를 발생시키는 이유는 외부에서 처리하도록 유도하기 위해서이다.(문법적 이유X)
			try {
				throw new BalanceInsufficientException("잔고부족 : " + (money - balance) + "모자랍니다.");
			} catch (BalanceInsufficientException e) {
				e.printStackTrace();
			}
		}
		balance -= money;
		return balance;
	}

}
