package com.contact.ContactApp.Model;

import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
    public static List<Student> ls = new ArrayList<Student>();
    public int add(Student student) {
        ls.add(student);
        return 1;
    }
    public List<Student> getStudentList() {
        return ls;
    }
}   
