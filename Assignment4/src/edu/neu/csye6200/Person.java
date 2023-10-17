package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.Collections;

import edu.neu.csye6200.comparator.*;
import edu.neu.csye6200.utils.FileUtil;

public class Person implements Comparable<Person> {
	// Person attributes
	private int ID;
    private int age;
    private String firstName;
    private String lastName;
    private String parentFirstName;
    private String parentLastName;

    // Person Constructor
    public Person(int ID, int age, String firstName, String lastName, String parentFirstName, String parentLastName) {
        this.ID = ID;
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.parentFirstName = parentFirstName;
        this.parentLastName = parentLastName;
    }
    
    // Constructor to create object in Driver
    public Person() {}
    
	@Override
	public String toString() {
		return "Person [ID=" + getID() + ", age=" + getAge() + ", firstName=" + getFirstName() + ", lastName=" + getLastName()
				+ ", parentFirstName=" + getParentFirstName() + ", parentLastName=" + getParentLastName() + "]\n";
	}
	
	// Student Inner Class
	public static class Student extends Person {
        // Student attributes
        private int studentID;
        private double GPA;

        // Student Constructor 
        public Student(int ID, int age, String firstName, String lastName, String parentFirstName, String parentLastName, int studentID, double GPA) {
            super(ID, age, firstName, lastName, parentFirstName, parentLastName);
            this.studentID = studentID;
            this.GPA = GPA;
        }
        
        // create student object from CSV string data
        public static Student createObjectFromCSV(String csv) {
            String[] values = csv.split(",");
            if (values.length == 8) {
                int ID = Integer.parseInt(values[0]);
                int age = Integer.parseInt(values[1]);
                String firstName = values[2];
                String lastName = values[3];
                String parentFirstName = values[4];
                String parentLastName = values[5];
                int studentID = Integer.parseInt(values[6]);
                double GPA = Double.parseDouble(values[7]);
                return new Student(ID, age, firstName, lastName, parentFirstName, parentLastName, studentID, GPA);
            }
			return null; 
        }
        
        // Create Student object List from CSV file and return it
        public static ArrayList<Student> createStudentList() {
        	ArrayList<Student> studentList = new ArrayList<Student>();
        	String path = "/resources/Student.txt";
        	ArrayList<String> list = FileUtil.ReadCSV(path);
        	
        	for (String l: list) {
        		Student s = createObjectFromCSV(l);
        		studentList.add(s);
        	}
			return studentList;
        	
        }
        
        public static void sortByLastName(ArrayList<Student> list ) {
            Collections.sort(list);
        }
        
        public static void sortByID(ArrayList<Student> list ) {
            Collections.sort(list, new IdComparator());
        }
        
        public static void sortByFirstName(ArrayList<Student> list ) {
            Collections.sort(list, new FirstNameComparator());
        }
        
        public static void sortByGPA(ArrayList<Student> list ) {
            Collections.sort(list, new GpaComparator());
        }
        
        public static void sortByStudentID(ArrayList<Student> list ) {
            Collections.sort(list, new StudentIdComparator());
        }
       
        // Student to string
        @Override
		public String toString() {
			return "Student [ID=" + getID() + ", age=" + getAge() + ", firstName=" + getFirstName() + ", lastName=" + getLastName()
			+ ", parentFirstName=" + getParentFirstName() + ", parentLastName=" + getParentLastName() +
			", studentID=" + getStudentID() + ", GPA=" + getGPA() + "]\n";
		}

		// Student Getters
        public int getStudentID() {
            return studentID;
        }

        public double getGPA() {
            return GPA;
        }
    }
	
	// Teacher Inner Class
    public class Teacher extends Person {
        // Teacher attributes
        private double hourlyWage;
        private ArrayList<Student> assignedStudents;

        // Teacher Constructor
        public Teacher(int ID, int age, String firstName, String lastName, String parentFirstName, String parentLastName, double hourlyWage) {
            super(ID, age, firstName, lastName, parentFirstName, parentLastName);
            this.hourlyWage = hourlyWage;
            this.assignedStudents = null;
        }

        // toSting teacher
        @Override
		public String toString() {
			return "\nTeacher [ID= " + getID() + ", age= " + getAge() + ", firstName= " + getFirstName() + ", lastName= " + getLastName()
			+ ", parentFirstName= " + getParentFirstName() + ", parentLastName= " + getParentLastName() +
			", hourlyWage= " + getHourlyWage() + "]\n" 
			+ "assignedStudents= " + getAssignedStudents() + "\n";
		}
        
        // Teacher Getters
        public double getHourlyWage() {
            return hourlyWage;
        }

		public ArrayList<Student> getAssignedStudents() {
			return assignedStudents;
		}
		
		// Teacher Setters
		public void setAssignedStudents(ArrayList<Student> assignedStudents) {
			this.assignedStudents = assignedStudents;
		}
    }
    
    // program execution
	public void demo() {
		// Create Student Array
		ArrayList<Student> StudentList = Student.createStudentList();
		
		// Create Teacher Object
		Teacher teacher = new Teacher(1, 33, "Ann", "Teller", "Tree", "Telle", 40);
		teacher.setAssignedStudents(StudentList);
		System.out.println("-- Teacher Details and Assigned Students --");
		System.out.println(teacher.toString());
		
		// Sort Student By Last Name
		Student.sortByLastName(StudentList);
		System.out.println("-- Sort Student By Last Name --");
		System.out.println(StudentList);
		// write to new CSV file
		String studentCSVHeader = "ID,age,firstName,lastName,parentFirstName,parentLastName,studentID,GPA";
		FileUtil.WriteCSV("/resources/SortedStudents.csv", StudentList, studentCSVHeader);
		
		// Sort Student By First Name
		Student.sortByFirstName(StudentList);
		System.out.println("-- Sort Student By First Name --");
		System.out.println(StudentList);
		//write to existing CSV file
		FileUtil.AppendCSV("/resources/SortedStudents.csv", StudentList);
		
		// Sort Student By ID
		Student.sortByID(StudentList);
		System.out.println("-- Sort Student By ID --");
		System.out.println(StudentList);
		//write to existing CSV file
		FileUtil.AppendCSV("/resources/SortedStudents.csv", StudentList);
		
		// Sort Student By GPA
		Student.sortByGPA(StudentList);
		System.out.println("-- Sort Student By GPA --");
		System.out.println(StudentList);
		//write to existing CSV file
		FileUtil.AppendCSV("/resources/SortedStudents.csv", StudentList);
		
		// Sort Student By StudentId
		Student.sortByStudentID(StudentList);
		System.out.println("-- Sort Student By Student ID --");
		System.out.println(StudentList);
		//write to existing CSV file
		FileUtil.AppendCSV("/resources/SortedStudents.csv", StudentList);
	}
	
	// default sort
	@Override
	public int compareTo(Person nextPerson) {
		return this.lastName.compareTo(nextPerson.lastName);
	}
	
	// Person Getters 
	public int getID() {
		return ID;
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

	public String getParentFirstName() {
		return parentFirstName;
	}

	public String getParentLastName() {
		return parentLastName;
	}
	
}
