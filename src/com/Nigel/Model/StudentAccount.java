package com.Nigel.Model;

public class StudentAccount extends UserAccount{
    private boolean hasHomework;
    private Homework homework;
    private double attendance;



    public StudentAccount( String name,String password) {
        super(name, password);
        hasHomework=false;
    }

    protected void setHomework(Homework homework) {
        this.homework = homework;
        this.hasHomework=true;
    }

    public boolean isHasHomework() {
        return hasHomework;
    }

    protected void setAttendance(double attendance) {
        this.attendance = attendance;
    }

    public Homework getHomework() {

        return homework;
    }

    public double getAttendance() {
        return attendance;
    }
}
