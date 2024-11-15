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

}
