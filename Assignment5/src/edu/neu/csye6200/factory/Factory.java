package edu.neu.csye6200.factory;

import edu.neu.csye6200.api.Item;

// Abstract Factory class
public abstract class Factory {

	public abstract Item createOject(String csvString);
	
}
