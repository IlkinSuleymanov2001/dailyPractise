package com.accessbank.patterns.creational.abstractFactory.website;

import com.accessbank.patterns.creational.abstractFactory.ProductOwner;

public class WebPO implements ProductOwner {


    static {
        System.out.println("Web PO static");
    }
}
