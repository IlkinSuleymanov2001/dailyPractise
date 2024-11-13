package com.accessbank.patterns.structural.decerator;

public interface  DataSource {

    void write(String data);
    String read(String path);

}
