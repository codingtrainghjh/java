package com.yedam.example2;

public class CardFactory {
	// 필드
	private static CardFactory instance = new CardFactory(); // 인스턴스 생성(프라이빗 지정)
	// 생성자

	private CardFactory() {
	}

	// 메소드
	public static CardFactory getInstance() { // 메소드를 통해 공유
		return instance;
	}
	public Card createCard(String name) {
		return new Card(name);
	}
}
