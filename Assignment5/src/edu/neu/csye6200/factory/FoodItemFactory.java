package edu.neu.csye6200.factory;

import edu.neu.csye6200.api.*;

// Factory method pattern
public class FoodItemFactory extends Factory{
	
	// create FoodItem object using factory
	@Override
	public Item createOject(String csvString) {
		return new FoodItem(csvString);
	}

}
