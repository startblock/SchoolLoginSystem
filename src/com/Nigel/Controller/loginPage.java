package com.Nigel.Controller;

import com.Nigel.View.PageFactory;
import javafx.fxml.*;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;

public class loginPage extends BaseController {

    @FXML
    private TextField ID;

    @FXML
    private PasswordField passwordField;

    public loginPage(PageFactory pageFactory, String fxmlString) {
        super(pageFactory, fxmlString);
    }

    @FXML
    void ForgotRequest() {

    }

    @FXML
    void LoginRequest() {
        System.out.println("logged in!");
        if(ID.getText().equals("hello")){
            System.out.println("This does something!!!!!!!!!!!");

        }
        System.out.println(ID.getText());

        pageFactory.DashboardWindow();
        Stage stage= (Stage) ID.getScene().getWindow();
        pageFactory.StageCloser(stage);



    }


}