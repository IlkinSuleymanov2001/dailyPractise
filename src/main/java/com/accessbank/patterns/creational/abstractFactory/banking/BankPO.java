package com.accessbank.patterns.creational.abstractFactory.banking;

import com.accessbank.patterns.creational.abstractFactory.ProductOwner;

public class BankPO implements ProductOwner {

    static {
        System.out.println("BankPO static block");
    }
}
