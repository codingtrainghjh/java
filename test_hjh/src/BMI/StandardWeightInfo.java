package BMI;

public class StandardWeightInfo extends Human {
	StandardWeightInfo(String name, int height, int weight) {
		super(name, height, weight);
		
	}
	
	public void gsw() {
		System.out.println(getName() + "님의 신장 " + getHeight() +", 몸무게 " + getWeight() + ", 표준체중 " + getStandardWeight() + "입니다.");
	}
	public double getStandardWeight() {
		return (getHeight() - 100)*0.9;
	}
}
