package com.springheaven.functional.day_01;

import java.util.List;

public class Student {

    private String name;
    private List<String> phoneNo;

    public String getName() {
        return name;
    }

    public List<String> getPhoneNo() {
        return phoneNo;
    }

    public Student(String name, List<String> phoneNo) {
        this.name = name;
        this.phoneNo = phoneNo;
    }
}
