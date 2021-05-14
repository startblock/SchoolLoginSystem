package com.Nigel.Model;

public class TeacherAccount extends UserAccount{


    public TeacherAccount(int ID, String name,Password password) {
        super(ID, name,password);

    }
    public void setStudentHomework(StudentAccount student,Homework homework){
        student.setHomework(homework);
    }
    public void setStudentAttendance(StudentAccount student,double attendance){
        student.setAttendance(attendance);
    }

}
