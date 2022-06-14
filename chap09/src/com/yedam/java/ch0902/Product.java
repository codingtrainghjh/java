package com.yedam.java.ch0902;

public class Product {
	//�ʵ�
	RemoteControl field = new RemoteControl() {
		//�ʵ�
		String message = "����ƮTV";
		//�޼ҵ�
		void print() {
			System.out.println("��ǰ ���� : " + message);
		}
		@Override
		public void turnOn() {
			print();
			System.out.println("������ �մϴ�.");
		}
		@Override
		public void turnOff() {
			print();
			System.out.println("������ ���ϴ�.");
		}
	};
	//������
	
	//�޼ҵ�
	RemoteControl method1() {
		int volume = 0;
		
		RemoteControl var = new RemoteControl() {
			//�ʵ�
			String message = "Audio";
			//�޼ҵ�
			void print() {
				System.out.println("��ǰ ���� : " + message);
			}
			@Override
			public void turnOn() {
				print();
				System.out.println("������ �մϴ�.");
				System.out.println("���� ���� : " + volume);
			}

			@Override
			public void turnOff() {
				print();
				System.out.println("������ ���ϴ�.");
			}
			
		};
		
		var.turnOn();
		var.turnOff();
		
		return var;
	}
	void method2(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
	}
}
