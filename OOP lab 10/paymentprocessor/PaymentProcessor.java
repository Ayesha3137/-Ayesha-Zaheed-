/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.paymentprocessor;

/**
 *
 * @author Ayesha Zaheed
 */
public class PaymentProcessor {

    public static void main(String[] args) {
        PaymentMethod creditCardPayment = new CreditCardPayment(1000.0, "1234-5678-9876-5432", "Ayesha Zaheed", "12/26");
        PaymentMethod payPalPayment = new PayPalPayment(750.5, "ayesha@gmail.com");

        creditCardPayment.processPayment();
        payPalPayment.processPayment();
    }
}
