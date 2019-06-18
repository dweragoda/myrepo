package com.example.demo3.model;

public class Employee {

    private String id;
    private String name;
    private String school;

    public Employee(String id, String name, String school) {
        this.id = id;
        this.name = name;
        this.school = school;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
