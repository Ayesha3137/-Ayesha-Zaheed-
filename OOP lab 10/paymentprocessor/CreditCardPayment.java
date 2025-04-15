/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.paymentprocessor;

/**
 *
 * @author Ayesha Zaheed
 */
public class CreditCardPayment extends PaymentMethod{
    private String cardNumber;
    private String cardHolderName;
    private String expiryDate;

    public CreditCardPayment(double amount, String cardNumber, String cardHolderName, String expiryDate) {
        super(amount);
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expiryDate = expiryDate;
    }
    public void processPayment() {
        System.out.println("Processing credit card payment...");
        System.out.println("Amount: $" + amount);
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Card Holder: " + cardHolderName);
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("Credit card payment processed successfully.\n");
    }
}
