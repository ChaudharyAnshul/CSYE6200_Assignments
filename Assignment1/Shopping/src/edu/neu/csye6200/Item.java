package edu.neu.csye6200;

public class Item {

	// static immutable data 
	public static final int revision = 1;
	
	// item data 
	private String itemName;
	private double itemCost;
	
	// Item Constructor 
	public Item(String itemName, double itemCost) {
		super();
		this.itemName = itemName;
		this.itemCost = itemCost;
	}	

	// Getter for itemName
	public String getItemName() {
		return itemName;
	}
	
	// Getter for itemCost
	public double getItemCost() {
		return itemCost;
	}

	// toString to get item details 
	@Override
	public String toString() {
		return "Name = " + itemName + ", Cost = " + itemCost;
	}
	
	public static void demo() {
        // Create items
        Item egg = new Item("Egg", 5.0);
        Item milk = new Item("Milk", 7.5);
        Item bread = new Item("Bread", 4.25);

        // Create a shopping cart
        Cart myCart = new Cart(20.0);

        // Add items to the cart and calculate change using pass by value
        myCart.sillyCheckout(myCart.getMyCash(), egg.getItemCost(), myCart.getMyTotal(), myCart.getMyChange());     
        myCart.sillyCheckout(myCart.getMyCash(), milk.getItemCost(), myCart.getMyTotal(), myCart.getMyChange());
        myCart.sillyCheckout(myCart.getMyCash(), bread.getItemCost(), myCart.getMyTotal(), myCart.getMyChange());
        
        // print Cart class data members to show that the values are not updated by sillyCheckout
        System.out.println(myCart.toString());
        
        // Actual checkout on items
        
        System.out.println("\n\nItemized Receipt:\n");

        myCart.checkout(myCart, egg);
        myCart.checkout(myCart, milk);
        myCart.checkout(myCart, bread);
        
        System.out.println("\nPurchase Summary:");
        System.out.println(myCart.toString());
    }
	
}
