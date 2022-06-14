package com.yedam.jaca.example;

public class RPGgame implements Keypad{
	
	int mode = NORMAL_MODE;
	
	@Override
	public void leftUpButton() {
		System.out.println("ĳ���Ͱ� �������� �̵��մϴ�.");		
	}

	@Override
	public void leftDownButton() {
		System.out.println("ĳ���Ͱ� �Ʒ������� �̵��մϴ�.");
		
	}

	@Override
	public void rightUpButton() {
		if(mode == Keypad.NORMAL_MODE) {
			System.out.println("ĳ���Ͱ� �� ĭ �����մϴ�.");
		}else if(mode == Keypad.HARD_MODE) {
			System.out.println("ĳ���Ͱ� �� ĭ �����մϴ�.");
		}
				
			
	}

	@Override
	public void rightDownButton() {
		if(mode == Keypad.NORMAL_MODE) {
			System.out.println("ĳ���Ͱ� �Ϲݰ����� �մϴ�.");
		}else if(mode == Keypad.HARD_MODE) {
			System.out.println("ĳ���Ͱ� HIT �߽��ϴ�.");
		}
		
	}

	@Override
	public void changeMode() {
		System.out.println("��带 ��ȯ�մϴ�.");
		
	}
	
	
}
