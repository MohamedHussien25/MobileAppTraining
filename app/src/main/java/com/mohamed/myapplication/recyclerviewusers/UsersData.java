package com.mohamed.myapplication.recyclerviewusers;

public class UsersData {
    String fname;
    String lname;
    String email;
    String pass;

    public UsersData(String fname, String lname, String email, String pass) {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.pass = pass;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getEmail() {
        return email;
    }

    public String getPass() {
        return pass;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

}
