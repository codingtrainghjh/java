package BMI;

import java.util.Scanner;

public class BMIprogram {
	public static void main(String[] args) {

		StandardWeightInfo human1 = new StandardWeightInfo("����", 180, 60);
		ObesityInfo human2 = new ObesityInfo("ȫ��ȣ", 170, 85);
		Scanner sc = new Scanner(System.in);

//		System.out.println("�̸� : ");
//		String name = sc.nextLine();
//		System.out.println("Ű : ");
//		int height = Integer.parseInt(sc.nextLine());
//		System.out.println("������ : ");
//		int weight = Integer.parseInt(sc.nextLine());

		human1.gsw();
		human2.gob();

	}
}