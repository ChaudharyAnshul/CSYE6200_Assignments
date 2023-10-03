package edu.neu.csye6200;

public class ZooAnamalisticAnimals {
	
	private AnimalisticAPI lion;
	private AnimalisticAPI dog;
	private AnimalisticAPI cat;

	public ZooAnamalisticAnimals(AnimalisticAPI lion, AnimalisticAPI dog, AnimalisticAPI cat) {
		super();
		this.lion = lion;
		this.dog = dog;
		this.cat = cat;
	}

	public void ZooAnamalisticAnimalsDemo() {
		System.out.println("-------------------------------------");
		System.out.println(toString());

		lion.speak();
		System.out.println(lion.toString());
		dog.speak();
		System.out.println(dog.toString());
		cat.speak();
		System.out.println(cat.toString());
	}

	@Override
	public String toString() {
		return "ZooAnamalisticAnimals [Objects derived from AnimalisticAPI]\n";
	}

	// getters
	public AnimalisticAPI getLion() {
		return lion;
	}

	public AnimalisticAPI getDog() {
		return dog;
	}

	public AnimalisticAPI getCat() {
		return cat;
	}		
}