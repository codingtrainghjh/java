package com.yedam.example2;

public class CardMain {

	public static void main(String[] args) {
		CardFactory instance = CardFactory.getInstance(); // 잠긴상태이므로

		Card kjh = instance.createCard("hong");

		System.out.println(kjh.getserialNum());
		System.out.println(kjh.getName() + "의 번호 : " + kjh.getCardNum());

		Card aaa = instance.createCard("jun");

		System.out.println(aaa.getserialNum());
		System.out.println(aaa.getName() + "의 번호 : " + aaa.getCardNum());

		System.out.println();

		Card first = instance.createCard(null); // 교수님 방법
		Card second = instance.createCard(null);
		Card third = instance.createCard(null);
		System.out.println("first : " + first.getCardNum());
		System.out.println("second : " + second.getCardNum());
		System.out.println("third : " + third.getCardNum());

	}

}
