package com.accessbank;

import lombok.*;

@Getter
@Setter
@Builder
public class Person {

    String name;
    String surname;
    int age;
    String findCode;
    String address;
    String birthday;


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", findCode='" + findCode + '\'' +
                ", address='" + address + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}
