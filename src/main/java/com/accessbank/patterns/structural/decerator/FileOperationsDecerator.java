package com.accessbank.patterns.structural.decerator;

public class FileOperationsDecerator implements DataSource{
    private  final FileDataSource fileDataSource;

    public FileOperationsDecerator(FileDataSource fileDataSource) {
        this.fileDataSource = fileDataSource;
    }

    @Override
    public void write(String data) {
        fileDataSource.write(data);
    }

    @Override
    public String read(String path) {
        return fileDataSource.read(path);
    }
}
