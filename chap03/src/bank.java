import java.util.Scanner;

public class bank {

	public static void main(String[] args) {
		boolean run = true;

		int balance = 0;// 잔고
		int menu = 0; // 선택지
		int e = 0; // 출금액
		int a = 0; // 입금액
		Scanner scan = new Scanner(System.in);

		while (run) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------");
			System.out.print("선택> ");
			menu = Integer.parseInt(scan.nextLine());
			// 입금액 입력
			if (menu == 1) {
				System.out.print("1.입금액> ");
				a = Integer.parseInt(scan.nextLine());
				balance = balance + a;
			}
			// 출금액 입력
			else if (menu == 2) {
				System.out.print("2.출금액> ");
				e = Integer.parseInt(scan.nextLine());
				// 출금가능액 초과시
				if (e > balance) {
					System.out.println("출금 가능액을 초과했습니다.");
				} else {
					// 출금 후 잔고 계산
					balance = balance - e;

				}
			}
			// 잔고 확인
			else if (menu == 3) {
				System.out.println("3.잔고");
				System.out.println(balance);
			}
			// 종료
			else if (menu == 4) {
				System.out.println("");
				break;
			}
			// 잘못된 입력
			else {
				System.out.println("잘못된 입력입니다.");
			}
		}
		System.out.println("프로그램 종료");

	}

}
