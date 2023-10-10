package edu.neu.csye6200.model;

import java.util.Collections;
import java.util.List;

import edu.neu.csye6200.comparator.AgeComparator;
import edu.neu.csye6200.comparator.IdComparator;

public class Person implements Comparable<Person> {
	
	// Data members of the class
	private int id;
	private int age;
	private String firstName;
	private String lastName;
	
	// constructor for person
	public Person(int id, int age, String firstName, String lastName) {
		super();
		this.id = id;
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "id= " + getId() + 
				", age= " + getAge() + 
				", firstName= " + getFirstName() + 
				", lastName= " + getLastName()+ "\n";
	}
	
	// default sort on last name
	@Override
	public int compareTo(Person nextPerson) {
		return this.lastName.compareTo(nextPerson.lastName);
	}
	
	public void sortByLastName(List<Person> roster ) {
        Collections.sort(roster);
    }

    public void sortByAge(List<Person> roster ) {
        Collections.sort(roster, new AgeComparator());
    }

    public void sortById(List<Person> roster ) {
        Collections.sort(roster, new IdComparator());
    }
	

	// getters
	public int getId() {
		return id;
	}

	public int getAge() {
		return age;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
}
