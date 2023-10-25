package edu.neu.csye6200.factory;

import edu.neu.csye6200.api.ServiceItem;
import edu.neu.csye6200.api.Item;

// Eager Singleton and Factory method patterns
public class ServiceItemFactory extends Factory {

	// factory instance initialized with object
	private static final ServiceItemFactory instance = new ServiceItemFactory();
    
	// private constructor to restrict creation of object
    private ServiceItemFactory() {}
    
    // to get the factory object
    public static ServiceItemFactory getInstance() {
        return instance;
    }
	
    // create ElectronicItem object using factory
	@Override
	public Item createOject(String csvString) {
		// TODO Auto-generated method stub
		return new ServiceItem(csvString);
	}

}
