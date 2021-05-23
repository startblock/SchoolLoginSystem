package com.Nigel.Controller;

import com.Nigel.Controller.BaseController;
import com.Nigel.Model.StudentAccount;
import com.Nigel.Model.TeacherAccount;
import com.Nigel.View.PageFactory;
import com.Nigel.Model.UserAccount;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.web.WebView;

import java.net.URL;
import java.util.ResourceBundle;

public class StudentDashboardPage extends BaseController implements Initializable {

    StudentAccount studentAccount;

    @FXML
    private WebView page;

    @FXML
    private Label Name;

    @FXML
    private Label ID;

    private static Label lab;

    public StudentDashboardPage(PageFactory pageFactory, String fxmlString, UserAccount account) {

        super(pageFactory, fxmlString,account);
        studentAccount=(StudentAccount) account;


    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Name.setText("welcome "+studentAccount.getName());

    }
}
