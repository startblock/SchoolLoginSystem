package com.Nigel.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TeacherDashboardPage {

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

}

