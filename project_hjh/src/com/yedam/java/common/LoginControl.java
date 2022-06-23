package com.yedam.java.common;

import java.util.Scanner;

import com.yedam.java.member.Member;
import com.yedam.java.member.MemberDAO;

public class LoginControl {

	protected Scanner sc = new Scanner(System.in);
	private static Member LoginInfo = null;

	public static Member getLoginInfo() {
		return LoginInfo;
	}

	// 생성자 -> run
	public LoginControl() {
		while (true) {
			menuPrint();

			int menuNo = menuSelect();

			if (menuNo == 1) {
				// 회원 이용
				login();
			} else if (menuNo == 2) {
				// 비회원 이용
				launchLaunch();
			} else if (menuNo == 3) {
				// 회원가입
				new signUp();
			} else if (menuNo == 9) {
				// 프로그램종료
				exit();
				break;

				// 입력오류
			} else {
				showInputError();
			}
		}
	}

	// 메소드
	protected void menuPrint() {
		if (true) {

			System.out.println("===============================");
			System.out.println("1.회원이용 2.비회원이용 3.회원가입 9.종료");
			System.out.println("===============================");
		}
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

	protected void exit() {
		System.out.println("프로그램을 종료합니다.");
	}

	protected void showInputError() {
		System.out.println("메뉴에서 입력해주시기 바랍니다.");
	}

	private void login() {
		// 아이디와 비밀번호 입력
		Member inputInfo = inputMember();
		// 로그인 시도
		LoginInfo = MemberDAO.getInstance().selectOne(inputInfo);

		// 실패할 경우 그대로 메소드 종료
		if (LoginInfo == null)
			return;

		// 성공할 경우 프로그램을 실행
		new launchLaunch().run();
	}

	private Member inputMember() {
		Member info = new Member();
		System.out.println("아이디 > ");
		info.setUserName(sc.nextLine());
		System.out.println("비밀번호 > ");
		info.setPassWd(sc.nextLine());

		return info;
	}
}
