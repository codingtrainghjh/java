package com.yedam.java.ch1002;

public class MainTest {

	public static void main(String[] args) throws ClassNotFoundException {
		try {
			//���� �����ϰ��� �� �ڵ�
		} catch(Exception e) {
			//���ܰ� �߻��� ��� ó���ڵ�
		} finally {
			//���������� �����ϵ� ���ܰ� �߻��ߵ�
			//�ݵ�� ����Ǿ�� �ϴ� �ڵ�
		}
		
		String data1 = null;
		String data2 = null;
		
		try {
			int value1 = Integer.parseInt(data1);
			data1 = args[0];
			data2 = args[1];
		} catch(ArrayIndexOutOfBoundsException e) {
			//e.printStackTrace();
			System.out.println("���� �Ű����� ���� �����մϴ�.");
			return;
		} catch(NumberFormatException e) {
			System.out.println("���� ���Ŀ� ���� �Է����ּ���.");
			return;
		} catch(Exception e) {
			System.out.println("��Ÿ");
			return;
		}finally { //�ڿ��� ������ �� ���� ����
			System.out.println("�ʼ� ����");
		}
		
		System.out.println("���� �޼ҵ� ����");
		
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch(NullPointerException e) {
			e.printStackTrace();
		}
	}
	
	public static void findClass() throws ClassNotFoundException, NullPointerException{
		//�߻��� �� �ִ� ������ �Ͻ������� ���ѱ��
		Class clazz = Class.forName("java.lang.String");
	}
	
}
