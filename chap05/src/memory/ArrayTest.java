package memory;

public class ArrayTest {

	public static void main(String[] args) {
		
		int[] month = new int[] {31, 28, 31, 30, 31, 31};
		//2������ ����������?
		System.out.println(month[1]);
		
		int[] week = {'��', 'ȭ', '��'};
		
		int[] score = new int[10];
		score[0] = 100;
		//score = {4,6,10,3,5}; //error
		score = new int[] {4,6,10,3,5}; 

	}

}
