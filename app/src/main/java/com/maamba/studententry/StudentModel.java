package com.maamba.studententry;

import androidx.annotation.NonNull;

public class StudentModel {
    String firstName;
    String lastName;
    String Grade;
    String StudentClass;
    String YearOfEntry;

    public StudentModel(String firstName, String lastName, String grade, String studentClass, String yearOfEntry) {
        this.firstName = firstName;
        this.lastName = lastName;
        Grade = grade;
        StudentClass = studentClass;
        YearOfEntry = yearOfEntry;
    }

    @Override
    public String toString() {
        return "StudentModel{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", Grade='" + Grade + '\'' +
                ", StudentClass='" + StudentClass + '\'' +
                ", YearOfEntry='" + YearOfEntry + '\'' +
                '}';
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