package com.accessbank.patterns.creational.builder;

import java.time.LocalDate;

public final class Customer {


    private final String name;
    private final  String surname;
    private final  int age;
    private final LocalDate birthDate;


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    private  Customer(CustomerBuilder customerBuilder){
        this.age = customerBuilder.age;
        this.name = customerBuilder.name;
        this.surname = customerBuilder.surname;
        this.birthDate = customerBuilder.birthDate;
    }


    public static CustomerBuilder builder(){
        return  new CustomerBuilder();
    }

      public static  class CustomerBuilder{


          private String name;
          private String surname;
          private int age;
          private LocalDate birthDate;


          public CustomerBuilder setName(String name) {
              this.name = name;
              return this;
          }

          public CustomerBuilder setSurname(String surname) {
              this.surname = surname;
              return this;
          }

          public CustomerBuilder setAge(int age) {
              this.age = age;
              return this;
          }

          public CustomerBuilder setBirthDate(LocalDate birthDate) {
              this.birthDate = birthDate;
              return this;
          }

          public Customer build() {
              return new Customer(this);
          }
    }
}
