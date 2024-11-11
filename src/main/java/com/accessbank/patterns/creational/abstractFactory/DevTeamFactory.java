package com.accessbank.patterns.creational.abstractFactory;

public interface DevTeamFactory {

    Developer getDeveloper();

    Tester getTester();

    ProductOwner getProductOwner();
}
