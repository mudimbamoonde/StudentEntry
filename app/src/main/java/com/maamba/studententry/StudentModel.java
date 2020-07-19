package com.maamba.studententry;

import android.text.Editable;

import androidx.annotation.NonNull;

public class StudentModel {
    int StudentID;
    String firstName;
    String lastName;
    String Grade;
    String StudentClass;
    String YearOfEntry;

    public StudentModel(int studentID, String firstName, String lastName, String grade, String studentClass, String yearOfEntry) {
        StudentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        Grade = grade;
        StudentClass = studentClass;
        YearOfEntry = yearOfEntry;
    }

    @Override
    public String toString() {
        return "StudentModel{" +
                "StudentID=" + StudentID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", Grade='" + Grade + '\'' +
                ", StudentClass='" + StudentClass + '\'' +
                ", YearOfEntry='" + YearOfEntry + '\'' +
                '}';
    }

    public int getStudentID() {
        return StudentID;
    }

    public void setStudentID(int studentID) {
        StudentID = studentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGrade() {
        return Grade;
    }

    public void setGrade(String grade) {
        Grade = grade;
    }

    public String getStudentClass() {
        return StudentClass;
    }

    public void setStudentClass(String studentClass) {
        StudentClass = studentClass;
    }

    public String getYearOfEntry() {
        return YearOfEntry;
    }

    public void setYearOfEntry(String yearOfEntry) {
        YearOfEntry = yearOfEntry;
    }
}