/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.paymentprocessor;

/**
 *
 * @author Ayesha Zaheed
 */
public class PayPalPayment extends PaymentMethod {
    private String email;

    public PayPalPayment(double amount, String email) {
        super(amount);
        this.email = email;
    }
    public void processPayment() {
        System.out.println("Processing PayPal payment...");
        System.out.println("Amount: $" + amount);
        System.out.println("PayPal Email: " + email);
        System.out.println("PayPal payment processed successfully.\n");
    }
}
