package BMI;

public class Human {
	 //필드
		private String name;
		private int height;
		private int weight;
		
		//생성자
		public Human() {
			
		}
		
		public Human(String name, int height, int weight){
			this.name = name;
			this.height = height;
			this.weight = weight;
		}
		//메소드
		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getHeight() {
			return height;
		}

		public void setHeight(int height) {
			this.height = height;
		}

		public int getWeight() {
			return weight;
		}

		public void setWeight(int weight) {
			this.weight = weight;
		};
		public void getInformation() {
			System.out.println("이름 : " + name);
			System.out.println("키 : " + height);
			System.out.println("몸무게 : " + weight);
		}
		
	
}
