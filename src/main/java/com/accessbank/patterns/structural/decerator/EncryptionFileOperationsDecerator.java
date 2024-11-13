package com.accessbank.patterns.structural.decerator;

public class EncryptionFileOperationsDecerator extends FileOperationsDecerator{

    public EncryptionFileOperationsDecerator(FileDataSource fileDataSource) {
        super(fileDataSource);
    }


    @Override
    public String read(String path) {
        //addition work
        return super.read(path);
    }

    @Override
    public void write(String data) {
        //addition work
        super.write(data);
    }
}
