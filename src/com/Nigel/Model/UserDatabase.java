//package com.Nigel.Model;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class UserDatabase {
//
//    public void addUser(UserAccount user) {
//
//        try {
//            int ID=user.getID();
//            String pass=user.getPassword();
//            String name=user.getName();
//
//            Connection con = DriverManager.getConnection("jdbc:sqlite:D:\\databases\\UserDatabase.db");
//            Statement statement = con.createStatement();
//
//            statement.execute("INSERT INTO UserAccounts (ID, Password, Name)" + "VALUES " +
//                    "("+ID+", "+pass+", "+name+")");
//            statement.close();
//            con.close();
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//    public void getUser(UserAccount user){
//        try {
//            int ID=user.getID();
//
//            Connection con = DriverManager.getConnection("jdbc:sqlite:D:\\databases\\UserDatabase.db");
//            Statement statement = con.createStatement();
//
//            statement.execute("SELECT * FROM UserAccounts WHERE ID ="+ID);
//            statement.close();
//            con.close();
//
//        } catch (SQLException e){
//            e.printStackTrace();
//        }
//
//
//
//    }
//
//    public static void main(String[] args) {
//        UserDatabase ad=new UserDatabase();
//        //UserAccount first=new StudentAccount(23,"lisa","pass");
//        //ad.addUser(first);
//        //ad.getUser(lisa);
//    }
//
//}
