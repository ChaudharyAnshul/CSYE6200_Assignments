package edu.neu.csye6200.comparator;

import java.util.Comparator;

import edu.neu.csye6200.model.Person;

public class IdComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
        return Integer.compare(p1.getId(), p2.getId());
    }
}