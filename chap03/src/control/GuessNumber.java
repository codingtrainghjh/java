package control;

import java.util.Scanner;

/*
 * ���ڸ��߱� ����
 */
public class GuessNumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int rand = 5;   //���߿� ������ �ٲܰ���
		int num;        //������ �Է��ϴ� ��
		int ch = 1;     //�õ�Ƚ�� : �Է��Ҷ����� 1�� ����
		String result = null;
		
		//�ݺ�
		     //Ű���� �������� �о num ������ ����
		     //rand > num "ũ��" ���
		     //rand < num "�۴�" ���
		     //rand == num break
		System.out.println("���ӽ���!");      //���۰� �Բ� ��µǴ� �޽���
		do {
			System.out.print("���ڸ� ��󺸼��� : ");     //�ݺ��ɶ� ���� ��µ� �޽���
			num = Integer.parseInt(scan.nextLine());
			//���ڸ� �� ��ġ�ϸ� ����
			if(rand == num) {
				System.out.println("�����Դϴ�!(¦¦¦)");
				break;
			}
			else if (num < rand) {
				result = "�������� Ŀ��~\n�ٽ� �����غ�����.";
			}
			else {
				result = "���� �����ɿ�?\n�� ������~";
			}
			
			System.out.println(result);
			System.out.printf("��ȸ�� %d ���Ҿ��", 10-ch);
			ch++;
			System.out.println();
			System.out.println();
			if (ch == 11) {        //����� 10ȸ �����Ǹ� ��������
				System.out.println("�̷�~ ���� �ƽ�����");
				break;
			}
			
		} while (true);
		

	}

}
