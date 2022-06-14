package com.yedam.java.ch0801;

//�������̽������� 'static final'�� 'abstract'�� �⺻�����̴�. �׷��� ���� ���� �ʾƵ� ������, ���ٰ� �Ͽ� ����� ���� �ʴ°��� �ƴϴ�.

public interface RemoteControl {
	// ��� �ʵ�
	public static final int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;

	// �߻�޼ҵ�
	public abstract void turnOn();

	public void turnOff();

	public void setVolume(int volume);
}
