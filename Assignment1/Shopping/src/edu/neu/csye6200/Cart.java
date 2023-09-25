package edu.neu.csye6200;

public class Cart {
	 private double myCash;
	 private double myTotal;
	 private double myChange;
	 
	 public Cart(double myCash) {
		super();
		this.myCash = myCash;
		this.myTotal = 0.0;
		this.myChange = 0.0;
	}

	// sillyCheckout method to try a dummy checkout demonstrating pass by value
	public void sillyCheckout(double cash, double price, double total, double change) {
		total += price;
		change = cash - total;
		System.out.println("Silly Checkout -- Total: $" + total + " Change: $" + change);
	}

	// checkout method to do a checkout and update cash demonstrating pass by reference
	 public double checkout(Cart myCart, Item myItem) {
		 myCart.setMyTotal(myCart.getMyTotal()+myItem.getItemCost());
		 myCart.setMyChange(myCart.getMyCash()-myCart.getMyTotal());
		 System.out.println("Purchased Item: " + myItem.toString());		 
		 return myCart.getMyChange(); 
	 }

	@Override
	public String toString() {
		return "\nTotal: $" + myTotal + "\nCash: $" + myCash + "\nChange: $" + myChange;
	}
	
	
	// getters 
	public double getMyCash() {
		return myCash;
	}

	public double getMyTotal() {
		return myTotal;
	}

	public double getMyChange() {
		return myChange;
	}

	// setters
	public void setMyCash(double myCash) {
		this.myCash = myCash;
	}

	public void setMyTotal(double myTotal) {
		this.myTotal = myTotal;
	}

	public void setMyChange(double myChange) {
		this.myChange = myChange;
	}	 
}
