package control;

import java.util.Scanner;

/*
 * 숫자맞추기 게임
 */
public class GuessNumber {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int rand = 5;   //나중에 난수로 바꿀것임
		int num;        //유저가 입력하는 값
		int ch = 1;     //시도횟수 : 입력할때마다 1씩 감소
		String result = null;
		
		//반복
		     //키보드 정수값을 읽어서 num 변수에 저장
		     //rand > num "크다" 출력
		     //rand < num "작다" 출력
		     //rand == num break
		System.out.println("게임시작!");      //시작과 함께 출력되는 메시지
		do {
			System.out.print("숫자를 골라보세요 : ");     //반복될때 마다 출력될 메시지
			num = Integer.parseInt(scan.nextLine());
			//숫자를 비교 일치하면 종료
			if(rand == num) {
				System.out.println("정답입니다!(짝짝짝)");
				break;
			}
			else if (num < rand) {
				result = "생각보다 커요~\n다시 생각해보세요.";
			}
			else {
				result = "조금 작을걸요?\n잘 골라봐요~";
			}
			
			System.out.println(result);
			System.out.printf("기회가 %d 남았어요", 10-ch);
			ch++;
			System.out.println();
			System.out.println();
			if (ch == 11) {        //목숨이 10회 소진되면 게임종료
				System.out.println("이런~ 정말 아쉬워요");
				break;
			}
			
		} while (true);
		

	}

}
