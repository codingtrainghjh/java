package com.yedam.jaca.example;

import java.util.Scanner;

public class RandomGame {
	private Keypad game;
	
	public RandomGame() {
		//최초로 게임 셋팅
		setRandomGame();
		while(true) {
			//메뉴출력
			menuPrint();
			//메뉴입력
			int meueNo = menuSelect();
			//기능별 실행
			if(meueNo == 1) {
				game.leftUpButton();
			}else if(meueNo == 2) {
				game.leftDownButton();
			}else if(meueNo == 3) {
				game.rightUpButton();
			}else if(meueNo == 4) {
				game.rightDownButton();
			}else if(meueNo == 5) {
				game.changeMode();
			}else if(meueNo == 0) {
				setRandomGame();
			}else if(meueNo == 9) {
				exit();
				break;
			}else {
				printInputError();
			}
		}
	}
	private void menuPrint() {
		System.out.println("============================================================================================");
		System.out.println("<< 1.LeftUP | 2.LeftDown | 3.RightUp | 4.RightDown | 5.ModeChange | 0.GameChange | 9.EXIT >>");
		System.out.println("============================================================================================");
	
	}
	private void exit() {
		System.out.println("EXIT");
	}
	private void printInputError() {
		System.out.println("메뉴를 잘못 선택하셨습니다.");
	}
	private void setRandomGame() {
		int random = (int)(Math.random()*2);
		switch(random) {
		case 0:
			game = new RPGgame();
			break;
		case 1:
			game = new ArcadeGame();
			break;
			}
	}
	private int menuSelect() {
		Scanner scanner = new Scanner(System.in);
		int menuNo = scanner.nextInt();
		return menuNo;
	}
	
}

