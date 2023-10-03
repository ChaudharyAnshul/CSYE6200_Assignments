package edu.neu.csye6200;

public class ZooAbstractAnimals {
	
	private AbstractAnimalAPI lion;
	private AbstractAnimalAPI dog;
	private AbstractAnimalAPI cat;

	public ZooAbstractAnimals(AbstractAnimalAPI lion, AbstractAnimalAPI dog, AbstractAnimalAPI cat) {
		this.lion = lion;
		this.dog = dog;
		this.cat = cat;
	}

	public void zooAbstractAnimalsDemo() {
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
		return "ZooAbstractAnimals [Objects derived from AbstractAnimalAPI]\n";
	}

	// getters
	public AbstractAnimalAPI getLion() {
		return lion;
	}

	public AbstractAnimalAPI getDog() {
		return dog;
	}

	public AbstractAnimalAPI getCat() {
		return cat;
	}

}
