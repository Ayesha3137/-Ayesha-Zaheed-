/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stimulationofcomputers;

/**
 *
 * @author Ayesha Zaheed
 */
public abstract class Computer {
    public String os;
    public int ram;
    public String processor;

    public Computer(String os, int ram, String processor) {
        this.os = os;
        this.ram = ram;
        this.processor = processor;
    }

    // Abstract method to be implemented by subclasses
    public abstract void runProgram(String programName);

    // Common method for all computers
    public void bootUp() {
        System.out.println("Booting up " + getClass().getSimpleName() + 
                         " with " + os + " OS...");
    }

    // Common method to display specs
    public void displaySpecs() {
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + ram + "GB");
    }
}
