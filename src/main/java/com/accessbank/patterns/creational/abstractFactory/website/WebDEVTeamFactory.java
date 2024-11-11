package com.accessbank.patterns.creational.abstractFactory.website;

import com.accessbank.patterns.creational.abstractFactory.DevTeamFactory;
import com.accessbank.patterns.creational.abstractFactory.Developer;
import com.accessbank.patterns.creational.abstractFactory.ProductOwner;
import com.accessbank.patterns.creational.abstractFactory.Tester;

public class WebDEVTeamFactory implements DevTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new CsharpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProductOwner getProductOwner() {
        return new WebPO();
    }
}
