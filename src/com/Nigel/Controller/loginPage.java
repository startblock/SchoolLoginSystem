package com.Nigel.Controller;

import com.Nigel.Model.Password;
import com.Nigel.Model.StudentAccount;
import com.Nigel.Model.UserAccount;
import com.Nigel.Model.UserDatabaseMap;
import com.Nigel.View.PageFactory;
import javafx.fxml.*;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class loginPage extends BaseController {

    private UserAccount userAccount;

    @FXML
    private TextField loginDetails;

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
        int IDloginStringToInt = Integer.parseInt(this.loginDetails.getText());

        if(UserDatabaseMap.isIDPresent(IDloginStringToInt)){

            this.userAccount=UserDatabaseMap.getUserFromMap(IDloginStringToInt);

            if(userAccount.getPassword().equals(Password.encryptPassword(passwordField.getText()))){

            switch (userAccount.getAccountType()){

                case ADMIN:
                    pageFactory.AdminDashboardWindow(userAccount);
                    Stage stage= (Stage) loginDetails.getScene().getWindow();
                    pageFactory.StageCloser(stage);
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