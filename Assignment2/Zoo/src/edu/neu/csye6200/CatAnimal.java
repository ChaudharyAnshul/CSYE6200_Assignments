package edu.neu.csye6200;

public class CatAnimal extends AnimalAPI{

	// Override AnimalAPI speak
	@Override
	public void speak() {
    	System.out.println("Meow!!!!!");
    }

	// override AnimalAPI class toString
    @Override
    public String toString() {
        return "[API: AnamilApi] cat can Meow\n";
    }
}