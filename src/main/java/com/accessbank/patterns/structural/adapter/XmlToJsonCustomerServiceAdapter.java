package com.accessbank.patterns.structural.adapter;

import com.accessbank.patterns.structural.adapter.data_format.Json;
import com.accessbank.patterns.structural.adapter.data_format.Xml;

public class XmlToJsonCustomerServiceAdapter implements CustomerServiceAdapterInter {
    private final CustomerServiceInter customerSoapService;

    public XmlToJsonCustomerServiceAdapter(CustomerServiceInter customerSoapService) {
        this.customerSoapService = customerSoapService;
    }


    @Override
    public Json getPersonDataList() {
        Xml personDataList = customerSoapService.getPersonDataList();
        return new Json(personDataList.data);
    }
}
