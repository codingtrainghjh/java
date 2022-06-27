package com.yedam.java.common;

import java.util.Random;
import java.util.Scanner;

import com.yedam.java.member.Member;
import com.yedam.java.member.MemberDAO;
import com.yedam.java.menu.Menu;
import com.yedam.java.menu.MenuDAO;

public class launchLaunch {
	protected Scanner sc = new Scanner(System.in);
	protected MemberDAO mDAO = MemberDAO.getInstance();
	protected MenuDAO nDAO = MenuDAO.getInstance();
	boolean role = selectRole();
	boolean isMember = cheakIsMember();

	public void run() {
		while (true) {
			menuPrint(role);

			int menuNo = menuSelect();

			if (menuNo == 1) {
				// 점심추천
				recommendlaunch();
			} else if (menuNo == 2 && isMember) {
				// 메뉴추가
				addMenu();
			} else if (menuNo == 3 && isMember) {
				// 게시판이용
				useBoard();
			} else if (menuNo == 4 && role && isMember) {
				// 회원삭제
				deleteMember();
			} else if (menuNo == 5 && role && isMember) {
				// 메뉴삭제
				deleteMenu();
			} else if (menuNo == 9 && role && isMember) {
				// 로그아웃\
				back();
				break;

			} else {
				showInputError();
			}

		}
	}

	private void back() {
		System.out.println("메인으로 돌아갑니다.");
	}

	protected void showInputError() {
		System.out.println("메뉴에서 입력해주시기 바랍니다.");
	}

	protected int menuSelect() {
		int menuNo = 0;
		try {
			menuNo = Integer.parseInt(sc.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("숫자를 입력해주시기 바랍니다.");
		}
		return menuNo;
	}

	protected void menuPrint(boolean isMember) {
		String menu = "";
		menu += "1.점심추천받기 ";
		if (isMember) {
			menu += "2.메뉴추가하기 3.게시판이용";
		}
		if (role) {
			menu += " 4.회원삭제 5.메뉴삭제";
			System.out.println("=========================================================");
			System.out.println(menu);
			System.out.println("=========================================================");
		}
		menu += "9.로그아웃";
	}

	protected boolean cheakIsMember() {
		int memberRole;
		Member loginInfo = LoginControl.getLoginInfo();
		if (loginInfo == null) {
			memberRole = -1; // 비회원
		} else {
			memberRole = loginInfo.getMemberRole();
		}

		if (memberRole != -1) { // 회원
			return true;
		} else {
			return false; // 비회원
		}

	}

	protected boolean selectRole() {

		int admin;
		Member loginInfo = LoginControl.getLoginInfo();
		if (loginInfo == null) {
			admin = 0; // 관리자
		} else {
			admin = loginInfo.getMemberRole();
		}

		if (admin == 0) { // 관리자
			return true;
		} else {
			return false;
		}
	}

	private void recommendlaunch() {
		String launch = Integer.toString(question());
		
		Menu menu = nDAO.recommend(launch);
		if(menu != null) {
			System.out.println(menu);
		}else {
			System.out.println("원하는 메뉴를 찾을 수 없습니다.");
		}
	}
	
	private int question() {
		
	}
	

	private Menu addMenu() {
		Menu menu = new Menu();
		System.out.println("이름>");
		menu.setFoodName(sc.nextLine());
		System.out.println("이하의 질문들은 꼭 기입하지 않아도 괜찮습니다.");
		System.out.println("맛 혹은 느낌>");
		menu.setTaste(sc.nextLine());
		System.out.println("가격");
		menu.setPrice(sc.nextLine());
		System.out.println("가게이름");
		menu.setRName(sc.nextLine());
		System.out.println("가게번호");
		menu.setRHP(sc.nextLine());
		System.out.println("식사종류 ex)한식,중식,일식,양식,간편식,기타 중에서 기입해주세요.");
		menu.setCategorize(sc.nextLine());
		System.out.println("음식형태 ex)밥,면,그 외 중에서 기입해주세요.");
		menu.setCategorize2(sc.nextLine());

		return menu;
	}

	private void useBoard() {

	}

	private void deleteMember() {

	}

	private void deleteMenu() {

	}
}
