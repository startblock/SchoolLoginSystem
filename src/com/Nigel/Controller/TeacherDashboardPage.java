package com.Nigel.Controller;
import com.Nigel.Model.TeacherAccount;
import com.Nigel.Model.UserAccount;

import com.Nigel.View.PageFactory;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class TeacherDashboardPage extends BaseController{

    UserAccount user;

    @FXML
    private Label Bulletin;

    @FXML
    private Button logOut;

    @FXML
    private TextField hmkSubject;

    @FXML
    private TextField hmkDesc;

    @FXML
    private DatePicker dueDate;

    @FXML
    private ChoiceBox<?> studentSelector;

    public TeacherDashboardPage(PageFactory pageFactory, String fxmlString, UserAccount user) {
        super(pageFactory, fxmlString,user);


    }



}

