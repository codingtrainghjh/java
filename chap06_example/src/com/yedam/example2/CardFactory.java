package com.yedam.example2;

public class CardFactory {
	// �ʵ�
	private static CardFactory instance = new CardFactory(); // �ν��Ͻ� ����(�����̺� ����)
	// ������

	private CardFactory() {
	}

	// �޼ҵ�
	public static CardFactory getInstance() { // �޼ҵ带 ���� ����
		return instance;
	}
	public Card createCard(String name) {
		return new Card(name);
	}
}
