package com.yedam.java.ch1601;

public class RamdaTest {

	public static void main(String[] args) {
		//매개변수도 리턴타입도 없는 람다식
		MyFunInterfaceA fa = () 
				-> {String str = "method call1";
					System.out.println(str);
		};
		
		fa.method();
		
		fa = () -> {System.out.println("method call2");};
		fa.method();
		fa = () -> System.out.println("method call3"); //실행내역이 한 줄일 경우 가능
		fa.method();
		
		//매개변수가 있고 리턴타입이 없는 람다식
		MyFunInterfaceB fb = (int x) 
				-> {int result = x * 5;
				System.out.println(result);
				};
		fb.method(5);
		
		fb = (x) -> {System.out.println(x * 5);}; //변수타입이 정해져 있다면 굳이 지정해줄 필요는 없음
		fb.method(7);
		
		fb = x -> System.out.println(x * 5); //매개변수가 하나고 실행블록이 하나일 때
		fb.method(10);
		System.out.println();
		//매개변수가 있고 리턴타입이 있는 람다식
		MyFunInterfaceC fc = (int x, int y) 
				-> { int result = x + y;
					return result;
		};
		System.out.println(fc.method(1, 2));
		
		fc = (x, y) -> {return x + y; };
		System.out.println(fc.method(1, 5));
		
		fc = (x, y) -> x + y;
		System.out.println(fc.method(6, 5));
		
		fc = (x, y) -> Math.max(x ,y);
		fc = (x, y) -> {
			//int result = Math.max(x, y);
			//return result;
			return Math.max(x, y);
			};
		fc = (x, y) -> Math.max(x, y);
		System.out.println(fc.method(10, 12));
		System.out.println();
		
		int val1 = 10;
		int val2 = 20;
		fa = () -> {
			int result = val1 + val2;
			System.out.println(result);
		};
		
		//val1 = 100; - 메소드내애서 로컬변수를 가져올때는 파이널특성을 가진 변수를 가져옴
		fa.method();
		
		
	}
	
}

