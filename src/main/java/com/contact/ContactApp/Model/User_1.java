package com.contact.ContactApp.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "USERS")
public class User_1 {
    @Id
    private String username;
    private String password;
    private String fullName;
    private Integer age;
    private boolean gender;
    public User_1() {}
    public User_1(String username, String password, String fullName, int age, boolean gender){
        this.username = username;
        this.password = password;
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return this.gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

}
