package backjun.p10871;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;        //정수
		int x;        //정수N개로 이루어진 수열
		int num;      //입력변수
		int i=1;      //반복횟수
		
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
