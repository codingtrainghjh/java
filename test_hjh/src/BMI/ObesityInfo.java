package BMI;

public class ObesityInfo extends StandardWeightInfo {
private int getStandardWeight;
	
	ObesityInfo(String name, int height, int weight) {
		super(name, height, weight);
		
		
	}
	public void gob() {
		System.out.println(getName() + "���� ���� " + getHeight() + ", ������ " + getWeight() +", " + getObesity());
	}
	public double getObesity() {
		double result = (getWeight() - getStandardWeight)/(getStandardWeight*100); {
			if(result > 30) {
				System.out.println("���Դϴ�.");
			}else if(result > 25) {
				System.out.println("��ü���Դϴ�.");
			}else if(result > 18) {
				System.out.println("�����Դϴ�.");
			}else {
				System.out.println("��ü���Դϴ�.");
			}
			
		}
		return result;
	}
}
