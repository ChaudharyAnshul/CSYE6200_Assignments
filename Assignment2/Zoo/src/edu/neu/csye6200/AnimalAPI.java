package edu.neu.csye6200;

public class AnimalAPI {
	
    public void speak() {
    	System.out.println("Waiting for Animals");
    }

    // override Object class toString
    @Override
    public String toString() {
        return "[AnamilApi]";
    }
}
