package com.yedam.java.ch0801;

//인터페이스에서는 'static final'과 'abstract'가 기본설정이다. 그래서 굳이 넣지 않아도 되지만, 없다고 하여 기능을 하지 않는것은 아니다.

public interface RemoteControl {
	// 상수 필드
	public static final int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;

	// 추상메소드
	public abstract void turnOn();

	public void turnOff();

	public void setVolume(int volume);
}
