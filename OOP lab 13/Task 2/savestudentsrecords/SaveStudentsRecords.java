/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.savestudentsrecords;

/**
 *
 * @author Ayesha Zaheed
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class SaveStudentsRecords {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        String fileName = "student_records.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            System.out.println("Enter student records (type 'done' to finish):");

            while (true) {
                System.out.print("Enter student name (or 'done'): ");
                String name = scanner.nextLine();
                if (name.equalsIgnoreCase("done")) {
                    break;
                }

                System.out.print("Enter student ID: ");
                String id = scanner.nextLine();

                System.out.print("Enter student CGPA: ");
                String cgpa = scanner.nextLine();

                // Write to file
                writer.write("Name: " + name + ", ID: " + id + ", CGPA: " + cgpa);
                writer.newLine(); // Move to the next line
            }

            System.out.println("Student records have been saved to " + fileName);

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace(); // Show full error details
        } finally {
            scanner.close(); // Close the scanner
        }   
    }
}
