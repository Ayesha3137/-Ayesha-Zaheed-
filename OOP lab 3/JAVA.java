/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.java;

/**
 *
 * @author Ayesha Zaheed
 */
import java.util.Scanner;

class Dishes 
{
    private String type;       // Type of the dish (sweets, savory, etc.)
    private String ingredients; 
    private String cuisine;     

   public void getInput() {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the type of the dish (e.g., sweets, savory): ");
    type = scanner.nextLine();

    System.out.print("Enter the ingredients of the dish: ");
    ingredients = scanner.nextLine();

    System.out.print("Enter the cuisine of the dish (e.g., Asian, Italian): ");
    cuisine = scanner.nextLine();

    scanner.close(); // Close scanner to avoid resource leak
}


    public void displayDetails() {
        System.out.println("Welcome to the Asian Restaurant");
        System.out.println("Your selected choice of Dish is " + type);
        System.out.println("Your Dish contains the following ingredients: " + ingredients);
        System.out.println("Your dish belongs to the " + cuisine + " cuisine");
    }
}

public class JAVA {
    public static void main(String[] args) {
        Dishes dish = new Dishes();

        // Get user input for the dish details
        dish.getInput();

        // Display the dish details
        dish.displayDetails();
    }
}
