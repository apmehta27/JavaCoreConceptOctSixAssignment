package com.company;

public class Student {
    private int studentId;
    private String firstName;
    private String lasName;
    private String studentEmail;
    private String studentPhone;

    public Student(int studentId, String firstName, String lasName, String studentEmail, String studentPhone) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lasName = lasName;
        this.studentEmail = studentEmail;
        this.studentPhone = studentPhone;
    }

//    public Student(String micheal, String gabriel, String lasName, String studentEmail) {
//    }

    public int getStudentId() {
        return this.studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLasName() {
        return lasName;
    }

    public void setLasName(String lasName) {
        this.lasName = lasName;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public String getStudentPhone() {
        return studentPhone;
    }

    public void setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone;
    }

    @Override
    public String toString() {
        return
                "studentId=" + studentId +
                ", firstName='" + firstName + '\'' +
                ", lasName='" + lasName + '\'' +
                ", studentEmail='" + studentEmail + '\'' +
                ", studentPhone='" + studentPhone + '\'' ;
    }
}
