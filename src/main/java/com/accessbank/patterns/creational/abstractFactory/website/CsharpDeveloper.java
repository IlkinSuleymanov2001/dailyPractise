package com.accessbank.patterns.creational.abstractFactory.website;

import com.accessbank.patterns.creational.abstractFactory.Developer;

public class CsharpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("write C# code");
    }
}
