package array;

import java.util.Scanner;

public class Mainapp {
	static boolean run = true;
	static int menu = 0;
	// 배열선언
	static int scores[];
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		init(); // 배열생성과 초기화
		scan.nextLine();
		while (menu != 5) {
			System.out.println();
			System.out.println("1.전체출력 | 2.최솟값 | 3.최댓값 | 4.평균 | 5.종료");
			System.out.print("선택> ");
			menu = Integer.parseInt(scan.nextLine());
			
			switch(menu) {
			case 1:
				//메뉴가 1이면
				printALL();
				break;
			case 2:
				//메뉴가 2이면
				findMin();
				break;
			case 3:
			    //메뉴가 3이면
				findMax();
				break;
			case 4:
			    //메뉴가 4이면
				findAvg();
				break;
			case 5:
			    //5이면 종료
				System.out.println("종료합니다.");
				break;
					
			default:
				System.out.println("1~5중에서 입력해주세요.");
			}
			// 반복문
			// 메뉴출력 입력 1.전체출력 2.최솟값 3.최대값 4.평균 5.종료
			// 메뉴입력
			// 메뉴가 1이면
//			printALL(); // 전체출력
//			// 메뉴가 2이면
//			findMin(); // 최솟값 출력
//			// 메뉴가 3이면
//			findMax(); // 최댓값 출력
//			// 메뉴가 4이면
//			findAvg(); // 평균값 출력
			// 5이면 종료
		}
	}

	public static void init() {

		// 배열생성
		scores = new int[10]; // 모든 요소가 0으로 초기화

		// 배열초기화
		for (int i = 0; i < 10; i++) {
			scores[i] = scan.nextInt();
		}
	}

	public static void printALL() {
		// 배열값 전체조회

		for (int i = 0; i < 10; i++)
			System.out.println(scores[i]);

	}

	// 최솟값
	public static void findMin() {
		int min = scores[0];// 배열의 첫번째 값
		for (int i = 1; i < 10; i++) {
			if (min > scores[i]) // 배열의 i번째 인덱스의 값과 min을 비교
				min = scores[i];

		}
		System.out.printf("최솟값은 %d 입니다.", min);
		System.out.println();

	}

	// 최댓값
	public static void findMax() {
		int max = scores[0];
		for (int i = 1; i < 10; i++) {
			if (max < scores[i]) { // 배열의 i번째 인덱스의 값과 max를 비교
				max = scores[i];
			}
		}
		System.out.printf("최댓값은 %d 입니다.", max);
		System.out.println();

	}

	public static void findAvg() {
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum = sum+scores[i]; 
		}
		
	}
}
