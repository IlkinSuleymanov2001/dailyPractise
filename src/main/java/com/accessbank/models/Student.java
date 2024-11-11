package com.accessbank.models;

import java.util.List;

public  final class Student {

    private final  String name;
    private final  String surname;
    private final List<Task> tasks;

    public Student(String name, String surname, List<Task> tasks) {
        this.name = name;
        this.surname = surname;
        this.tasks = tasks;
    }
}
