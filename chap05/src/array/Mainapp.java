package array;

import java.util.Scanner;

public class Mainapp {
	static boolean run = true;
	static int menu = 0;
	// �迭����
	static int scores[];
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		init(); // �迭������ �ʱ�ȭ
		scan.nextLine();
		while (menu != 5) {
			System.out.println();
			System.out.println("1.��ü��� | 2.�ּڰ� | 3.�ִ� | 4.��� | 5.����");
			System.out.print("����> ");
			menu = Integer.parseInt(scan.nextLine());
			
			switch(menu) {
			case 1:
				//�޴��� 1�̸�
				printALL();
				break;
			case 2:
				//�޴��� 2�̸�
				findMin();
				break;
			case 3:
			    //�޴��� 3�̸�
				findMax();
				break;
			case 4:
			    //�޴��� 4�̸�
				findAvg();
				break;
			case 5:
			    //5�̸� ����
				System.out.println("�����մϴ�.");
				break;
					
			default:
				System.out.println("1~5�߿��� �Է����ּ���.");
			}
			// �ݺ���
			// �޴���� �Է� 1.��ü��� 2.�ּڰ� 3.�ִ밪 4.��� 5.����
			// �޴��Է�
			// �޴��� 1�̸�
//			printALL(); // ��ü���
//			// �޴��� 2�̸�
//			findMin(); // �ּڰ� ���
//			// �޴��� 3�̸�
//			findMax(); // �ִ� ���
//			// �޴��� 4�̸�
//			findAvg(); // ��հ� ���
			// 5�̸� ����
		}
	}

	public static void init() {

		// �迭����
		scores = new int[10]; // ��� ��Ұ� 0���� �ʱ�ȭ

		// �迭�ʱ�ȭ
		for (int i = 0; i < 10; i++) {
			scores[i] = scan.nextInt();
		}
	}

	public static void printALL() {
		// �迭�� ��ü��ȸ

		for (int i = 0; i < 10; i++)
			System.out.println(scores[i]);

	}

	// �ּڰ�
	public static void findMin() {
		int min = scores[0];// �迭�� ù��° ��
		for (int i = 1; i < 10; i++) {
			if (min > scores[i]) // �迭�� i��° �ε����� ���� min�� ��
				min = scores[i];

		}
		System.out.printf("�ּڰ��� %d �Դϴ�.", min);
		System.out.println();

	}

	// �ִ�
	public static void findMax() {
		int max = scores[0];
		for (int i = 1; i < 10; i++) {
			if (max < scores[i]) { // �迭�� i��° �ε����� ���� max�� ��
				max = scores[i];
			}
		}
		System.out.printf("�ִ��� %d �Դϴ�.", max);
		System.out.println();

	}

	public static void findAvg() {
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum = sum+scores[i]; 
		}
		
	}
}
