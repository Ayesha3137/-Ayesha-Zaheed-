/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.courseandstudentmanagementsystem;

/**
 *
 * @author Ayesha Zaheed
 */
public class CourseandStudentManagementSystem {

    public static void main(String[] args) {
        Student student1 = new Student("Ayesha Zaheed", "1011", "ayesha.z@university.edu");
        Student student2 = new Student("Mahnoor Zahid", "1012", "mahnoor.z@university.edu");
        Student student3 = new Student("Fatima Zaheed", "1013", "fatima.z@university.edu");

        Course math101 = new Course("Introduction to Mathematics", "MATH101");
        Course pf101 = new Course("Programming Fundamentals", "PF101");

        // Enroll students in courses
        math101.enrollStudent(student1);
        math101.enrollStudent(student2);
        math101.enrollStudent(student3);
        
        pf101.enrollStudent(student1);
        pf101.enrollStudent(student3);
        student1.submitAssignment("Math Homework 1");
        student2.submitAssignment("Math Homework 1");
        student3.submitAssignment("Math Homework 1");
        student1.submitAssignment("PF Lab 1");
        student3.submitAssignment("PF Lab 1");

        // Display course information
        math101.displayCourseInfo();
        math101.displayEnrolledStudents();

        pf101.displayCourseInfo();
        pf101.displayEnrolledStudents();

        // Remove a student from a course
        math101.removeStudent(student2);
        math101.displayEnrolledStudents();
    }
}
