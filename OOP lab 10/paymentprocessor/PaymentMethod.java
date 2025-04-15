/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.paymentprocessor;

/**
 *
 * @author Ayesha Zaheed
 */
public abstract class PaymentMethod {
    public double amount;

    public PaymentMethod(double amount) {
        this.amount = amount;
    }

    public abstract void processPayment();
}
