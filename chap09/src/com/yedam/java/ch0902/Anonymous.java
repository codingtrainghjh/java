package com.yedam.java.ch0902;

public class Anonymous {
	//�ʵ�
	Person field = new Person() {
		//�ʵ�
		String job = "ȸ���";
		//�޼ҵ�
		void work() {
			System.out.println("����մϴ�.");
		}
		
		@Override
		void wake() {
			System.out.println("6�ÿ� �Ͼ�ϴ�.");
			work();
		}
	};
	//������
	
	//�޼ҵ�
	void method1() {
		//���ú���
		Person var = new Person() {
			//�ʵ�
			String job = "���ػ�";
			//�޼ҵ�
			void walk() {
				System.out.println("��å�մϴ�.");
			}
			@Override
			void wake() {
				System.out.println("7�ÿ� �Ͼ�ϴ�.");
				walk();
			}
		};
		var.wake();
	}
	void method2(Person person) {
		person.wake();
	}
}
