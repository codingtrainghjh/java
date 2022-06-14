package com.yedam.example1;

public class Bus {
	//필드
		 //탑승지역, 요금정보, 탑승객 수, 지불
		private String busNumber;
		private int money;
		private	int passengerCount;
		private int pay;
		//생성자
		public Bus(String busNumber, int pay) {
			this.busNumber = busNumber;
			this.pay = pay;
		}
		//메서드
		public int getPay() {
			return pay;
			
		}
		public void take(int money) {
			this.money += money;
			this.passengerCount++;
			
		}
		public void showInfo() {
			System.out.print(busNumber + "의 승객은 ");
			System.out.print(passengerCount + "명이고, 수입은 ");
			System.out.println(money + "원 입니다.");
			
		}

	}



