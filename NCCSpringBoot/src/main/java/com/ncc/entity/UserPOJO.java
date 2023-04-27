package com.ncc.entity;

public class UserPOJO {
    public int id;
    public String userName;
    private String password;

    public UserPOJO(int id, String userName, String password) {
        this.id = id;
        this.userName = userName;
        this.password = password;
    }

    public int id() {
        return this.id;
    }

    public String getUserName() {
        return this.userName;
    }
}
