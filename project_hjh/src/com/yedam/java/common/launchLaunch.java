package com.yedam.java.common;

import java.util.Scanner;

import com.yedam.app.common.LoginControl;
import com.yedam.java.member.MemberDAO;
import com.yedam.java.menu.MenuDAO;

public class launchLaunch {
	protected Scanner sc = new Scanner(System.in);
	protected MemberDAO mDAO = MemberDAO.getInstance();
	protected MenuDAO nDAO = MenuDAO.getInstance();
	boolean role = selectRole();
	public void run() {
		while (true) {
			menuPrint(role);
		}
	}

	protected void menuPrint(boolean role) {
		String menu = "";
		menu += "1.점심추천받기";
		if (role) {
			System.out.println("=========================================================");
			System.out.println("1.점심추천받기 2.메뉴추가하기 3. 게시판이용 4.회원삭제 5.메뉴삭제 9.로그아웃");
			System.out.println("=========================================================");
		}
	}
	protected boolean selectRole() {
		int memberRole = LoginControl.getLoginInfo().getMemberRole();
		if(memberRole == 0) {
			return true;
		}else {
			return false;
		}
	}
}
