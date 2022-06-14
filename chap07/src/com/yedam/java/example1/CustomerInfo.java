package com.yedam.java.example1;

import java.util.Scanner;

public class CustomerInfo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		Customer silver = new Customer(0, "kj");
		Gold gold = new Gold(0, "ok");
		VIP vip = new VIP(0, "qp", "nnn");

		System.out.println(silver.calcPrice(1000));
		String showInfo = silver.showInfo();
		System.out.println(showInfo);

		System.out.println();

		System.out.println(gold.calcPrice(1000));
		String showInfo2 = gold.showInfo();
		System.out.println(showInfo2);

		System.out.println();

		System.out.println(vip.calcPrice(1000));
		String showInfo3 = vip.showInfo();
		System.out.println(showInfo3);
	}
}
