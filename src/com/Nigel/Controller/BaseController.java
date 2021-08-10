package com.Nigel.Controller;

import com.Nigel.Model.Bulletin;
import com.Nigel.Model.ErrorManager;
import com.Nigel.View.PageFactory;
import com.Nigel.Model.UserAccount;
import javafx.stage.Stage;

public abstract class BaseController {

    protected PageFactory pageFactory;
    protected String fxmlString;
    protected UserAccount user;
    protected String bulletin;
    protected String errorMessage;
    ErrorManager er;

    public BaseController(PageFactory pageFactory, String fxmlString,UserAccount user) {
        this.pageFactory = pageFactory;
        this.fxmlString = fxmlString;
        this.user=user;
        er=new ErrorManager();
        setBulletin(getBulletin());
    }

    public String getBulletin() {
        return Bulletin.getBulletin();
    }

    public String getErrorMessage() {
        return errorMessage;                          ///  try to get this to work with errorManager class
    }

    public void setErrorMessage(String errorMessage) {

        er.setError(errorMessage);
    }

    public void logOutFunction(Stage stage){
        pageFactory.mainLogWindow();
        pageFactory.StageCloser(stage);
    }

    public void setBulletin(String bulletin) {
        Bulletin.setBulletin(bulletin);
    }

    public BaseController(PageFactory pageFactory, String fxmlString) {
        this.pageFactory = pageFactory;
        this.fxmlString = fxmlString;
        setBulletin(getBulletin());

    }
    public String getFxmlString(){
        return fxmlString;
    }
}
