package com.Nigel.Controller;

import com.Nigel.Model.*;
import com.Nigel.View.PageFactory;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class AdminDashboardPage extends BaseController implements Initializable {

    AdminAccount account;

    @FXML
    private Button logOut;

    @FXML
    private Label Bulletin;

    @FXML
    private Button MakeNewAccount;

    @FXML
    private Button SetNewBulletin;

    @FXML
    private Button RemoveAccount;

    @FXML
    private Button EditAccount;

    @FXML
    private TextField nameString;

    @FXML
    private ChoiceBox<AccountType> accountType;

    @FXML
    private TextField bulletinString;

    @FXML
    private Label nameField;

    @FXML
    private Label passField;

    @FXML
    private PasswordField newAccPass;

    public AdminDashboardPage(PageFactory pageFactory, String fxmlString, UserAccount user) {
        super(pageFactory, fxmlString, user);
        account=(AdminAccount) user;
    }

    @FXML
    void MakeNewAccount() {


    }

    @FXML
    void SetNewBulletin(){
        this.setBulletin(bulletinString.getText());
        System.out.println(this.getBulletin());


    }

    @FXML
    void createOnClick() {
        int newIdNo=0;
        switch (accountType.getValue()){
            case ADMIN:
                UserAccount newAdAcc= new AdminAccount(nameString.getText(),newAccPass.getText());
                newIdNo=newAdAcc.getID();
                break;

            case STUDENT:
                UserAccount newStudentAcc= new StudentAccount(nameString.getText(),newAccPass.getText());
                newIdNo=newStudentAcc.getID();
                break;
            case TEACHER:
                UserAccount newTeacherAcc= new TeacherAccount(nameString.getText(),newAccPass.getText());
                newIdNo=newTeacherAcc.getID();
                break;
        }

        System.out.println(newIdNo);




    }

    @FXML
    void logOut() {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        accountType.getItems().add(AccountType.ADMIN);
        accountType.getItems().add(AccountType.TEACHER);
        accountType.getItems().add(AccountType.STUDENT);

        Bulletin.setText(this.getBulletin());


    }

}
