package com.yedam.example1;

public class Bus {
	//�ʵ�
		 //ž������, �������, ž�°� ��, ����
		private String busNumber;
		private int money;
		private	int passengerCount;
		private int pay;
		//������
		public Bus(String busNumber, int pay) {
			this.busNumber = busNumber;
			this.pay = pay;
		}
		//�޼���
		public int getPay() {
			return pay;
			
		}
		public void take(int money) {
			this.money += money;
			this.passengerCount++;
			
		}
		public void showInfo() {
			System.out.print(busNumber + "�� �°��� ");
			System.out.print(passengerCount + "���̰�, ������ ");
			System.out.println(money + "�� �Դϴ�.");
			
		}

	}



