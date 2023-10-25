package edu.neu.csye6200.api;

public class Item {
	// Attributes
	private int id;
    private String name;
    private double price;

    // Item Constructor
    public Item(String csvString) {
    	String[] values = csvString.split(",");
        if (values.length == 3) {
        	this.id = Integer.parseInt(values[0]);
            this.name = values[1];
            this.price = Double.parseDouble(values[2]);
        }
    }

    // Getters
    public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	// Override toString
	@Override
    public String toString() {
        return "Item, ID: " + getId() + ", Name: " + getName() + ", Price: " + getPrice();
    }
}