package com.yedam.java.ch0604;

public class Calculator {
	int[] numList;
	int index;
	
	Calculator(){
		index = -1;
	}
	
	//1.갯수 입력
	void setArraySize(int size) {
		numList = new int[size];
	}
	
	//2.숫자 입력
	void setNum(int num) {
		if((index+1) < numList.length) {
			numList[++index] = num;
		}else {
			System.out.println("숫자를 더 이상 입력할 수 없습니다.");
		}
	}
	//3.더하기
	void plus() {
		if(isExecuted()) {
			int sum = 0;
			for(int i=0; i<= index; i++) {
				sum += numList[i];
			}
			System.out.println("모두 더한 결과 : " + sum);
			
		}
	}
	//4.빼기
	void minus() {
		if(isExecuted()) {
			int result = numList[0];
			for(int i=1; i<= index; i++) {
				result -= numList[i];
			}
			System.out.println("모두 뺀 결과 : "+ result);
		}
		
	}
	//5.곱하기
	void multiply() {
		if(isExecuted()) {
			int result = 1;
			for(int i=1; i<= index; i++) {
				result *= numList[i];
			}
			System.out.println("모두 곱한 결과 : "+ result);
		}
	}
	//6.나누기
	void division() {
		if(isExecuted()) {
			int result = 1;
			for(int i=1; i<= index; i++) {
				result /= numList[i];
			}
			System.out.println("모두 나눈 결과 : "+ result);
		}
	}
	
	//0.조건 체크
	boolean isExecuted() {
		if((index +1) >=2) {
			return true;
		}else {
			System.out.println("숫자를 더 입력해주세요.");
			return false;
		}
	}
	

}
