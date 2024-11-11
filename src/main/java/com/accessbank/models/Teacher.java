package com.accessbank.models;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class Teacher {

    private final int id;
    private final String name;
    private final String surname;
    private final List<Student> students ;
    private final String[] workHours;
    private final Pay pay;


    public Teacher(int id, String name, String surname, List<Student> students, String[] workHours, Pay pay) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.students = students;
        this.workHours = workHours;
        this.pay = pay;
    }
    public String toJson(){
        return new Gson().toJson(this);
    }
}
