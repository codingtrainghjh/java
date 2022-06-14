package com.yedam.jaca.example;

public class ArcadeGame implements Keypad{
	
	int mode = NORMAL_MODE;

	@Override
	public void leftUpButton() {
		System.out.println("캐릭터가 앞으로 이동합니다.");
	}

	@Override
	public void leftDownButton() {
		System.out.println("캐릭터가 뒤로 이동합니다.");
		
	}

	@Override
	public void rightUpButton() {
		if(mode == Keypad.NORMAL_MODE) {
			System.out.println("캐릭터가 일반공격을 합니다.");
		}else if(mode == Keypad.HARD_MODE) {
			System.out.println("캐릭터가 연속공격을 합니다.");
		}
		
	}

	@Override
	public void rightDownButton() {
		if(mode == Keypad.NORMAL_MODE) {
			System.out.println("캐릭터가 HIT 했습니다.");
		}else if(mode == Keypad.HARD_MODE) {
			System.out.println("캐릭터가 DOUBLE HIT 했습니다.");
		}
		
	}

	@Override
	public void changeMode() {
		System.out.println("모드를 전환합니다.");
		
	}

}
