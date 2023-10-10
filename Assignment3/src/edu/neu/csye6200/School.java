package edu.neu.csye6200;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import edu.neu.csye6200.comparator.AgeComparator;
import edu.neu.csye6200.comparator.GpaComparator;
import edu.neu.csye6200.comparator.IdComparator;
import edu.neu.csye6200.model.Person;
import edu.neu.csye6200.model.Student;

public class School {

	private List<Person> personRoster  = new ArrayList<Person>();
	private List<Student> studentRoster  = new ArrayList<Student>();
	
	
	// inner class SortPerson to sort person roster
	public static class SortPerson{
		
		public static void sortByLastName(List<Person> roster ) {
	        Collections.sort(roster);
	    }

	    public static void sortByAge(List<Person> roster ) {
	        Collections.sort(roster, new AgeComparator());
	    }

	    public static void sortById(List<Person> roster ) {
	        Collections.sort(roster, new IdComparator());
	    }
	}
	
	// inner class SortStudent to sort student roster
	public static class SortStudent {

	    public static void sortByLastName(List<Student> roster) {
	        Collections.sort(roster);
	    }

	    public static void sortByAge(List<Student> roster) {
	        Collections.sort(roster, new AgeComparator());
	    }

	    public static void sortById(List<Student> roster) {
	        Collections.sort(roster, new IdComparator());
	    }

	    public static void sortByGPA(List<Student> roster) {
	        Collections.sort(roster, new GpaComparator());
	    }
	}
		
	
	// load person CSV file data
	public void loadPersonCSV() {
        // Get local system path
		String projectPath = System.getProperty("user.dir");
		// relative path of file w.r.t project
        String realtivePath  = "/src/PersonData.csv";
        // dynamic CSV file path
        String csvPath = projectPath+realtivePath;

        try {
        	System.out.println("\nReading Person CSV file.....");
        	// read CSV
        	Scanner inLine = new Scanner(new BufferedReader(new FileReader(csvPath)));
        	// first line is the file headers
        	String headers = inLine.nextLine();
        	System.out.println("Person file headers: " + headers);
        	while (inLine.hasNextLine()) {
	        	String inputLine = inLine.nextLine();
	        	Scanner in = new Scanner(inputLine);
	        	in.useDelimiter(", ");
	        	String fname = in.next();
	        	String lname = in.next();
	        	int id = Integer.parseInt(in.next());
	        	int age = Integer.parseInt(in.next());
	        	personRoster.add(new Person (id,age,fname,lname));
	        	in.close();
        	}
        	inLine.close();
        	System.out.println("Closed Person CSV file.....");
    	} catch (FileNotFoundException e) {
        	e.printStackTrace();
    	}

    }
	
	// load student CSV file data
	public void loadStudentCSV() {
        // Get local system path
		String projectPath = System.getProperty("user.dir");
		// relative path of file w.r.t project
        String realtivePath  = "/src/StudentData.csv";
        // dynamic CSV file path
        String csvPath = projectPath+realtivePath;

        try {
        	System.out.println("\nReading Student CSV file.....");
        	// read CSV
        	Scanner inLine = new Scanner(new BufferedReader(new FileReader(csvPath)));
        	// first line is the file headers
        	String headers = inLine.nextLine();
        	System.out.println("Student file headers: " + headers);
        	while (inLine.hasNextLine()) {
	        	String inputLine = inLine.nextLine();
	        	Scanner in = new Scanner(inputLine);
	        	in.useDelimiter(", ");
	        	String fname = in.next();
	        	String lname = in.next();
	        	int id = Integer.parseInt(in.next());
	        	int age = Integer.parseInt(in.next());
	        	double gpa = Double.parseDouble(in.next());
	        	String pfname = in.next();
	        	String plastname = in.next();
	        	studentRoster.add(new Student (id,age,fname,lname,gpa,pfname,plastname));
	        	in.close();
        	}
        	inLine.close();
        	System.out.println("Closed Student CSV file.....");
    	} catch (FileNotFoundException e) {
        	e.printStackTrace();
    	}

    }
	
	
	public void demo(){
		
		// load person CSV file
		loadPersonCSV();
		
		// load student CSV file
		loadStudentCSV();
		
		// print original person list as per CSV
		System.out.println("\nOriginal personRoster List:\n" + personRoster);
		
		// print original student list as per CSV
		System.out.println("\nOriginal studentRoster List:\n" + studentRoster);
		
		//sorting personRoster
		System.out.println("\n-----Sorting Person-----\n");
        System.out.println("Sorting personRoster by LastName [Comparable]----");
        SortPerson.sortByLastName(personRoster);
        System.out.println(personRoster);
        
        System.out.println("Sorting personRoster by ID [Comparator]----");
        SortPerson.sortById(personRoster);
        System.out.println(personRoster);
        
        System.out.println("Sorting personRoster by Age [Comparator]----");
        SortPerson.sortByAge(personRoster);
        System.out.println(personRoster);
        
        //sorting studentRoster
        System.out.println("\n-----Sorting Student-----\n");
        System.out.println("Sorting studentRoster by LastName [Comparable]----");
        SortStudent.sortByLastName(studentRoster);
        System.out.println(studentRoster);
        
        System.out.println("Sorting studentRoster by ID [Comparator]----");
        SortStudent.sortById(studentRoster);
        System.out.println(studentRoster);
        
        System.out.println("Sorting studentRoster by Age [Comparator]----");
        SortStudent.sortByAge(studentRoster);
        System.out.println(studentRoster);
        
        System.out.println("-----Sorting studentRoster by GPA [Comparator]-----");
        SortStudent.sortByGPA(studentRoster);
        System.out.println(studentRoster);       
    }
	
}
