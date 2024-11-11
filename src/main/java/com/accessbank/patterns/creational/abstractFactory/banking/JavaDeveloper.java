package com.accessbank.patterns.creational.abstractFactory.banking;

import com.accessbank.patterns.creational.abstractFactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java Developer and write java code ");
    }
}
