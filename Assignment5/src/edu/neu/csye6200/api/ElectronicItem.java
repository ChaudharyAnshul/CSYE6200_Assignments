package edu.neu.csye6200.api;

public class ElectronicItem extends Item {
	// Constructor
    public ElectronicItem(String csvString) {
        super(csvString);
    }

    // Override toString
    @Override
    public String toString() {
        return "Electronic Item, ID: " + getId() + ", Name: " + getName() + ", Price: " + getPrice();
    }
}