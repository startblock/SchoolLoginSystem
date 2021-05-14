package com.Nigel.Controller;

import com.Nigel.View.PageFactory;

public abstract class BaseController {

    protected PageFactory pageFactory;
    protected String fxmlString;

    public BaseController(PageFactory pageFactory, String fxmlString) {
        this.pageFactory = pageFactory;
        this.fxmlString = fxmlString;
    }
    public String getFxmlString(){
        return fxmlString;
    }
}
