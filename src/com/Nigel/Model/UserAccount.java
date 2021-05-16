package com.Nigel.Model;

import java.util.concurrent.ThreadLocalRandom;

public abstract class UserAccount {
    protected int ID;
    protected String name;
    protected String password;


    public UserAccount( String name,String password) {
        ID =makeUniqueNumber();



        this.name = name;
        this.password=password;
    }
    public static int makeUniqueNumber(){

        int uniqueNum = ThreadLocalRandom.current().nextInt(100000, 999998 + 1);

        if(UserDatabaseMap.isIDPresent(uniqueNum)){
            makeUniqueNumber();
        }
        return uniqueNum;

    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
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
