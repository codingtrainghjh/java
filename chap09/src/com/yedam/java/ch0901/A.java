package com.yedam.java.ch0901;

public class A {
	A() {
		System.out.println("A �ν��Ͻ��� ������.");
	}

	// �ν��Ͻ� ��� Ŭ����
	class B {
		// �ʵ�
		int field1;

		// ������
		B() {
			System.out.println("B �ν��Ͻ��� ������.");
		}

		// �޼ҵ�
		void method1() {
		}
	}

	static class C {
		// �ʵ�
		int field1;
		static int field2;

		// ������
		C() {
			System.out.println("C �ν��Ͻ��� ������");
		}

		// �޼ҵ�
		void method1() {
		}

		static void method2() {
		}
	}

	void method() {
		class D {
			// �ʵ�
			int field1;
			// ������
			D(){
				System.out.println("D �ν��Ͻ��� ������.");
			}
			// �޼ҵ�
			void method1() {}
		}
		
		D d = new D();
		d.field1 = 1;
		d.method1();
	}
}
