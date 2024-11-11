package com.accessbank.patterns.creational.factory;

public class MysqlDB implements ORMDatabase{
    @Override
    public void connectToDB() {
        System.out.println("connect to mysql database");
    }

    public String customMysqlMethod(){
        return "mysql";
    }
}
