package com.accessbank.patterns.creational.abstractFactory.website;

import com.accessbank.patterns.creational.abstractFactory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testingCode() {
        System.out.println("Manual Tester");
    }
}
