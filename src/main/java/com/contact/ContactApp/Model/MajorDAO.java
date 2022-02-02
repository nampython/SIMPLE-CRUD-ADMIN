package com.contact.ContactApp.Model;

import java.util.ArrayList;
import java.util.List;

public class MajorDAO {
    public static List<Major> ls = new ArrayList<Major>();
    public List<Major> getAllMajors() {
        ls.add(new Major(1, "WEB"));
        ls.add(new Major(2, "CNTT"));
        ls.add(new Major(3, "Mobile"));
        return ls;

    }
}
