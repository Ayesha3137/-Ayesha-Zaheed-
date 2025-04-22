/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bookingtest;

/**
 *
 * @author Ayesha Zaheed
 */
public class BookingTest {

    public static void main(String[] args) {
        Booking trainBooking = new TrainBooking("Ayesha", "08-04-25");
        Booking flightBooking = new FlightBooking("Mahnoor", "06-04-25");

        trainBooking.confirmBooking();
        flightBooking.confirmBooking();
    }
    }
