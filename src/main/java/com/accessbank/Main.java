package com.accessbank;

import com.accessbank.patterns.creational.builder.Customer;
import com.accessbank.patterns.creational.factory.DB;
import com.accessbank.patterns.creational.factory.DbInstanceFactory;
import com.accessbank.patterns.creational.factory.OracleDB;
import com.accessbank.patterns.creational.prototype.Departament;
import com.accessbank.patterns.creational.prototype.DepartamentFactory;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Customer.builder().setAge(10).setBirthDate(LocalDate.now()).build();

        Departament departament = new Departament("salam","lalala",1111);
        DepartamentFactory departamentFactory = new DepartamentFactory(departament);
        Departament departamentCopy= departamentFactory.copyDepartament();

      /*  String input =
                "<teacher>" + "9" +
                        vmdelimetir + "ilkin" +
                        vmdelimetir + "suleymanov" + fmdelimetir
                        + "id"
                        + vmdelimetir + "name"
                        + vmdelimetir + "surname" +

                        "<pay>" +
                        "99999999"
                        + vmdelimetir + "debitcart" + fmdelimetir +
                        "PayCode" +
                        vmdelimetir + "PayName"
                        + "</pay>" +

                        "<workHours>"
                        + "9" +
                        vmdelimetir + "99" +
                        vmdelimetir + "99" +
                        "</workHours>" +

                        "<students>" +
                        "9" +
                        vmdelimetir + "99" + fmdelimetir +
                        "name" +
                        vmdelimetir + "surname" + zmdelimetir
                        + "8" +
                        vmdelimetir + "88" + fmdelimetir +
                        "name" + vmdelimetir +
                        "surname" +

                        "<taskStatus>status" + vmdelimetir + "status2</taskStatus>" +

                        "</students>" +

                        "</teacher>" +
                        "<course>salam" + vmdelimetir + "salam2" + fmdelimetir +

                        "<workHours>" + "9" + vmdelimetir + "99" + vmdelimetir + "99</workHours>"

                        +
                        "<pay>" + "999999998" +
                        vmdelimetir + "debitcart2" + fmdelimetir +
                        "PayCode" +
                        vmdelimetir + "PayName" +
                        "</pay>"

                        +"name" + fmdelimetir + "address" + "</course>"+
                        "<property>salam" +fmdelimetir+"test</property>";*/


        OracleDB mysqlDB = (OracleDB)DbInstanceFactory.createDBInstance(DB.MSQL);
        System.out.println(mysqlDB.customOracleMethod());
        mysqlDB.connectToDB();
      /*  if (mysqlDB instanceof MysqlDB db){
            System.out.println(db.customMysqlMethod());

        }*/
        System.out.println("connect is success");


    }
}