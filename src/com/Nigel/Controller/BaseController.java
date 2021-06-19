package com.Nigel.Controller;

import com.Nigel.Model.Bulletin;
import com.Nigel.View.PageFactory;
import com.Nigel.Model.UserAccount;
import javafx.stage.Stage;

public abstract class BaseController {

    protected PageFactory pageFactory;
    protected String fxmlString;
    protected UserAccount user;
    protected String bulletin;

    public BaseController(PageFactory pageFactory, String fxmlString,UserAccount user) {
        this.pageFactory = pageFactory;
        this.fxmlString = fxmlString;
        this.user=user;
        setBulletin(getBulletin());
    }

    public String getBulletin() {
        return Bulletin.getBulletin();
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
