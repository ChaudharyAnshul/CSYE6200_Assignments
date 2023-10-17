package edu.neu.csye6200.comparator;

import java.util.Comparator;

import edu.neu.csye6200.Person.Student;;

public class GpaComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s1.getGPA(), s2.getGPA());
    }
}