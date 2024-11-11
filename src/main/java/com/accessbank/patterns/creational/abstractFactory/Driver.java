package com.accessbank.patterns.creational.abstractFactory;

import com.accessbank.patterns.creational.abstractFactory.website.WebDEVTeamFactory;

public class Driver {

    public static void main(String[] args) {


        DevTeamFactory teamFactory = new WebDEVTeamFactory();
        Tester tester = teamFactory.getTester();
        Developer developer = teamFactory.getDeveloper();
        tester.testingCode();
        developer.writeCode();
        teamFactory.getProductOwner();

    }
}
