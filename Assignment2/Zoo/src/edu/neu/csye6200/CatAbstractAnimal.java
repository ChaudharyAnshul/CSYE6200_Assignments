package edu.neu.csye6200;

public class CatAbstractAnimal extends AbstractAnimalAPI{

	// Override AbstractAnimalAPI speak
	@Override
	public void speak() {
    	System.out.println("Meow!!!!!");
    }

	// override AbstractAnimalAPI class toString
    @Override
    public String toString() {
        return "[API: AbstractAnimalAPI] cat can Meow\n";
    }
}