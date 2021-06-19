package com.Nigel.Controller;

import com.Nigel.Model.UserAccount;
import com.Nigel.View.PageFactory;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class NewAccountPage extends BaseController {

    @FXML
    private TextField nameString;

    @FXML
    private ChoiceBox<?> accountType;

    @FXML
    private Label nameField;

    @FXML
    private Label passField;

    public NewAccountPage(PageFactory pageFactory, String fxmlString, UserAccount user) {
        super(pageFactory, fxmlString, user);
    }

    @FXML
    void createOnClick() {

    }

}