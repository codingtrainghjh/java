package com.yedam.java.example1;

public class PrioritiyAllocation implements Scheduler {

	// �켱������ ���� ���׶� �������� �켱 ���
	@Override
	public void getNextCall() {
		System.out.println("�� ����� ���� ���� ��ȭ�� ���� �����ɴϴ�.");

	}

	@Override
	public void sendCallToAgent() {
		System.out.println("���� ��ų�� ���� �������� �켱������ �����մϴ�.");

	}

}
