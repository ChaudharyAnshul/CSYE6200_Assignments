package edu.neu.csye6200;

public class LionAnimal extends AnimalAPI{

	// Override AnimalAPI speak
	@Override
	public void speak() {
    	System.out.println("Roar!!!!!");
    }

	// override AnimalAPI class toString
    @Override
    public String toString() {
        return "[API: AnamilApi] Lion can Roar\n";
    }
}
