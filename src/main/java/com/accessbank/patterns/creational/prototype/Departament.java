package com.accessbank.patterns.creational.prototype;

public class Departament implements CommonsCloneAble{

    String name;
    String address;
    int   code;

    public Departament(String name, String address, int code) {
        this.name = name;
        this.address = address;
        this.code = code;
    }

    @Override
    public Object copy() {
        return  new Departament(this.name,this.address,this.code);
    }

    @Override
    public String toString() {
        return "Departament{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", code=" + code +
                '}';
    }
}
