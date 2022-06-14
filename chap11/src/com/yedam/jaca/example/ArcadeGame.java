package com.yedam.jaca.example;

public class ArcadeGame implements Keypad{
	
	int mode = NORMAL_MODE;

	@Override
	public void leftUpButton() {
		System.out.println("ĳ���Ͱ� ������ �̵��մϴ�.");
	}

	@Override
	public void leftDownButton() {
		System.out.println("ĳ���Ͱ� �ڷ� �̵��մϴ�.");
		
	}

	@Override
	public void rightUpButton() {
		if(mode == Keypad.NORMAL_MODE) {
			System.out.println("ĳ���Ͱ� �Ϲݰ����� �մϴ�.");
		}else if(mode == Keypad.HARD_MODE) {
			System.out.println("ĳ���Ͱ� ���Ӱ����� �մϴ�.");
		}
		
	}

	@Override
	public void rightDownButton() {
		if(mode == Keypad.NORMAL_MODE) {
			System.out.println("ĳ���Ͱ� HIT �߽��ϴ�.");
		}else if(mode == Keypad.HARD_MODE) {
			System.out.println("ĳ���Ͱ� DOUBLE HIT �߽��ϴ�.");
		}
		
	}

	@Override
	public void changeMode() {
		System.out.println("��带 ��ȯ�մϴ�.");
		
	}

}
