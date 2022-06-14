package com.yedam.java.set;

import java.util.HashSet;
import java.util.Set;

public class MemberTest {

	public static void main(String[] args) {
		// equals 와 hashcode 기본사용 -> 다른 객체로 인식
		// equals 와 hashcode 오버라이드 -> 필드가 같으면 같은 객체로 인식
			Set<Member> set = new HashSet<>();
			
			set.add(new Member("홍길동", 30));
			set.add(new Member("홍길동", 30));
			
			System.out.println("총 객체 수 : " + set.size());
		}
	
	

}
