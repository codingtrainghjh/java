package control;

import java.util.Scanner;

public class ControlMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int score;      //���� �Է�
		String grade;   //���
		
		
		//������ ���� ���� �ݺ�����
		do {
			//���� Ű����κ��� �Է�
			score = Integer.parseInt(scan.nextLine());
			if(score == 0) {
				break; //�ݺ����� ��������
			}
			//��ް�� ���ǹ�
			if(score >= 90) {
			   grade = "A���";
			} else if (score>=80) {
				grade = "B���";
			} else if (score>=70) {
				grade = "C���";
			} else {
				grade = "D���";
			}
			//��� ��� ���
			System.out.printf("%d ������ %s�Դϴ�.\n", score, grade);
	} while(true);
		System.out.println("���α׷� ����");

}
}
