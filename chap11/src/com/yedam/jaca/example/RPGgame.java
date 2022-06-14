package com.yedam.jaca.example;

public class RPGgame implements Keypad{
	
	int mode = NORMAL_MODE;
	
	@Override
	public void leftUpButton() {
		System.out.println("캐릭터가 위쪽으로 이동합니다.");		
	}

	@Override
	public void leftDownButton() {
		System.out.println("캐릭터가 아래쪽으로 이동합니다.");
		
	}

	@Override
	public void rightUpButton() {
		if(mode == Keypad.NORMAL_MODE) {
			System.out.println("캐릭터가 한 칸 점프합니다.");
		}else if(mode == Keypad.HARD_MODE) {
			System.out.println("캐릭터가 두 칸 점프합니다.");
		}
				
			
	}

	@Override
	public void rightDownButton() {
		if(mode == Keypad.NORMAL_MODE) {
			System.out.println("캐릭터가 일반공격을 합니다.");
		}else if(mode == Keypad.HARD_MODE) {
			System.out.println("캐릭터가 HIT 했습니다.");
		}
		
	}

	@Override
	public void changeMode() {
		System.out.println("모드를 전환합니다.");
		
	}
	
	
}
