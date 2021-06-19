package com.Nigel.Model;

public class Password {

    static char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();


//  encrypts password for storage

    protected static String encryptPassword(String password){    //1024 bit password hash

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

    // decrypts password from storage

    public static String decryptPassword(String pass){
        char[] encryptedArray=new char[pass.length()];

        for(int i=0;pass.length()>i;i++){

            for (int x=0;alphabet.length>x;x++) {
                if (pass.charAt(i) == alphabet[x]) {
                    try {
                        encryptedArray[i] = alphabet[x-1];

                    } catch (ArrayIndexOutOfBoundsException e) {
                        encryptedArray[i] = 'z';

                    }
                }
            }


        }

        return String.valueOf(encryptedArray);
    }
}
