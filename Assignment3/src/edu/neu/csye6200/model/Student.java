package edu.neu.csye6200.model;

public class Student extends Person{
	
	// Data member
	private double gpa;
	private Parent parent;

	// constructor
	public Student(int id, int age, String firstName, String lastName, double gpa, String parentFirstName, String parentLastName) {
		super(id, age, firstName, lastName);
		this.gpa = gpa;
		parent = new Parent(parentFirstName, parentLastName); 
	}
	
	// inner class
	private class Parent{
		
		private String firstName;
		private String lastName;
		
		// inner class constructor	
		public Parent(String firstName, String lastName) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
		}
		
		// getters
		public String getFirstName() {
			return firstName;
		}
		public String getLastName() {
			return lastName;
		}
	}
	
	@Override
	public String toString() {
		return "id= " + getId() + 
				", age= " + getAge() + 
				", firstName= " + getFirstName() + 
				", lastName= " + getLastName() + 
				", GPA= " + getGpa() + 
				", parentFirstName= " + getParent().getFirstName() + 
				", parentLastName= " + getParent().getLastName() + "\n";
	}
	
	// getters
	public double getGpa() {
		return gpa;
	}

	public Parent getParent() {
		return parent;
	}		
}
