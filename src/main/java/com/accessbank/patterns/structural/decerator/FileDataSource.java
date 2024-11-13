package com.accessbank.patterns.structural.decerator;
public class FileDataSource  implements DataSource{
     private final String fileName;

    public FileDataSource(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }


    @Override
    public void write(String data) {

    }

    @Override
    public String read(String path) {
        return "";
    }
}
