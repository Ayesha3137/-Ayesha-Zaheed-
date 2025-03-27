/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bankingsystem;

/**
 *
 * @author Ayesha Zaheed
 */
public class BankingSystem {

    public static void main(String[] args) {
        SavingAccount savings = new SavingAccount("SA123", 5000, 3.5);
        CurrentAccount current = new CurrentAccount("CA456", 2000, 1000);
        FixedDepositAccount fixedDeposit = new FixedDepositAccount("FD789", 10000, 24);

        System.out.println("--- Savings Account ---");
        savings.displayDetails();
        savings.addInterest();

        System.out.println("\n--- Current Account ---");
        current.displayDetails();

        System.out.println("\n--- Fixed Deposit Account ---");
        fixedDeposit.displayDetails();
        fixedDeposit.displayMaturityPeriod();
    }
}
