/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentandcoursemanagementsystem;

/**
 *
 * @author Ayesha Zaheed
 */
import java.util.ArrayList;
public class Student {
    private int studentID;
    private String name;
    private ArrayList<Course> enrolledCourses;

    public Student(int studentID, String name) {
        this.studentID = studentID;
        this.name = name;
        this.enrolledCourses = new ArrayList<>();
    }

    public void enrollCourse(Course course) {
        enrolledCourses.add(course);
        System.out.println(name + " has enrolled in " + course.getCourseName());
    }
    public void displayStudent() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + name);
    }

    public void displayEnrolledCourses() {
        System.out.println(name + "'s Enrolled Courses:");
        if (enrolledCourses.isEmpty()) {
            System.out.println("No courses enrolled.");
        } else {
            for (Course c : enrolledCourses) {
                c.displayCourse();
                System.out.println("-------------------");
            }
        }
    }
}
