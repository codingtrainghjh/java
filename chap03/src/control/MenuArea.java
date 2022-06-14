package control;

import java.util.Scanner;

/*
 * 1. 사각형 2.삼각형 0.종료
 * 
 */
public class MenuArea {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int menu;
		String result;
		//반복
		     //menu 입력
		     //1이면 "사각형" 출력
		     //2이면 "삼각형" 출력
		     //0이면 break
		do {
			menu = Integer.parseInt(scan.nextLine());
			if(menu == 0) {
				break;
			}
			else if (menu == 1) {
				result = "사각형";
			}
			else if (menu == 2) {
				result = "삼각형";
			}
			else  {
				result = "다시입력";
			}
			
			System.out.println(result);
			
		} while (true);
		System.out.println("프로그램 종료");

	
	}
}
