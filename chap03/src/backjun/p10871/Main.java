package backjun.p10871;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;        //����
		int x;        //����N���� �̷���� ����
		int num;      //�Էº���
		int i=1;      //�ݺ�Ƚ��
		
		n = scan.nextInt();
		x = scan.nextInt();
		do {
			num = scan.nextInt();
			if(num < x) {
				System.out.print(num+" ");
			}
			i++;
		}while(i<=n);
	}
}
