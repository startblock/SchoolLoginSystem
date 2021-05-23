package com.Nigel.Controller;



import com.Nigel.Model.AdminAccount;
import com.Nigel.Model.TeacherAccount;
import com.Nigel.Model.UserDatabaseMap;
import com.Nigel.View.PageFactory;
import com.Nigel.Model.UserAccount;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class AdminDashboardPage extends BaseController {
    private AdminAccount adminAccount;

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
    private Button logOut;

    public AdminDashboardPage(PageFactory pageFactory, String fxmlString,UserAccount user) {
        super(pageFactory, fxmlString,user);
        adminAccount=(AdminAccount) user;
    }

    @FXML
    void logOut(){
        System.out.println("heyyyy");
    }




    @FXML
    void MakeNewAccount(){
        System.out.println("tfutuutfutyf");

        adminAccount.createNewUser(new TeacherAccount("lisa","pass"));


        
    }
}
