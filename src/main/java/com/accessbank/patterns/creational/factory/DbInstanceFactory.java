package com.accessbank.patterns.creational.factory;

public final class DbInstanceFactory {

    public static  ORMDatabase createDBInstance(DB databse){

       return  switch(databse){
            case MSQL ->   new MysqlDB();
            case ORACLE -> new OracleDB();
            case MONGODB -> throw new RuntimeException("not yet  supported database ");
            default -> throw new RuntimeException("not supported database or invalid database name ");
        };

    }


    private DbInstanceFactory(){}

}
