package com.accessbank.patterns.structural.decerator;

public class CompressionFileOperationsDecerator extends FileOperationsDecerator{


    public CompressionFileOperationsDecerator(FileDataSource fileDataSource) {
        super(fileDataSource);
    }

    @Override
    public void write(String data) {
        //addition work
        super.write(data);
    }

    @Override
    public String read(String path) {
        //addition work
        return super.read(path);
    }
}
