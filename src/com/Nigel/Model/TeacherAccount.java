package com.Nigel.Model;

public class TeacherAccount extends UserAccount{


    public TeacherAccount( String name,String password) {
        super( name,password,AccountType.TEACHER);

    }
    public void setStudentHomework(StudentAccount student,Homework homework){
        student.setHomework(homework);
    }
    public void setStudentAttendance(StudentAccount student,double attendance){
        student.setAttendance(attendance);
    }


}
