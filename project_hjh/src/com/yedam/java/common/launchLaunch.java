package com.yedam.java.common;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import com.yedam.java.member.Member;
import com.yedam.java.member.MemberDAO;
import com.yedam.java.menu.Menu;
import com.yedam.java.menu.MenuDAO;

public class launchLaunch {
	protected Scanner sc = new Scanner(System.in);
	protected MemberDAO mDAO = MemberDAO.getInstance();
	protected MenuDAO nDAO = MenuDAO.getInstance();
	boolean admin = selectRole();
	boolean nonMember = cheakNonMember();

	public void run() {
		while (true) {
			menuPrint();

			int menuNo = menuSelect();

			if (menuNo == 1) {
				// 점심추천
				recommendlaunch();
			} else if (menuNo == 2 && nonMember) {
				// 메뉴추가
				addMenu();
			} else if (menuNo == 3 && nonMember) {
				// 게시판이용
				useBoard();
				
			} else if (menuNo == 4 && admin && nonMember) {
				// 회원삭제
				deleteMember();
			
			} else if (menuNo == 5 && admin && nonMember) {
				// 메뉴삭제
				deleteMenu();
				
			} else if (menuNo == 9) {
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

	protected void menuPrint() {
		String menu = "";
		menu += "1.점심추천받기 ";
		
		if (LoginControl.getLoginInfo().getUserId() >= 0) {
			menu += "2.메뉴추가하기 3.게시판이용(요양중)";
		}
		if (LoginControl.getLoginInfo().getUserId() == 0) {
			menu += " 4.회원삭제 5.메뉴삭제";
		}
			menu += " 9.로그아웃";
			System.out.println("=========================================================");
			System.out.println(menu);
			System.out.println("=========================================================");
		
	}

	protected boolean cheakNonMember() {
		int nonMember;
		Member loginInfo = LoginControl.getLoginInfo();
		if (loginInfo == null) {
			nonMember = -1; // 비회원
		} else {
			nonMember = loginInfo.getUserId();
		}
		
		if (nonMember != -1) { // 회원
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
			admin = loginInfo.getUserId();
		}

		if (admin == 0) { // 관리자
			return true;
		} else {
			return false;
		}
	}

	private void recommendlaunch() {
		Menu result = question();
		List<Menu> menu = nDAO.recommend(result.getCategorize(), result.getCategorize2());
		Collections.shuffle(menu);
		
		if (menu != null) {
			System.out.println("++++++++++++++++++++++++++++++++++++++++");
			System.out.println(menu.get(0));
			System.out.println("++++++++++++++++++++++++++++++++++++++++");
		} else {
			System.out.println("원하는 메뉴를 찾을 수 없습니다.");
		}
	}

	private Menu question() {
		int m = 0;
		Menu menu = new Menu();
		System.out.println("어떤걸 드시고 싶으신가요?\r\n" + "1.한식 2.중식 3.일식 4.양식 5.간편식 6.기타 7.아무거나");
		m = Integer.parseInt(sc.nextLine());
		menu.setCategorize(String.valueOf(m));
		
		
		if (m == 7) {
			int random = ((int) (Math.random() * 6) + 1);
			menu.setCategorize(String.valueOf(random));
			
			
		}
		System.out.println("밥과 면중에서 어떤걸 드시겠어요?\r\n" + "1.밥 2.면 3.그 외 4.아무거나");
		m = Integer.parseInt(sc.nextLine());
		menu.setCategorize2(String.valueOf(m));
		if (m == 4) {

			int random2 = ((int) (Math.random() * 3) + 1);
			menu.setCategorize2(String.valueOf(random2));
			
		}

		return menu;
	}

	private void addMenu() {
		Menu menu = new Menu();
		System.out.println("이름>");
		menu.setFoodName(sc.nextLine());
		System.out.println("식사종류와 음식형태는 꼭 기입해주세요.");
		System.out.println();
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
		
		nDAO.addmenu(menu);

	}

	private void useBoard() {
		System.out.println("게시판이(가) 아파요.ㅠㅠ");
	}

	private void deleteMember() {
		String memberName = inputName();
		Member member = mDAO.search(memberName);
		if(member == null) {
			System.out.println("등록된 정보가 없습니다.");
			return;
		}	
		mDAO.delete(member.getUserName());
		System.out.println("삭제가 완료되었습니다.");
	}

	private void deleteMenu() {
		String menuName = inputMenu();
		String menuRname = inputRname();
		Menu menu = nDAO.search(menuName, menuRname);
		if(menu == null) {
			System.out.println("등록된 정보가 없습니다.");
			return;
		}
		nDAO.deletemenu(menu);
		System.out.println("삭제가 완료되었습니다.");
		}
		
		
			
	
	private String inputName() {
		System.out.println("이름>");
		return sc.nextLine();
	}
	
	private String inputMenu() {
		System.out.println("어떤 메뉴를 삭제하시겠어요?");
		return sc.nextLine();
		
	}
	private String inputRname() {
		System.out.println("어떤 식당인가요?");
		return sc.nextLine();
	}
}
