package control;

import java.util.Scanner;

/*
 * 1. �簢�� 2.�ﰢ�� 0.����
 * 
 */
public class MenuArea {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int menu;
		String result;
		//�ݺ�
		     //menu �Է�
		     //1�̸� "�簢��" ���
		     //2�̸� "�ﰢ��" ���
		     //0�̸� break
		do {
			menu = Integer.parseInt(scan.nextLine());
			if(menu == 0) {
				break;
			}
			else if (menu == 1) {
				result = "�簢��";
			}
			else if (menu == 2) {
				result = "�ﰢ��";
			}
			else  {
				result = "�ٽ��Է�";
			}
			
			System.out.println(result);
			
		} while (true);
		System.out.println("���α׷� ����");

	
	}
}
