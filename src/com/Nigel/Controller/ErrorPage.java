package com.Nigel.Controller;

import com.Nigel.View.PageFactory;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class ErrorPage extends BaseController implements Initializable   {

    public ErrorPage(PageFactory pageFactory, String fxmlString) {
        super(pageFactory, fxmlString);
    }

    @FXML
    Label errorLabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) { //initializes gui
        System.out.println(getErrorMessage()+"   >    "+errorMessage);

        errorLabel.setText(getErrorMessage());


    }

}
