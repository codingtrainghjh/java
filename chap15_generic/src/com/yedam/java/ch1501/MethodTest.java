package com.yedam.java.ch1501;

public class MethodTest {

	public static void main(String[] args) {
		BoxA<Integer> intBox = Util.<Integer>boxing(100);
		
		
		Pair<Integer,String> p1 = new Pair<>(1, "���");
		Pair<Integer,String> p2 = new Pair<>(1, "����");
		
		boolean result1 = Util.<Integer, String>compare(p1, p2); //���Ǵ� ���׸� �� �����ֱ�
		if(result1) {
			System.out.println("�������� ������ ��ü�Դϴ�.");
		}else {
			System.out.println("�������� �������� �ʽ��ϴ�.");
		}
		Util.<String, Integer>printInfo("ȫ�浿");
	}
	

}
