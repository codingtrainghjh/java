import java.util.Scanner;

public class SwitchTest {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		//test1();
	    //test2();
		test3();

	}
	public static void test3() {
		int score = scan.nextInt();
		switch(score/10) {
			case 10:
			case 9:System.out.println("A���"); break;
			case 8:System.out.println("B���"); break;
			case 7:System.out.println("C���"); break;
			default:System.out.println("D���"); break;
		}
	}
	
	public static void test2() {
		int menu = scan.nextInt();
		//1~5 : ���� 6,7 : �ָ�
		switch(menu) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:System.out.println("����");break;
		case 6:
		case 7:System.out.println("�ָ�");break;
		}
	}
    public static void test1() {
    	String menu = scan.next();
    	//int, char, string, �����
    	switch(menu) {
    	case "����": System.out.println("700����"); break; 
    	case "����": System.out.println("500����"); break;
    	default: System.out.println("��Ÿ");
    	}
		
	}
}
