package edu.neu.csye6200;

public class LionAbstractAnimal extends AbstractAnimalAPI{

	// Override AbstractAnimalAPI speak
	@Override
	public void speak() {
    	System.out.println("Roar!!!!!");
    }

	// override AbstractAnimalAPI class toString
    @Override
    public String toString() {
        return "[API: AbstractAnimalAPI] Lion can Roar\n";
    }
}