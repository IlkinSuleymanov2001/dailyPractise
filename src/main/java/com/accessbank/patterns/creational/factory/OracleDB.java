package com.accessbank.patterns.creational.factory;

public class OracleDB implements ORMDatabase {
    @Override
    public void connectToDB() {
        System.out.println("connect to oracle  database");
    }


    public String customOracleMethod() {
        return "oracle";
    }
}
