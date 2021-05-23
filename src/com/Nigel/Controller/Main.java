package com.Nigel.Controller;

import com.Nigel.Model.*;
import com.Nigel.View.PageFactory;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
//        Parent root = FXMLLoader.load(getClass().getResource("/com/Nigel/View/loginPage.fxml"));
//
//        Scene scene= new Scene(root,800,800);
//        primaryStage.setScene(scene);
//        primaryStage.show();
        UserAccount newUser= new AdminAccount("nigel","pass");
        //UserDatabaseMap.addUserToMap(newUser);
        System.out.println(newUser.getID());
        PageFactory pageFactory= new PageFactory();
        pageFactory.mainLogWindow();



//        primaryStage.setTitle("Hello World");
//        primaryStage.setScene(new Scene(root, 300, 275));
//        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
