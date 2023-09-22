package edu.neu.csye6200;

import java.time.LocalDateTime;

public class Item {

	// static immutable data 
	public static final int revision = 1;
	
	// item data 
	private String itemName = "";
	private double itemCost = 0.0;
	
	public Item(String itemName, double itemCost) {
		super();
		this.itemName = itemName;
		this.itemCost = itemCost;
	}	

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public double getItemCost() {
		return itemCost;
	}

	public void setItemCost(double itemCost) {
		this.itemCost = itemCost;
	}

	@Override
	public String toString() {
		return "Item [itemName=" + itemName + ", itemCost=" + itemCost + "]";
	}
	
	public static void demo() {
		
		Shopping shop = new Shopping();
		
		// shopping details
		String details = "";
		
		// Total Cart Items
		double cartTotal = 0.0;	
		
		System.out.println("Available Balance = " + shop.getBalance() );
		
		// purchase bread
		Item b = shop.getBread();
		cartTotal += b.getItemCost();
		
		details += "\n purchased : " + b.getItemName() + ", cost : " + b.getItemCost(); 
		
		
		// purchase bread
		Item e = shop.getEgg();
		cartTotal += e.getItemCost();
		
		details += "\n purchased : " + e.getItemName() + ", cost : " + e.getItemCost();
		
		// purchase bread
		Item m = shop.getMilk();
		cartTotal += m.getItemCost();
		
		details += "\n purchased : " + m.getItemName() + ", cost : " + m.getItemCost();
		
		System.out.println(details);
		LocalDateTime now = LocalDateTime.now();
		System.out.println("Time of Purchase :" + now);
		System.out.println("Total = " + cartTotal);
		shop.setBalance(shop.getBalance()-cartTotal);
		System.out.println("New Balance = " + shop.getBalance());
		
		
	}
}
