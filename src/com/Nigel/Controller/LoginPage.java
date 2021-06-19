package com.Nigel.Controller;

import com.Nigel.Model.*;
import com.Nigel.View.PageFactory;
import javafx.fxml.*;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginPage extends BaseController implements Initializable {

    private UserAccount userAccount;

    @FXML
    private TextField loginDetails;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Label Bulletin;

    public LoginPage(PageFactory pageFactory, String fxmlString) {
        super(pageFactory, fxmlString);
    }

    @FXML
    void ForgotRequest() {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) { //initializes gui

        Bulletin.setText(getBulletin());
        System.out.println(getBulletin());

    }

    @FXML
    void LoginRequest() {


//        int IDloginStringToInt = Integer.parseInt(this.loginDetails.getText());
//
//        if(UserDatabaseMap.isIDPresent(IDloginStringToInt)){
//
//            this.userAccount=UserDatabaseMap.getUserFromMap(IDloginStringToInt);
//
//            if(userAccount.getPassword().equals(Password.encryptPassword(passwordField.getText()))){
//            pageFactory.secondLog(userAccount);}
//        }


        int IDloginStringToInt = Integer.parseInt(this.loginDetails.getText());
        System.out.println(IDloginStringToInt);

        if(UserDatabaseMap.isIDPresent(IDloginStringToInt)){


            this.userAccount=UserDatabaseMap.getUserFromMap(IDloginStringToInt);
            System.out.println(userAccount.getPassword());
            System.out.println(passwordField.getText());



            if(userAccount.getPassword().equals((passwordField.getText()))){
                System.out.println(userAccount.getName());

            switch (userAccount.getAccountType()){

                case ADMIN:
                    pageFactory.AdminDashboardWindow(userAccount);
                    Stage stage= (Stage) loginDetails.getScene().getWindow();
                    pageFactory.StageCloser(stage);
                    System.out.println("debuggggggggggggggg stage 1");
                    break;

                case STUDENT:
                    pageFactory.StudentDashboardWindow(userAccount);
                    Stage studentStage= (Stage) loginDetails.getScene().getWindow();
                    pageFactory.StageCloser(studentStage);
                    break;

                case TEACHER:

                    pageFactory.TeacherDashboardWindow(userAccount);
                    Stage stageTeacher= (Stage) loginDetails.getScene().getWindow();
                    pageFactory.StageCloser(stageTeacher);
                    break;

            }

            }


        }

    }

}