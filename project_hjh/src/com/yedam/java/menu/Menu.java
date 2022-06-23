package com.yedam.java.menu;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Menu {
	
	private String foodName;
	private String taste;
	private String price;
	private String rName;
	private String rHP;
	private String categorize;
	
	@Override
	public String toString() {
		String result = ("음식이름 : " + foodName + ", " + taste +
		"\n가격 : " + price + ", 가게명 : " + rName +
		"\n가게번호 : " + rHP);
		
		return result;
	}
}
