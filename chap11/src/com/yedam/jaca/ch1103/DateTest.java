package com.yedam.jaca.ch1103;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��");
		
		String result = sdf.format(now);
		System.out.println(result);
	}

}
