package operator;

import java.io.IOException;

public class 연산자 {

	public static void main(String[] args) {
		//산술연산();
		//짝수검사();
		//부호연산();
		//incDesOp();      //증감연산
		//denyLogicOp();   //논리부정
		//toLower();         //문자연산
		//compareOp();       //비교연산 - 윤년계산
		//isDigit();         //입력값이 숫자인지 판단
		//isChar();            //대소문자
		conditionOp();       //삼항연산자 => 조건연산자

	}
	
	public static void conditionOp() {
		int score = 80;
		String grade = (score >= 90 ? "A등급": (score >= 80) ? "B등급": "C등급");    //90이상이면 'A' 아니면 'B'
		System.out.printf("%d점은 %s입니다", score, grade);
	}
	public static void isChar() {
		try {
			int key = System.in.read();
			boolean result = (key >= 65) && (key <= 90) || (key >= 97) && (key <= 122);       //65~90 or 97~122
			String str = result ? "문자": "문자아님";
			System.out.println(str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	    }
	}
	public static void isDigit() {
		try {
			int key = System.in.read();
			boolean result = (key >= 48) && (key <= 57);        //48~57
			System.out.println(result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void compareOp() {
		int year = 2022;
		boolean result = ( year % 4 == 0 && year % 100 != 0 ) || year % 400 == 0;
		System.out.println(result);
	}
	
	public static void toLower() {
		char c = 'A';
		char p = (char)(c + 32);
		System.out.println(c + ":" + p);
		
	}
	//논리부정
	public static void denyLogicOp() {
		boolean play = true;
		play = !play;
		System.out.println(play);
	}
	
	//증감연산자
	public static void incDesOp() {
		int x = 10;
		int y = 10;
		--x;
		//x = x - 1;
		++y;
		System.out.println(x);
		System.out.println(y);
		
		int a = 10;
		int b = 10;
		
		int c = a++ + b++;  // 20,21,22
		//a = a +1;
		//b = b +1;
		System.out.println(c);
	}
	
	//부호연산
	public static void 부호연산() {
		int i1 = +100;
		int i2 = -100;
		
		byte x = 100;
		int result = -x; //부호연산의 결과는 int
	}
	
	//짝수인지검사
	public static void 짝수검사() {
		int n1 = 7;
		boolean result = n1 % 2 == 0;
		System.out.println(result);
	}
	
	
	//산술연산자
	public static void 산술연산() {
		int n1 = 10;
		int n2 = 3;
		
		int n3 = n1 / n2; //몫
		int n4 = n1 % n2;//나머지
		
		System.out.println(n3 + ":" + n4);
	
	
  }
}
