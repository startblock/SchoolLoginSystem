package com.Nigel.Controller;

import com.Nigel.View.PageFactory;
import com.Nigel.Model.UserAccount;

public abstract class BaseController {

    protected PageFactory pageFactory;
    protected String fxmlString;
    protected UserAccount user;
    protected String bulletin="default";

    public BaseController(PageFactory pageFactory, String fxmlString,UserAccount user) {
        this.pageFactory = pageFactory;
        this.fxmlString = fxmlString;
        this.user=user;
    }

    public String getBulletin() {
        return bulletin;
    }

    public void setBulletin(String bulletin) {
        this.bulletin = bulletin;
    }

    public BaseController(PageFactory pageFactory, String fxmlString) {
        this.pageFactory = pageFactory;
        this.fxmlString = fxmlString;

    }
    public String getFxmlString(){
        return fxmlString;
    }
}
