/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.studentandcoursemanagementsystem;

/**
 *
 * @author Ayesha Zaheed
 */
public class StudentandCourseManagementSystem {

    public static void main(String[] args) {
        Course course1 = new Course("DLD111", "DIGITAL LOGIC DESIGN");
        Course course2 = new Course("OOP131", "OBJECT ORIENTED PROGRAMMING");
        Course course3 = new Course("ENG102", "FUNCTIONAL English");

        Student student1 = new Student(1, "AYESHA");
        Student student2 = new Student(2, "LAIBA");

        student1.enrollCourse(course1);
        student1.enrollCourse(course2);
        student2.enrollCourse(course2);
        student2.enrollCourse(course3);

        System.out.println("\n--- Student Details ---");
        student1.displayStudent();
        student1.displayEnrolledCourses();

        System.out.println("\n--- Student Details ---");
        student2.displayStudent();
        student2.displayEnrolledCourses();
    }
}
