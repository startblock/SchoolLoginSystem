package com.Nigel.Model;

import java.util.Calendar;

import java.util.GregorianCalendar;

public class Homework {

    private String subject;
    private Calendar due;
    private String desc;

    public Homework(String subject,int yearDue,int monthDue, int dayDue){
        this.subject=subject;
        this.due=new GregorianCalendar(yearDue,monthDue,dayDue);


    }

    public Homework(String subject,String desc,int yearDue,int monthDue, int dayDue){
        this.subject=subject;
        this.due=new GregorianCalendar(yearDue,monthDue,dayDue);
        this.desc=desc;


    }

    public void setDesc(String desc) {
        desc = desc;
    }

    public String getSubject() {
        return subject;
    }

    public Calendar getDue() {
        return due;
    }

    public String getDesc() {
        return desc;
    }

}
