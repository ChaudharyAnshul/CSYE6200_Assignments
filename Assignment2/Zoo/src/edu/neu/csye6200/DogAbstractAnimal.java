package edu.neu.csye6200;

public class DogAbstractAnimal extends AbstractAnimalAPI{

	// Override AbstractAnimalAPI speak
	@Override
	public void speak() {
    	System.out.println("Bark!!!!!");
    }

	// override AbstractAnimalAPI class toString
    @Override
    public String toString() {
        return "[API: AbstractAnimalAPI] Dog can Bark\n";
    }
}
