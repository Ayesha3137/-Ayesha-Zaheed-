/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bankingsystem;

/**
 *
 * @author Ayesha Zaheed
 */
public class FixedDepositAccount extends Account {
    private int MaturityPeriod;

    public FixedDepositAccount(String accountNumber, double balance, int maturityPeriod) {
        super(accountNumber, balance);
        this.MaturityPeriod = maturityPeriod;
    }

    public void displayMaturityPeriod() {
        System.out.println("Maturity Period: " + MaturityPeriod + " months");
    }
}
