



package com.Nigel.Model;



import java.util.concurrent.ThreadLocalRandom;

public abstract class UserAccount {
    protected int ID;
    protected String name;
    private String password;
    protected AccountType accountType;



    public UserAccount(String name, String password,AccountType accountType) {

        ID =makeUniqueNumber();
        this.accountType=accountType;

        this.name = name;
        this.password=Password.encryptPassword(password);
        UserDatabaseMap.addUserToMap(this);
        
    }

    public AccountType getAccountType() {
        return accountType;
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
        this.password = Password.encryptPassword(password);
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return Password.decryptPassword(password);
    }
}
