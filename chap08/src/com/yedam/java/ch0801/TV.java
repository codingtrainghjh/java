package com.yedam.java.ch0801;

//����� 'extends' , ������ 'implements'
public class TV implements Control {

	private int volume;

	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");

	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("���� TV ���� : " + this.volume);
	}

	@Override
	public void searchInternet(String url) {
		System.out.println(url + "�� �˻��մϴ�.");

	}

	@Override
	public void executeApp(String app) {
		System.out.println(app + "�� �����մϴ�.");

	}

	@Override
	public void plusService() {
		// TODO Auto-generated method stub
		
	}

}
