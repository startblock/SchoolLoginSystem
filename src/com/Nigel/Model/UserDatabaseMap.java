package com.Nigel.Model;

import java.util.HashMap;

public class UserDatabaseMap {
    static HashMap<Integer,UserAccount> userDatabaseMap = new HashMap<>();

    public void addUserToMap(UserAccount newUser){
        userDatabaseMap.put(newUser.getID(),newUser);

    }
    public static boolean isIDPresent(int ID){
        if(userDatabaseMap.containsKey(ID)){
            return true;
        }
        else {return false;}
    }

}
