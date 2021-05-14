package com.Nigel.Controller;

import com.Nigel.View.PageFactory;
import javafx.fxml.*;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;

public class loginPage extends BaseController {

    @FXML
    private TextField emailAddressFied;

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

        pageFactory.DashboardWindow();
        Stage stage= (Stage) emailAddressFied.getScene().getWindow();
        pageFactory.StageCloser(stage);



    }


}