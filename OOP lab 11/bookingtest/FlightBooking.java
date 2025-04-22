/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bookingtest;

/**
 *
 * @author Ayesha Zaheed
 */
public class FlightBooking extends Booking {
    public FlightBooking(String customerName, String date) {
        super(customerName, date);
    }

    @Override
    public void confirmBooking() {
        System.out.println("Flight ticket confirmed for " + customerName + " on " + date + ".");
    }
}
