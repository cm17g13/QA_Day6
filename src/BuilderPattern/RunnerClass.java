package BuilderPattern;

public class RunnerClass {

	public static void main(String[] args) {
		
		//can place all of the methods in a different order and its okay
		Dog d1 = new DogBuilder().name("Tessa").age(17).buildDog();
		Dog d2 = new DogBuilder().age(8).name("Bailey").zoomies(true).buildDog();
		Dog d3 = new DogBuilder().goodBoy(false).name("BadDog").age(20).zoomies(false).buildDog();
		System.out.println(d1.toString());
		System.out.println(d2.toString());
		System.out.println(d3.toString());
		
	}

}
