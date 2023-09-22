package edu.neu.csye6200;

public class Shopping {
	
	// Balance to shop
	private double balance = 20.0;
	
	// create objects for Items in shop
	private Item bread = new Item("Bread", 3.45);
	private Item milk = new Item("Milk", 4.32);
	private Item egg = new Item("Egg", 1.45);
	private Item potato = new Item("Potato", 3.45);
	
	public double getBalance() {
		return balance;
	}
	public Item getBread() {
		return bread;
	}
	public void setBread(Item bread) {
		this.bread = bread;
	}
	public Item getMilk() {
		return milk;
	}
	public void setMilk(Item milk) {
		this.milk = milk;
	}
	public Item getEgg() {
		return egg;
	}
	public void setEgg(Item egg) {
		this.egg = egg;
	}
	public Item getPotato() {
		return potato;
	}
	public void setPotato(Item potato) {
		this.potato = potato;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}
