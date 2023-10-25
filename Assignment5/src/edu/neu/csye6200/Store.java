package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import edu.neu.csye6200.api.*;
import edu.neu.csye6200.factory.*;
import edu.neu.csye6200.utils.FileUtil;

public class Store extends AbstractStore {
    private ArrayList<Item> items = new ArrayList<>();

    public void sort(Comparator<Item> comparator) {
        Collections.sort(items, comparator);
    }
    
    // Method to display the items in the store
    @Override
    public void displayList() {
	    items.forEach(System.out::println);
    }
    
    // Create Objects using Factory
    @Override
    public void createItems() {
        // Use the factories to create items from CSV files
        List<String> foodCSV = FileUtil.ReadCSV("/resources/FoodItemCSV.txt");
        List<String> electronicCSV = FileUtil.ReadCSV("/resources/ElectronicItemCSV.txt");
        List<String> serviceCSV = FileUtil.ReadCSV("/resources/serviceItemCSV.txt");

        // Factory method pattern
        FoodItemFactory foodItemFactory = new FoodItemFactory();
        
        // Lazy Singleton and Factory method patterns
        ElectronicItemFactory electronicItemFactory = ElectronicItemFactory.getInstance();
        
        // Eager Singleton and Factory method patterns
        ServiceItemFactory serviceItemFactory = ServiceItemFactory.getInstance();

        // load foodItems into items list
        for (String csv : foodCSV) {
            items.add(foodItemFactory.createOject(csv));
        }
        
        // load electronicItems into items list
        for (String csv : electronicCSV) {
            items.add(electronicItemFactory.createOject(csv));
        }
        
        // load electronicItems into items list
        for (String csv : serviceCSV) {
            items.add(serviceItemFactory.createOject(csv));
        }
    }
    
    // write in items in outputCSV.text
	@Override
	public void writeItems() {
		String writePath = "/resources/outputCSV.txt";
		FileUtil.WriteCSV(writePath, items);
	}
    
	// Demo method 
    @Override
    public void demo() {
    	
    	// Store Object
    	Store store = new Store();
    	
    	// call create items
        store.createItems();

        // Display the items in the store
        System.out.println("---Original items in the store---");
        store.displayList();
        
        // Sort and display items by ID
        System.out.println("\n\n---Items sorted by ID---");
        store.sort(Comparator.comparing(Item::getId));
        store.displayList();

        // Sort and display items by PRICE
        System.out.println("\n\n---Items sorted by PRICE---");
        store.sort(Comparator.comparing(Item::getPrice));
        store.displayList();

        // Sort and display items by NAME
        System.out.println("\n\n---Items sorted by NAME---");
        store.sort(Comparator.comparing(Item::getName));
        store.displayList();
        
        // write items to file
        store.writeItems();
    }
}