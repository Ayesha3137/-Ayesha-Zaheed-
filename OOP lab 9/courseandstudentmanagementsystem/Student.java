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
public class Student {
    private String name;
    private String studentId;
    private String email;
    private List<String> submittedAssignments;

    public Student(String name, String studentId, String email) {
        this.name = name;
        this.studentId = studentId;
        this.email = email;
        this.submittedAssignments = new ArrayList<>();
    }
    public void submitAssignment(String assignmentName) {
        submittedAssignments.add(assignmentName);
        System.out.println(name + " has submitted assignment: " + assignmentName);
    }

    public void displayInfo() {
        System.out.println("\nStudent Information:");
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + studentId);
        System.out.println("Email: " + email);
        System.out.println("Assignments submitted: " + submittedAssignments.size());
        if (!submittedAssignments.isEmpty()) {
            System.out.println("Assignment List:");
            for (String assignment : submittedAssignments) {
                System.out.println("- " + assignment);
            }
}
    }

    public String getName() { return name; }
    public String getStudentId() { return studentId; }
    public String getEmail() { return email; }
}