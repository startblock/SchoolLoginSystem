package com.Nigel.Model;

import java.util.HashMap;

public class UserDatabaseMap {
    protected static HashMap<Integer,UserAccount> userDatabaseMap = new HashMap<>();

    protected static void addUserToMap(UserAccount newUser){
        userDatabaseMap.put(newUser.getID(),newUser);

    }
    public static boolean isIDPresent(int ID){
        if(userDatabaseMap.containsKey(ID)){
            return true;
        }
        else {return false;}
    }

    public static UserAccount getUserFromMap(int ID){
        return userDatabaseMap.get(ID);


    }

}
