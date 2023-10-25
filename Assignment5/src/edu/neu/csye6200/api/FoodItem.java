package edu.neu.csye6200.api;

public class FoodItem extends Item {
	// Constructor
    public FoodItem(String csvString) {
        super(csvString);
    }

    // override toString
    @Override
    public String toString() {
        return "Food Item, ID: " + getId() + ", Name: " + getName() + ", Price: " + getPrice();
    }
}