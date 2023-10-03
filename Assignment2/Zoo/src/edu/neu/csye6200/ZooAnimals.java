package edu.neu.csye6200;

public class ZooAnimals {

	private AnimalAPI lion;
	private AnimalAPI dog;
	private AnimalAPI cat;
	
	public ZooAnimals(AnimalAPI lion, AnimalAPI dog, AnimalAPI cat) {
		this.lion = lion;
		this.dog = dog;
		this.cat = cat;
	}
	
	public void zooAnimalsDemo() {
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
		return "ZooAnimals [Objects derived from AnimalAPI]\n";
	}

	// getters
	public AnimalAPI getLion() {
		return lion;
	}

	public AnimalAPI getDog() {
		return dog;
	}

	public AnimalAPI getCat() {
		return cat;
	}	
	
}
