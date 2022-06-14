package BMI;

public class ObesityInfo extends StandardWeightInfo {
private int getStandardWeight;
	
	ObesityInfo(String name, int height, int weight) {
		super(name, height, weight);
		
		
	}
	public void gob() {
		System.out.println(getName() + "님의 신장 " + getHeight() + ", 몸무게 " + getWeight() +", " + getObesity());
	}
	public double getObesity() {
		double result = (getWeight() - getStandardWeight)/(getStandardWeight*100); {
			if(result > 30) {
				System.out.println("비만입니다.");
			}else if(result > 25) {
				System.out.println("과체중입니다.");
			}else if(result > 18) {
				System.out.println("정상입니다.");
			}else {
				System.out.println("저체중입니다.");
			}
			
		}
		return result;
	}
}
