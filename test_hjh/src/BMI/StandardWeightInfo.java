package BMI;

public class StandardWeightInfo extends Human {
	StandardWeightInfo(String name, int height, int weight) {
		super(name, height, weight);
		
	}
	
	public void gsw() {
		System.out.println(getName() + "���� ���� " + getHeight() +", ������ " + getWeight() + ", ǥ��ü�� " + getStandardWeight() + "�Դϴ�.");
	}
	public double getStandardWeight() {
		return (getHeight() - 100)*0.9;
	}
}
