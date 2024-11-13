package com.accessbank.patterns.structural.adapter;

import com.accessbank.patterns.structural.adapter.data_format.Xml;

public class CustomerSoapService implements CustomerServiceInter {

    @Override
    public Xml getPersonDataList(){
        return  new Xml("salam adapter pattern");
    }
}
