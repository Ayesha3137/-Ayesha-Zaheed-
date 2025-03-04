
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ayesha Zaheed
 */
public class candycrush {
      private String playerName;
    private int playerScore;
    private int playerLevel;
    public candycrush(String playerName) {
        this.playerName = playerName;
        this.playerScore = 0;
        this.playerLevel = 1;
    }
    public String getPlayerName() {
        return playerName;
    }
    public int getPlayerScore() {
        return playerScore;
    }
    public int getPlayerLevel() {
        return playerLevel;
    }
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
    public void setPlayerScore(int playerScore) {
        this.playerScore = playerScore;
    }
    public void setPlayerLevel(int playerLevel) {
        this.playerLevel = playerLevel;
    }
    public void matchCandies() {
        this.playerScore += 20;
        System.out.println("Matched candies! +20 points.");
    }
    public void clearRow() {
        this.playerScore += 30;
        System.out.println("Cleared a row! +30 points.");
    }
    public void completeLevel() {
        this.playerLevel += 1;
        System.out.println("Level " + (this.playerLevel - 1) + " completed! Now on level " + this.playerLevel + ".");
    }
    public void displayProgress() {
        System.out.println("Player: " + this.playerName);
        System.out.println("Score: " + this.playerScore);
        System.out.println("Level: " + this.playerLevel);
    }
    public void playerAction() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nChoose an action:");
            System.out.println("1. Match Candies");
            System.out.println("2. Clear a Row");
            System.out.println("3. Complete a Level");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choose= scanner.nextInt();
            switch (choose) {
                case 1:
                    this.matchCandies();
                    break;
                case 2:
                    this.clearRow();
                    break;
                case 3:
                    this.completeLevel();
                    break;
                case 4:
                    System.out.println("Exiting the game. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            this.displayProgress();
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter player name: ");
        String name = scan.nextLine();
        candycrush player = new candycrush(name);
        player.playerAction();
        scan.close();
    }

}
