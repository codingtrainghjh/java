package com.yedam.java.question;

public class Member {
	
	static int record;
	String grade;
	
	static final int GRAND_STANDARD = 1000000;
	
	public Member(int record) {
		Member.record = record;
		
	}
	void showMemberInfo() {	
		System.out.println("현재 실적은 " + record + "원 이며, " + "현재 등급은 " + grade + "입니다.");
	}
	public static Member getMemberShip(int record) {
		Member member = null;
		if(record >= Member.GRAND_STANDARD) {
			member = new Gold(record);
		}else {
			member = new Silver(record);
		}
		return member;
	}
}
