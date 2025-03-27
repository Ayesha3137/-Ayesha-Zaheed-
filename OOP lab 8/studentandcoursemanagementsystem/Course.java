/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentandcoursemanagementsystem;

/**
 *
 * @author Ayesha Zaheed
 */
public class Course {
    private String courseCode;
    private String CourseName;

    public Course(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.CourseName = courseName;
    }
     public String getCourseName() { // ADD THIS METHOD
        return CourseName;
     }
    public void displayCourse() {
        System.out.println("Course Code: " + courseCode);
        System.out.println("Course Name: " + CourseName);
    }
}
