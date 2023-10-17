package edu.neu.csye6200.comparator;

import java.util.Comparator;

import edu.neu.csye6200.Person.Student;

public class IdComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.getID(), s2.getID());
    }
}