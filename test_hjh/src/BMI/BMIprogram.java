package BMI;

import java.util.Scanner;

public class BMIprogram {
	public static void main(String[] args) {

		StandardWeightInfo human1 = new StandardWeightInfo("지완", 180, 60);
		ObesityInfo human2 = new ObesityInfo("홍준호", 170, 85);
		Scanner sc = new Scanner(System.in);

//		System.out.println("이름 : ");
//		String name = sc.nextLine();
//		System.out.println("키 : ");
//		int height = Integer.parseInt(sc.nextLine());
//		System.out.println("몸무게 : ");
//		int weight = Integer.parseInt(sc.nextLine());

		human1.gsw();
		human2.gob();

	}
}