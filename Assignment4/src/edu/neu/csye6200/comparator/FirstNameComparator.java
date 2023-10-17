package edu.neu.csye6200.comparator;

import java.util.Comparator;

import edu.neu.csye6200.Person.Student;;

public class FirstNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getFirstName().compareTo(s2.getFirstName());
    }
}