package com.yedam.java.map;

import java.util.HashMap;
import java.util.Map;

public class StudentTest {
	

	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<>();
		
		map.put(new Student(1, "È«±æµ¿"), 95);
		map.put(new Student(1, "È«±æµ¿"), 100);
		
		System.out.println("ÃÑ Entry ¼ö : " + map.size());
		System.out.println("ÇÐ¹ø : 1, ÀÌ¸§ : È«±æµ¿, ¼ºÀû : " 
					+ map.get(new Student(1, "È«±æµ¿")));
	}

}
