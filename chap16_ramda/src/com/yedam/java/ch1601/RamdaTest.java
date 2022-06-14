package com.yedam.java.ch1601;

public class RamdaTest {

	public static void main(String[] args) {
		//�Ű������� ����Ÿ�Ե� ���� ���ٽ�
		MyFunInterfaceA fa = () 
				-> {String str = "method call1";
					System.out.println(str);
		};
		
		fa.method();
		
		fa = () -> {System.out.println("method call2");};
		fa.method();
		fa = () -> System.out.println("method call3"); //���೻���� �� ���� ��� ����
		fa.method();
		
		//�Ű������� �ְ� ����Ÿ���� ���� ���ٽ�
		MyFunInterfaceB fb = (int x) 
				-> {int result = x * 5;
				System.out.println(result);
				};
		fb.method(5);
		
		fb = (x) -> {System.out.println(x * 5);}; //����Ÿ���� ������ �ִٸ� ���� �������� �ʿ�� ����
		fb.method(7);
		
		fb = x -> System.out.println(x * 5); //�Ű������� �ϳ��� �������� �ϳ��� ��
		fb.method(10);
		System.out.println();
		//�Ű������� �ְ� ����Ÿ���� �ִ� ���ٽ�
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
		
		//val1 = 100; - �޼ҵ峻�ּ� ���ú����� �����ö��� ���̳�Ư���� ���� ������ ������
		fa.method();
		
		
	}
	
}

