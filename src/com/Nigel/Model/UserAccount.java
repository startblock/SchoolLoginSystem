package com.Nigel.Model;

public abstract class UserAccount {
    protected int ID;
    protected String name;
    protected Password password;

    public UserAccount(int ID, String name,Password password) {
        this.ID = ID;
        this.name = name;
        this.password=password;
    }
}
