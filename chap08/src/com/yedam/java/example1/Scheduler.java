package com.yedam.java.example1;

public interface Scheduler {
	// ������ ���� ����
	public void getNextCall();

	// �����ڰ� ���� ��⿭�� ����
	public void sendCallToAgent();
}