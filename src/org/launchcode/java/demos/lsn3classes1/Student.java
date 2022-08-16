package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

import org.launchcode.java.demos.lsn4classes2.Teacher;

import java.util.ArrayList;

public class Student {
    //add all of the necessary getters and setters. Think about the access level each field and method
    // should have,
    // and try reducing the access level of at least one setter to less than public.

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;


    public String getName(){
        return name;
    }

    public void setName(String aName) {
        name = aName;
    }

    public int getStudentId(){
        return studentId;
    }

    public void setStudentId(int aStudentId) {
        studentId = aStudentId;
    }

    public int getNumberOfCredits(){
        return numberOfCredits;
    }

    public void setNumberOfCredits(int aNumberOfCredits) {
        numberOfCredits = aNumberOfCredits;
    }

    private double getGpa(){
        return gpa;
    }

    private void setGpa(double aGpa) {
        gpa = aGpa;
    }

    public class Course {
        private String topic;
        private Teacher instructor;
        private ArrayList<Student> enrolledStudents;
    }


}