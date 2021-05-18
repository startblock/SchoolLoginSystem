package com.Nigel.Model;

public class AdminAccount extends UserAccount {

    public AdminAccount( String name, String password)
    {
        super( name,password,AccountType.ADMIN);
    }

    public UserAccount createNewUser(UserAccount account){
        //tbc
        return account;
    }
    public void deleteUserAccount(UserAccount account){
        //account to be deleted
    }
    public void setBulletin(String bulletin){
        //bulletin
    }

}
