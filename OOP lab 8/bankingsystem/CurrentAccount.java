/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankingsystem;

/**
 *
 * @author Ayesha Zaheed
 */
public class CurrentAccount extends Account {
     private double OverdraftLimit;

    public CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.OverdraftLimit = overdraftLimit;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Overdraft Limit: $" + String.format("%.2f", OverdraftLimit));
    }
}
