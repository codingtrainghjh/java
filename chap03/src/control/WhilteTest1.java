package control;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WhilteTest1 {

	public static void main(String[] args) throws FileNotFoundException {

		// while1();
		// for1();
		// for2();
		// gugudan1();
		// findMax(); //�ִ�
		// findMin(); //�ּڰ�
		findMinMax();
	}

	// �ִ�,�ּڰ����ϱ�
	public static void findMinMax() throws FileNotFoundException {
		// ���Ͽ��� �Է¹���
		Scanner scan = new Scanner(new File("score.txt"));
		int min = scan.nextInt();
		int max = min;
		// 9�� �ݺ�
		for (int i = 0; i < 9; i++) {
			// ���ڸ� �Է�
			int num = scan.nextInt();
			// ���������� ������ ���
			if (num < min) {
				min = num;
			}
			// ū������ ũ�� ���
			if (num > max) {
				max = num;
			}
		}
		System.out.println("�ּڰ�=" + min);
		System.out.println("�ִ�=" + max);
	}

	public static void findMin() throws FileNotFoundException {
		// ���Ͽ��� �Է¹���
		Scanner scan = new Scanner(new File("score.txt"));
		int min = scan.nextInt();
		// 10�� �ݺ�
		for (int i = 0; i < 9; i++) {
			// ���ڸ� �Է�
			int num = scan.nextInt();
			// ���������� ������ ���
			if (num < min) {
				min = num;
			}
		}
		System.out.println("�ּڰ�=" + min);
	}

	public static void findMax() throws FileNotFoundException {
		// ���Ͽ��� �Է¹��� ����
		Scanner scan = new Scanner(new File("score.txt"));
		int max = 0;
		// 10�� �ݺ�
		for (int i = 1; i <= 10; i++) {
			// ���ڸ� �Է�
			int num = scan.nextInt();
			// ū������ ũ�� ���
			if (num > max) {
				max = num;

			}
		}
		System.out.println("�ִ�=" + max);
	}

	// 5�����
	public static void gugudan1() {
		Scanner scan = new Scanner(System.in);
		int dan = scan.nextInt();
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d*%d=%d\n", dan, i, dan * i); // 5*1=5
		}
	}

	// 10 ~ 1 ���
	public static void for2() {
		for (int i = 10; i >= 1; i--) {
			System.out.println(i + "�ε��");
		}
	}

	// 1���� 10���� �ݺ� : do~while
	public static void for1() {
		for (int i = 1; i <= 10; i += 2) {
			System.out.println(i + "�����ε��");
		}
	}

	public static void while1() {
		int count = 1;
		do {
			System.out.println(count);
			count++;
		} while (count <= 10);

	}
}
