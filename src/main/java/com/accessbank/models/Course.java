package com.accessbank.models;

public class Course {
    private final String name ;
    private final String address ;
    private final Pay pay ;
    private final String[] workHours;

    public Course(String name, String address, Pay pay, String[] workHours) {
        this.name = name;
        this.address = address;
        this.pay = pay;
        this.workHours = workHours;
    }
}
