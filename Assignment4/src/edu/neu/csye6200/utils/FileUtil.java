package edu.neu.csye6200.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import edu.neu.csye6200.Person.Student;

public class FileUtil {
	// Base Program dir
	private static String BasePath = System.getProperty("user.dir");
	
	public static ArrayList<String> ReadCSV(String path) {
		// CSV path
		String csvPath = BasePath + path;
		
		// string List for all lines
		ArrayList<String> list = new ArrayList<String>();
		
		try(Scanner inLine = new Scanner(new BufferedReader(new FileReader(csvPath)))) {
        	System.out.println("\nReading Student CSV file " + path + ".............");
        	      	
        	// first line is the file headers
        	String headers = inLine.nextLine();
        	System.out.println("Person file headers: " + headers);
        	
        	// Iterate through all the lines
        	while (inLine.hasNextLine()) {
        		String inputLine = inLine.nextLine();
        		list.add(inputLine);        	
        	}
        	inLine.close();
        	System.out.println("Closed Student CSV file.............\n");
    	} catch (FileNotFoundException e) {
        	e.printStackTrace();
    	}
	
    	return list;
	}
	
	public static void WriteCSV(String path, ArrayList<Student> StudentList ,String header) {
		// CSV path
		String csvPath = BasePath + path;
		try(BufferedWriter writer = new BufferedWriter(new FileWriter(csvPath))) {
			System.out.println("\nWrite SortStudent CSV file " + path + ".............");

            // Write the header row
            writer.write(header);
            writer.newLine();
            
            // Write student data rows
            for(Student s: StudentList) {
            	writer.write(s.getID()+","+s.getAge()+","+s.getFirstName()+","+s.getLastName()+","+s.getParentFirstName()+","+s.getParentLastName()+","+s.getStudentID()+","+s.getGPA());
            	writer.newLine();            	
            }
            
            writer.close();
            System.out.println("Closed SortStudent CSV file.............\n");
        } catch (IOException e) {
        	e.printStackTrace();
        }			
	}
	
	public static void AppendCSV(String path, ArrayList<Student> StudentList) {
		// CSV path
		String csvPath = BasePath + path;
		try(BufferedWriter writer = new BufferedWriter(new FileWriter(csvPath, true))) {
			System.out.println("\nAppend SortStudent CSV file " + path + ".............");

            // Skip one line
            writer.newLine();
            
            // Write student data rows
            for(Student s: StudentList) {
            	writer.write(s.getID()+","+s.getAge()+","+s.getFirstName()+","+s.getLastName()+","+s.getParentFirstName()+","+s.getParentLastName()+","+s.getStudentID()+","+s.getGPA());
            	writer.newLine();            	
            }
            
            writer.close();
            System.out.println("Closed SortStudent CSV file.............\n");
        } catch (IOException e) {
        	e.printStackTrace();
        }			
	}
}