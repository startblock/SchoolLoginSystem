package com.Nigel.Controller;

import com.Nigel.Controller.BaseController;
import com.Nigel.View.PageFactory;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.web.WebView;

public class DashboardPage extends BaseController {

    @FXML
    private WebView page;

    @FXML
    private Label Name;

    @FXML
    private Label ID;

    public DashboardPage(PageFactory pageFactory, String fxmlString) {
        super(pageFactory, fxmlString);
    }
}
