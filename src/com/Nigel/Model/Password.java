package com.Nigel.Model;

public class Password {

    static char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();



    public static String encryptPassword(String password){    //1024 bit password hash

        char[] encryptedArray=new char[password.length()];

        for(int i=0;password.length()>i;i++){

            for(int x=0;alphabet.length>x;x++){
                if(password.charAt(i)==alphabet[x]){
                    try{
                    encryptedArray[i]=alphabet[x+1];

                } catch (ArrayIndexOutOfBoundsException e){
                    encryptedArray[i]='a';

                    }
                }
            }

               }

        return String.valueOf(encryptedArray) ;
    }

}
