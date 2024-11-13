package com.accessbank.patterns.structural.bridge;

public class Banking implements Application{
    @Override
    public String getPrice() {
        return "200$";
    }
}
