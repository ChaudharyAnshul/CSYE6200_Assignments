package edu.neu.csye6200;

public class DogAnimal extends AnimalAPI{

	// Override AnimalAPI speak
	@Override
	public void speak() {
    	System.out.println("Bark!!!!!");
    }

	// override AnimalAPI class toString
    @Override
    public String toString() {
        return "[API: AnamilApi] Dog can Bark\n";
    }
}
