package edu.neu.csye6200;

public class CatAnimalistic implements AnimalisticAPI {

	// Override AnimalisticAPI speak
	@Override
	public void speak() {
    	System.out.println("Meow!!!!!");
    }

	// override Object class toString
    @Override
    public String toString() {
        return "[API: AnimalisticAPI] Cat can Meow\n";
    }

}