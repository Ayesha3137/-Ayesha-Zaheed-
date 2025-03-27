/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankingsystem;

/**
 *
 * @author Ayesha Zaheed
 */
public class SavingAccount extends Account {
    private double InterestRate;

    public SavingAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.InterestRate = interestRate;
    }
    public void addInterest() {
        double interest = balance * (InterestRate / 100);
        balance += interest;
        System.out.println("Interest of $" + String.format("%.2f", interest) + " added. New Balance: $" + String.format("%.2f", balance));
    }
}
