package com.yedam.java.ch0604;

public class Calculator {
	int[] numList;
	int index;
	
	Calculator(){
		index = -1;
	}
	
	//1.���� �Է�
	void setArraySize(int size) {
		numList = new int[size];
	}
	
	//2.���� �Է�
	void setNum(int num) {
		if((index+1) < numList.length) {
			numList[++index] = num;
		}else {
			System.out.println("���ڸ� �� �̻� �Է��� �� �����ϴ�.");
		}
	}
	//3.���ϱ�
	void plus() {
		if(isExecuted()) {
			int sum = 0;
			for(int i=0; i<= index; i++) {
				sum += numList[i];
			}
			System.out.println("��� ���� ��� : " + sum);
			
		}
	}
	//4.����
	void minus() {
		if(isExecuted()) {
			int result = numList[0];
			for(int i=1; i<= index; i++) {
				result -= numList[i];
			}
			System.out.println("��� �� ��� : "+ result);
		}
		
	}
	//5.���ϱ�
	void multiply() {
		if(isExecuted()) {
			int result = 1;
			for(int i=1; i<= index; i++) {
				result *= numList[i];
			}
			System.out.println("��� ���� ��� : "+ result);
		}
	}
	//6.������
	void division() {
		if(isExecuted()) {
			int result = 1;
			for(int i=1; i<= index; i++) {
				result /= numList[i];
			}
			System.out.println("��� ���� ��� : "+ result);
		}
	}
	
	//0.���� üũ
	boolean isExecuted() {
		if((index +1) >=2) {
			return true;
		}else {
			System.out.println("���ڸ� �� �Է����ּ���.");
			return false;
		}
	}
	

}
