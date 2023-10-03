package edu.neu.csye6200;

public class Driver {

	public static void main(String[] args) {
		
		// demo AnimalAPI
		AnimalAPI lion = new LionAnimal();
		AnimalAPI dog = new DogAnimal();
		AnimalAPI cat = new CatAnimal();
		ZooAnimals zooAnimals = new ZooAnimals(lion,dog,cat);
		zooAnimals.zooAnimalsDemo();
		
		// demo AbstractAnimalAPI
		AbstractAnimalAPI lionA = new LionAbstractAnimal();
		AbstractAnimalAPI dogA = new DogAbstractAnimal();
		AbstractAnimalAPI catA = new CatAbstractAnimal();
		ZooAbstractAnimals zooAbstractAnimals = new ZooAbstractAnimals(lionA,dogA,catA);
		zooAbstractAnimals.zooAbstractAnimalsDemo();
		
		// demo AnimalisticAPI
		AnimalisticAPI lionI = new LionAnimalistic();
		AnimalisticAPI dogI = new DogAnimalistic();
		AnimalisticAPI catI = new CatAnimalistic();
		ZooAnamalisticAnimals zooAnamalisticAnimals = new ZooAnamalisticAnimals(lionI,dogI,catI);
		zooAnamalisticAnimals.ZooAnamalisticAnimalsDemo();
		
		ZooObjectAnimals zooObjectAnimals = new ZooObjectAnimals(zooAnimals, zooAbstractAnimals, zooAnamalisticAnimals);
		zooObjectAnimals.ZooDemo();
	}

}
