package com.tout.tout.entities.subjects;

public class Subject {

    private final String name;
    private final String info;

    public Subject(String name, String info) {
        this.name = name;
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public String getSubjectInfo() {
        return info;
    }
}