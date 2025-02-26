/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Ayesha Zaheed
 */
import java.util.Scanner;
class department {
    private String deptname;
    private String depthead;

    public department() {
        this.deptname = "Unknown";
        this.depthead = "Unknown";
    }

    public department(String deptName, String deptHead) {
        this.deptname = deptName;
        this.depthead = deptHead;
    }

    public department(department dept) {
        this.deptname = dept.deptname;
        this.depthead = dept.depthead;
    }

    public void display() {
        System.out.println("Department Name: " + deptname);
        System.out.println("Department Head: " + depthead);
    }
}
class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

 

        for (int i = 0; i < 2; i++) {
            System.out.println("\nEnter details for Student " + (i + 1) + ":");

            System.out.print("Enter Department Name: ");
            String deptname = input.nextLine();
            System.out.print("Enter Department Head: ");
            String depthead = input.nextLine();
        }
    }
}