package edu.neu.csye6200;

public abstract class AbstractAnimalAPI {

    public abstract void speak();

    // override Object class toString
    @Override
    public String toString() {
        return "[AbstractAnimalAPI]";
    }
}
