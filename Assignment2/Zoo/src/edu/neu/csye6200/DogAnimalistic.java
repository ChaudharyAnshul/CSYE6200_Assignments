package edu.neu.csye6200;

public class DogAnimalistic implements AnimalisticAPI {

	// Override AnimalisticAPI speak
	@Override
	public void speak() {
    	System.out.println("Bark!!!!!");
    }

	// override Object class toString
    @Override
    public String toString() {
        return "[API: AnimalisticAPI] Dog can Bark\n";
    }

}