package com.yedam.java.example1;

public class RoundRobin implements Scheduler{
	
	//�������� �����ϰ� ������ ���
	@Override
	public void getNextCall() {
		System.out.println("��� ��ȭ�� ������� ��⿭�� �����ɴϴ�.");
		
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("���� ���� �������� ����մϴ�.");
		
	}

}
