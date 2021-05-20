package com.Nigel.Controller;

import com.Nigel.View.PageFactory;
import com.Nigel.Model.UserAccount;

public abstract class BaseController {

    protected PageFactory pageFactory;
    protected String fxmlString;
    protected UserAccount user;

    public BaseController(PageFactory pageFactory, String fxmlString,UserAccount user) {
        this.pageFactory = pageFactory;
        this.fxmlString = fxmlString;
        this.user=user;
    }

    public BaseController(PageFactory pageFactory, String fxmlString) {
        this.pageFactory = pageFactory;
        this.fxmlString = fxmlString;

    }
    public String getFxmlString(){
        return fxmlString;
    }
}
