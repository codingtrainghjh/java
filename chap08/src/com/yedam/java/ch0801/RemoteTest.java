package com.yedam.java.ch0801;

public class RemoteTest {

	public static void main(String[] args) {
		// RemoteControl rc = new TV();
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();

		SmartControl sc = new TV();
		sc.searchInternet("���̹�");
		sc.executeApp("����");

		TV tv = new TV();
		tv.turnOn();

		Control con = new TV();
		con.turnOn();
		con.executeApp("����");
	}

}
