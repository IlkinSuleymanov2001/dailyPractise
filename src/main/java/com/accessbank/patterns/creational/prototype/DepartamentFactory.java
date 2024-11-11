package com.accessbank.patterns.creational.prototype;

public class DepartamentFactory {

    private  final Departament departament;


    public DepartamentFactory(Departament departament) {
        this.departament = departament;
    }

    public Departament copyDepartament() {
        return  (Departament) departament.copy();
    }
}
