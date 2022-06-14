package com.yedam.example1;

public class Student {
	// 필드
	// 필요한정보 : 이름, 잔액
	private String name;
	private int money;

	// 생성자
	public Student(String name, int money) { // 학생이름과 잔액 저장
		this.name = name; // 학생이름 공간
		this.money = money; // 잔액 공간

	}

	// 메서드
	public void take(Subway subway) { // Subway 값 지정
		int pay = subway.getPay(); // 요금지불
		this.money -= pay; // 요금계산
		subway.take(pay); // 지하철공사로 요금이동

	}

	// 메소드 오버로딩
	public void take(Bus bus) { // Bus 값 지정
		int pay = bus.getPay(); // 요금지불
		this.money -= pay; // 요금계산
		bus.take(pay); // 버스로 요금이동

	}

	public void showInfo() { // 잔액 출력
		System.out.println(name + " 님의 남은 돈은 " + this.money + " 원 입니다.");
	}
}
