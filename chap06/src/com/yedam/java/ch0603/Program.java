package com.yedam.java.ch0603;
//4.�м� - �ְ�����, �������

public class Program {
	//�ʵ�
	int[] scores;
	int index;
	
	//������
	Program(){
		index = -1;
	}
	//�޼ҵ�
//1.�л��� �Է�
	void setStudentNum(int student) {
		scores = new int[student];
	}
	
//2.���� �Է�
	void setStudentScore(int score) {
		scores[++index] = score;	}
	
//3.��������Ʈ ���
	void printScores() {
	   for(int i = 0;i < scores.length; i++) {
		   System.out.println("scores["+i+"])>" + scores[i]);
	   }
	}
//4-1.�ִ� ���ϱ�
	int getMaxScore() {
		int max = scores[0];
		for(int i=0; i<scores.length; i++) {
			int temp = scores[i];
			if(max < temp) {
				max = temp;
			}
	}
	return max;
	}
//4-2.�������
	double getAvgScore() {
		int sum = 0;
		for(int i=0; i<scores[i]; i++) {
			sum += scores[i];
			//sum = sum +scores[i];
		}
		return (double)sum / scores.length;
	}
//4.�м�	
void printResult() {
	System.out.println("�ְ� ���� : "+ getMaxScore());
	System.out.println("��� ���� : "+ getAvgScore());
}
}

