package com.yedam.java.ch1501;

public class MethodTest {

	public static void main(String[] args) {
		BoxA<Integer> intBox = Util.<Integer>boxing(100);
		
		
		Pair<Integer,String> p1 = new Pair<>(1, "사과");
		Pair<Integer,String> p2 = new Pair<>(1, "애플");
		
		boolean result1 = Util.<Integer, String>compare(p1, p2); //사용되는 제네릭 값 적어주기
		if(result1) {
			System.out.println("논리적으로 동등한 객체입니다.");
		}else {
			System.out.println("논리적으로 동등하지 않습니다.");
		}
		Util.<String, Integer>printInfo("홍길동");
	}
	

}
