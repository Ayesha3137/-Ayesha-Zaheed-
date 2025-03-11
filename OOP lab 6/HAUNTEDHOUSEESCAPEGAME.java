/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.hauntedhouseescapegame;

/**
 *
 * @author Ayesha Zaheed
 */
import java.util.Scanner;
public class HAUNTEDHOUSEESCAPEGAME {
    public static void main(String[] args) {
        System.out.println("WELOME TO THE HAUNTED HOUSE ESCAPE");
        System.out.println("Solve the mystery words to escape from the haunted house");
        String[] mysteryWords = {"GHOST", "VAMPIRE", "ZOMBIE", "WOLF", "SKELETON", "MUMMY", "DEADBODY", "BLOOD"};
        Scanner scanner = new Scanner(System.in);
        boolean[] guessedCorrectly = new boolean[mysteryWords.length];
        for (int i = 0; i < mysteryWords.length; i++) {
            String mysteryWord = mysteryWords[i];
            String middleLetter = mysteryWord.substring(2,3); 
            boolean isCorrect = false;
            System.out.println("\nYou are in Room " + (i + 1) + ".");
            System.out.println("Hint: The mystery word icludes letter " + middleLetter + ".");
            do {
                System.out.print("Enter your guess: ");
                String guess = scanner.nextLine().toUpperCase(); 
                if (guess.equals(mysteryWord)) {
                    System.out.println("Correct! You have escaped this room.");
                    isCorrect = true;
                    guessedCorrectly[i] = true; 
                } else {
                    System.out.println("Incorrect guess. Try again.");
                }
            } while (!isCorrect);
        }
        boolean allGuessed = true;
        for (boolean guessed : guessedCorrectly) {
            if (!guessed) {
                allGuessed = false;
                break;
            }
        }
        if (allGuessed) {
            System.out.println("\nCongratulations! You have escaped the haunted house!");
        } else {
            System.out.println("\nSomething went wrong. You are still trapped!");
        }
    }
}
