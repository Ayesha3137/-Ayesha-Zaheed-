/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.courseandstudentmanagementsystem;

/**
 *
 * @author Ayesha Zaheed
 */
import java.util.ArrayList;
import java.util.List;
public class Course {
 private String title;
    private String code;
    private List<Student> enrolledStudents;

    public Course(String title, String code) {
        this.title = title;
        this.code = code;
        this.enrolledStudents = new ArrayList<>();
    }

    public void enrollStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
            System.out.println(student.getName() + " has been enrolled in " + title);
        } else {
            System.out.println(student.getName() + " is already enrolled in this course");
        }
         }

    public void removeStudent(Student student) {
        if (enrolledStudents.remove(student)) {
            System.out.println(student.getName() + " has been removed from " + title);
        } else {
            System.out.println(student.getName() + " was not found in this course");
        }
    }

    public void displayEnrolledStudents() {
        System.out.println("\nStudents enrolled in " + title + ":");
        if (enrolledStudents.isEmpty()) {
            System.out.println("No students currently enrolled");
        } else {
            for (Student student : enrolledStudents) {
                student.displayInfo();
            }
        }
    }

    public void displayCourseInfo() {
        System.out.println("\nCourse Information:");
        System.out.println("Title: " + title);
        System.out.println("Code: " + code);
        System.out.println("Number of enrolled students: " + enrolledStudents.size());
        System.out.println("---------------------");
    }
    public String getTitle() { return title; }
    public String getCode() { return code; }
        }