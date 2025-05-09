/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.task1;

/**
 *
 * @author Ayesha Zaheed
 */
import java.io.*;
public class TASK1 {
    public static void main(String[] args) {
        // Define the file path
        File file = new File("data.txt");

        // Writing sample data to the file (for demonstration purposes)
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write("My name is Ayesha Zaheed");  // Writing a numeric string to the file
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // Reading data from the file and converting it to an integer
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line = reader.readLine();  // Read the string
            System.out.println("String read from file: " + line);

            // Convert the string to integer
            int number = Integer.parseInt(line);
            System.out.println("Converted integer: " + number);

        } catch (IOException e) {
            System.out.println("IOException occurred: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format: " + e.getMessage());
        }
    }
}


   