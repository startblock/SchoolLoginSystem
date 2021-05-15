package com.Nigel.Model;

public abstract class UserAccount {
    protected int ID;
    protected String name;
    protected String password;

    public UserAccount(int ID, String name,String password) {
        this.ID = ID;
        this.name = name;
        this.password=password;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }
}
