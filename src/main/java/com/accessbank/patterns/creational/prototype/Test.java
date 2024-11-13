package com.accessbank.patterns.creational.prototype;

public class Test {

    public static void main(String[] args) {
        Departament departament = new Departament("salam","lalala",1111);
        DepartamentFactory departamentFactory = new DepartamentFactory(departament);
        Departament departamentCopy= departamentFactory.copyDepartament();

        System.out.println(departamentCopy.toString());
        System.out.println(departamentCopy.hashCode());
    }
}
