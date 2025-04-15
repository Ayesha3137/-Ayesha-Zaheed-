/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stimulationofcomputers;

/**
 *
 * @author Ayesha Zaheed
 */
public class Laptop extends Computer {
    private int batteryLife; // in hours

    public Laptop(String os, int ram, String processor, int batteryLife) {
        super(os, ram, processor);
        this.batteryLife = batteryLife;
    }

    @Override
    public void runProgram(String programName) {
        System.out.println("Running " + programName + " on laptop...");
        System.out.println("Battery life remaining: " + batteryLife + " hours");
        System.out.println("Using touchpad or external mouse for input");
    }

    public void checkBattery() {
        System.out.println("Current battery level: " + batteryLife + " hours");
    }
}
