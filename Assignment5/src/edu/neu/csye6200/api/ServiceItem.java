package edu.neu.csye6200.api;

public class ServiceItem extends Item {
    public ServiceItem(String csvString) {
        super(csvString);
    }

    @Override
    public String toString() {
        return "Service Item - " + super.toString();
    }
}