package com.yedam.java.ch0901;

public class Y {
	// �ʵ�
	int field1;
	static int field2;

	// �޼ҵ�
	void method1() {
	}

	static void method2() {
	}

	public Y() {

		// �ν��Ͻ� ��� Ŭ���� -> YŬ������ �ν��Ͻ��� ����
		//				  -> �ν��Ͻ��� ������ �� �ִ� ��� ���� ����� ȣ���� �� ����.
		class B {
			void method() {
				field1 = 1;
				field2 = 1;

				method1();
				method2();
			}
		}

		// ���� ��� Ŭ���� -> YŬ������ �ν��Ͻ��� �������� ����
		//			    -> YŬ������ ���� ���� ����鸸 ȣ���� �� ����.
		// �ν��Ͻ��� ���� ��쿡 ���� ������
		static class C {
			void method() {
				field1 = 1;
				field2 = 1;

				method1();
				method2();
			}

		}
	}
	
	int method(int arg) {
		int var = 1;
		//arg = 100;
		//var = 90;
		class D {
			void method() {
				int result = arg + var;
			}
		}
		D d = new D();
		d.method();
		var = 2; 
		return var;
	}
}