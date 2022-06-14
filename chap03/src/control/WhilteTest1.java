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
		// findMax(); //최댓값
		// findMin(); //최솟값
		findMinMax();
	}

	// 최댓,최솟값구하기
	public static void findMinMax() throws FileNotFoundException {
		// 파일에서 입력받음
		Scanner scan = new Scanner(new File("score.txt"));
		int min = scan.nextInt();
		int max = min;
		// 9번 반복
		for (int i = 0; i < 9; i++) {
			// 숫자를 입력
			int num = scan.nextInt();
			// 작은수보다 작으면 출력
			if (num < min) {
				min = num;
			}
			// 큰수보다 크면 출력
			if (num > max) {
				max = num;
			}
		}
		System.out.println("최솟값=" + min);
		System.out.println("최댓값=" + max);
	}

	public static void findMin() throws FileNotFoundException {
		// 파일에서 입력받음
		Scanner scan = new Scanner(new File("score.txt"));
		int min = scan.nextInt();
		// 10번 반복
		for (int i = 0; i < 9; i++) {
			// 숫자를 입력
			int num = scan.nextInt();
			// 작은수보다 작으면 출력
			if (num < min) {
				min = num;
			}
		}
		System.out.println("최솟값=" + min);
	}

	public static void findMax() throws FileNotFoundException {
		// 파일에서 입력받을 것임
		Scanner scan = new Scanner(new File("score.txt"));
		int max = 0;
		// 10번 반복
		for (int i = 1; i <= 10; i++) {
			// 숫자를 입력
			int num = scan.nextInt();
			// 큰수보다 크면 출력
			if (num > max) {
				max = num;

			}
		}
		System.out.println("최댓값=" + max);
	}

	// 5단출력
	public static void gugudan1() {
		Scanner scan = new Scanner(System.in);
		int dan = scan.nextInt();
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d*%d=%d\n", dan, i, dan * i); // 5*1=5
		}
	}

	// 10 ~ 1 출력
	public static void for2() {
		for (int i = 10; i >= 1; i--) {
			System.out.println(i + "인디언");
		}
	}

	// 1부터 10까지 반복 : do~while
	public static void for1() {
		for (int i = 1; i <= 10; i += 2) {
			System.out.println(i + "꼬마인디언");
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
