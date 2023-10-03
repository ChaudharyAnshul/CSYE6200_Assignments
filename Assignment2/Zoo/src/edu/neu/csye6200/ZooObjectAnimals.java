package edu.neu.csye6200;

public class ZooObjectAnimals {

	private ZooAnimals zooAnimals;
	private ZooAbstractAnimals zooAbstractAnimals;
	private ZooAnamalisticAnimals zooAnamalisticAnimals;
	
	public ZooObjectAnimals(ZooAnimals zooAnimals, ZooAbstractAnimals zooAbstractAnimals,
			ZooAnamalisticAnimals zooAnamalisticAnimals) {
		this.zooAnimals = zooAnimals;
		this.zooAbstractAnimals = zooAbstractAnimals;
		this.zooAnamalisticAnimals = zooAnamalisticAnimals;
	}
	
	public void animalSpeak(Object animal) {
	    if (animal instanceof AnimalAPI) {
	    	((AnimalAPI) animal).speak();
	    } else if (animal instanceof AbstractAnimalAPI) {
	    	((AbstractAnimalAPI) animal).speak();
	    } else {
	    	((AnimalisticAPI) animal).speak();
	    }
	}
	
	public void ZooDemo() {
		System.out.println("-------------------------------------");
		System.out.println(toString());
	
		animalSpeak(zooAnimals.getLion());
		animalSpeak(zooAnimals.getDog());
		animalSpeak(zooAnimals.getCat());
		
		animalSpeak(zooAbstractAnimals.getLion());
		animalSpeak(zooAbstractAnimals.getDog());
		animalSpeak(zooAbstractAnimals.getCat());
		
		animalSpeak(zooAnamalisticAnimals.getLion());
		animalSpeak(zooAnamalisticAnimals.getDog());
		animalSpeak(zooAnamalisticAnimals.getCat());
	}

	@Override
	public String toString() {
		return "ZooObjectAnimals [Demonstrate that ALL of your animal objects created from ALL animal classes]";
	}
	
}
