package BuilderPattern;

public class Dog {

	private String name;
	private int age;
	private boolean goodBoy;
	private boolean zoomies;


		public Dog(String name, int age, boolean goodBoy, boolean zoomies) {
			this.name = name;
			this.age = age;
			this.goodBoy = goodBoy;
			this.zoomies = zoomies;
		}
		
		public String toString() {
			return "Name: " + name + " Age: " +  age + " GoodBoy: " + goodBoy + " Zoomies: " + zoomies;
		}

}
