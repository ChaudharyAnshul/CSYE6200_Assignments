package edu.neu.csye6200.factory;

import edu.neu.csye6200.api.*;

// Lazy Singleton and Factory method patterns
public class ElectronicItemFactory extends Factory {

	// factory instance initially set to null 
	private static ElectronicItemFactory instance;
	
	// private constructor to restrict creation of object
	private ElectronicItemFactory() {}
	
	// to get the factory object
	public static ElectronicItemFactory getInstance() {
        if (instance == null) {
            instance = new ElectronicItemFactory();
        }
        return instance;
    }
	
	// create ElectronicItem object using factory
	@Override
	public Item createOject(String csvString) {
		return new ElectronicItem(csvString);
	}

}