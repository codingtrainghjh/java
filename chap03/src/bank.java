import java.util.Scanner;

public class bank {

	public static void main(String[] args) {
		boolean run = true;

		int balance = 0;// �ܰ�
		int menu = 0; // ������
		int e = 0; // ��ݾ�
		int a = 0; // �Աݾ�
		Scanner scan = new Scanner(System.in);

		while (run) {
			System.out.println("-----------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("-----------------------------");
			System.out.print("����> ");
			menu = Integer.parseInt(scan.nextLine());
			// �Աݾ� �Է�
			if (menu == 1) {
				System.out.print("1.�Աݾ�> ");
				a = Integer.parseInt(scan.nextLine());
				balance = balance + a;
			}
			// ��ݾ� �Է�
			else if (menu == 2) {
				System.out.print("2.��ݾ�> ");
				e = Integer.parseInt(scan.nextLine());
				// ��ݰ��ɾ� �ʰ���
				if (e > balance) {
					System.out.println("��� ���ɾ��� �ʰ��߽��ϴ�.");
				} else {
					// ��� �� �ܰ� ���
					balance = balance - e;

				}
			}
			// �ܰ� Ȯ��
			else if (menu == 3) {
				System.out.println("3.�ܰ�");
				System.out.println(balance);
			}
			// ����
			else if (menu == 4) {
				System.out.println("");
				break;
			}
			// �߸��� �Է�
			else {
				System.out.println("�߸��� �Է��Դϴ�.");
			}
		}
		System.out.println("���α׷� ����");

	}

}
