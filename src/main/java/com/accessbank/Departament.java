package com.accessbank;

public class Departament {
    private final String  worker;

    public Departament(String worker) {
        this.worker = worker;
    }

    public String getDepartmentBoss(){
        return worker;
    }

}
