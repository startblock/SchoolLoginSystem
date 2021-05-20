package com.Nigel.Controller;



import com.Nigel.View.PageFactory;
import com.Nigel.Model.UserAccount;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class AdminDashboardPage extends BaseController {

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
    }

    @FXML
    void logOut() {

    }
}
