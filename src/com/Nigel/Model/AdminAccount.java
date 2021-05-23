package com.Nigel.Model;

public class AdminAccount extends UserAccount {

    public AdminAccount( String name, String password)
    {
        super( name,password,AccountType.ADMIN);
    }

    public void createNewUser(UserAccount account){

        UserDatabaseMap.addUserToMap(account);
        System.out.println(account.getAccountType());
    }
    public void deleteUserAccount(UserAccount account){
        //account to be deleted
    }
    public void setBulletin(String bulletin){
        //bulletin
    }

}
