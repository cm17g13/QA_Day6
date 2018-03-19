package BuilderPattern;

public class DogBuilder {

	private String name;
	private int age;
	private boolean goodBoy = true;
	private boolean zoomies;

	public DogBuilder() {

	}

	public Dog buildDog() {
		return new Dog(name, age, goodBoy, zoomies);
	}

	public DogBuilder name(String _name) {
		this.name = _name;
		return this;
	}
	public DogBuilder age(int _age) {
		this.age = _age;
		return this;
	}
	public DogBuilder goodBoy(boolean _goodBoy) {
		this.goodBoy = _goodBoy;
		return this;
	}
	public DogBuilder zoomies(boolean _zoomies) {
		this.zoomies = _zoomies;
		return this;
	}
	

}
