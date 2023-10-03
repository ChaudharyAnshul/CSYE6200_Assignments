package edu.neu.csye6200;

public class LionAnimalistic implements AnimalisticAPI {

	// Override AnimalisticAPI speak
	@Override
	public void speak() {
    	System.out.println("Roar!!!!!");
    }

	// override Object class toString
    @Override
    public String toString() {
        return "[API: AnimalisticAPI] Lion can Roar\n";
    }

}
