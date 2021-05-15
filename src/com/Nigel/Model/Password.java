package com.Nigel.Model;

public class Password {

    static char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();



    public static void main(String[] args) {

        System.out.println(encryptPassword("nigelburkezzzzzzzz"));


    }

    public static String encryptPassword(String password){

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

        for (char value : encryptedArray) {
            System.out.println(value);
        }

        return String.valueOf(encryptedArray) ;
    }

}
