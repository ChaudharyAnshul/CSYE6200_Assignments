package edu.neu.csye6200.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import edu.neu.csye6200.api.Item;



public class FileUtil {
	// Base Program dir
	private static String BasePath = System.getProperty("user.dir");
	
	public static ArrayList<String> ReadCSV(String path) {
		// CSV path
		String csvPath = BasePath + path;
		
		// string List for all lines
		ArrayList<String> list = new ArrayList<String>();
		
		try(Scanner inLine = new Scanner(new BufferedReader(new FileReader(csvPath)))) {
        	System.out.println("\nReading CSV file " + path + ".............");
        	      	
        	// first line is the file headers
        	String headers = inLine.nextLine();
        	System.out.println("Person file headers: " + headers);
        	
        	// Iterate through all the lines
        	while (inLine.hasNextLine()) {
        		String inputLine = inLine.nextLine();
        		list.add(inputLine);        	
        	}
        	inLine.close();
        	System.out.println("Closed CSV file.............\n");
    	} catch (FileNotFoundException e) {
        	e.printStackTrace();
    	}
	
    	return list;
	}
	
	public static void WriteCSV(String path, ArrayList<Item> items) {
		// CSV path
		String csvPath = BasePath + path;
		String header = "Id,Name,Price";
		try(BufferedWriter writer = new BufferedWriter(new FileWriter(csvPath))) {
			System.out.println("\nWrite sorted items CSV file " + path + ".............");

            // Write the header row
            writer.write(header);
            writer.newLine();
            
            // Write student data rows
            for(Item i: items) {
            	writer.write(i.getId()+","+i.getName()+","+i.getPrice());
            	writer.newLine();            	
            }
            
            writer.close();
            System.out.println("Closed sorted items CSV file.............\n");
        } catch (IOException e) {
        	e.printStackTrace();
        }			
	}
}