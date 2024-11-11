package com.accessbank.patterns.creational.abstractFactory.banking;

import com.accessbank.patterns.creational.abstractFactory.DevTeamFactory;
import com.accessbank.patterns.creational.abstractFactory.Developer;
import com.accessbank.patterns.creational.abstractFactory.ProductOwner;
import com.accessbank.patterns.creational.abstractFactory.Tester;

public class BankDEVTeamFactory implements DevTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProductOwner getProductOwner() {
        return new BankPO();
    }
}
