package com.yedam.java.member;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Member {
	private int userId;
	private String userName;
	private String passWd;
	private Date regDate;
	private String interest;
	private String eMail;
	private int memberRole;
	
	@Override
	public String toString() {
		String info = "";
		
		if(memberRole == 0) {
			info = "관리자 계정 : " + userName;
		}else if(memberRole > 0){
			info = "일반 계정 : " + userName;
		}else {
			info = "비회원 계정"; 
		}
		return info;
	}
}
