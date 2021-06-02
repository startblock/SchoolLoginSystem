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

        UserAccount newUser= new AdminAccount("nigel","pass");

        System.out.println(newUser.getID());
        PageFactory pageFactory= new PageFactory();
        pageFactory.mainLogWindow();


    }


    public static void main(String[] args) {
        launch(args);
    }
}
