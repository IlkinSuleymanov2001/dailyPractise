package com.accessbank.patterns.structural.adapter;

import com.accessbank.patterns.structural.adapter.viziualizer.modern.JsonViziualizer;

public class Test {

    public static void main(String[] args) {

        JsonViziualizer jsonViziualizer = new JsonViziualizer();
        CustomerServiceInter customerSoapService  = new CustomerSoapService();
        CustomerServiceAdapterInter  customerServiceAdapter =
                new XmlToJsonCustomerServiceAdapter(customerSoapService);

        jsonViziualizer.vizualize(customerServiceAdapter.getPersonDataList());


    }
}
