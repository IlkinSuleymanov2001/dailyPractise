package com.accessbank;

import lombok.*;

@Getter
@Setter
@Builder
public class Person {

    String name;
    String surname;
    int age;
    String azFindCode;
    float salary;

 @Override
    public String toString() {
        return "hellooo";
    }

}
