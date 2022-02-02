package com.contact.ContactApp.Model;

public class Student {
    private int id;
    private String name;
    private float mark;
    private Major major;
    public Student(){}
    public Student(int id, String name, float mark, Major major){
        this.id = id;
        this.name = name;
        this.mark = mark;
        this.major = major;
    }
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMark() {
        return this.mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    public Major getMajor() {
        return this.major;
    }

    public void setMajor(Major major) {
        this.major = major;
    }

}
