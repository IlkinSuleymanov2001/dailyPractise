package com.accessbank.models;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ResponseModel {
    private final Teacher teacher;
    private final Course course;
    private final  String test;

    public ResponseModel(Teacher teacher, Course course, String test) {
        this.teacher = teacher;
        this.course = course;
        this.test = test;
    }


    String toJson()
    {
        return new GsonBuilder().serializeNulls().create().toJson(this);
    }
}
