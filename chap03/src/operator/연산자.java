package operator;

import java.io.IOException;

public class ������ {

	public static void main(String[] args) {
		//�������();
		//¦���˻�();
		//��ȣ����();
		//incDesOp();      //��������
		//denyLogicOp();   //������
		//toLower();         //���ڿ���
		//compareOp();       //�񱳿��� - ������
		//isDigit();         //�Է°��� �������� �Ǵ�
		//isChar();            //��ҹ���
		conditionOp();       //���׿����� => ���ǿ�����

	}
	
	public static void conditionOp() {
		int score = 80;
		String grade = (score >= 90 ? "A���": (score >= 80) ? "B���": "C���");    //90�̻��̸� 'A' �ƴϸ� 'B'
		System.out.printf("%d���� %s�Դϴ�", score, grade);
	}
	public static void isChar() {
		try {
			int key = System.in.read();
			boolean result = (key >= 65) && (key <= 90) || (key >= 97) && (key <= 122);       //65~90 or 97~122
			String str = result ? "����": "���ھƴ�";
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
	//������
	public static void denyLogicOp() {
		boolean play = true;
		play = !play;
		System.out.println(play);
	}
	
	//����������
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
	
	//��ȣ����
	public static void ��ȣ����() {
		int i1 = +100;
		int i2 = -100;
		
		byte x = 100;
		int result = -x; //��ȣ������ ����� int
	}
	
	//¦�������˻�
	public static void ¦���˻�() {
		int n1 = 7;
		boolean result = n1 % 2 == 0;
		System.out.println(result);
	}
	
	
	//���������
	public static void �������() {
		int n1 = 10;
		int n2 = 3;
		
		int n3 = n1 / n2; //��
		int n4 = n1 % n2;//������
		
		System.out.println(n3 + ":" + n4);
	
	
  }
}
