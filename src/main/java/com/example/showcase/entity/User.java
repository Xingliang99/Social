package com.example.showcase.entity;

public class User {

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        this.Username = username;
    }

    public String getPasswordHash() {
        return PasswordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.PasswordHash = passwordHash;
    }


    public String Username;
    public String PasswordHash;

    public int getUserid() {
        return Userid;
    }

    public void setUserid(int userid) {
        this.Userid = userid;
    }

    private int Userid;
}