package com.accessbank.patterns.structural.bridge;

public class Test {

    public static void main(String[] args) {

        Application[] application = {
                new Banking(),
                new StockExhange()
        };

        for (Application app : application) {
            System.out.println(app.getPrice());
        }
    }
}
