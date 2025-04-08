/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.computersystem;

/**
 *
 * @author Ayesha Zaheed
 */
public class ComputerSystem {
    private String brand;
    private Processor processor;
    private RAM ram;
    private boolean isRunning;
    private String currentProgram;

    public ComputerSystem(String brand, String processorModel, double processorSpeed, int cores, int ramCapacity, int ramSpeed) {
        this.brand = brand;
        this.processor = new Processor(processorModel, processorSpeed, cores);
        this.ram = new RAM(ramCapacity, ramSpeed);
        this.isRunning = false;
        this.currentProgram = null;
    }

    public void powerOn() {
        if (!isRunning) {
            isRunning = true;
            System.out.println(brand + " computer is now powered on.");
        } else {
            System.out.println(brand + " computer is already powered on.");
        }
    }

    public void powerOff() {
        if (isRunning) {
            if (currentProgram != null) {
                System.out.println("Closing " + currentProgram + "...");
                currentProgram = null;
            }
            isRunning = false;
            System.out.println(brand + " computer is now powered off.");
        } else {
            System.out.println(brand + " computer is already powered off.");
        }
    }

    public void runProgram(String programName) {
        if (!isRunning) {
            System.out.println("Cannot run program - computer is powered off.");
            return;
        }

        if (currentProgram != null) {
            System.out.println("Already running " + currentProgram + ". Please close it first.");
            return;
        }

        currentProgram = programName;
        System.out.println("Running " + programName + " on " + brand + " computer.");
    }

    public void closeProgram() {
        if (currentProgram != null) {
            System.out.println("Closing " + currentProgram + "...");
            currentProgram = null;
        } else {
            System.out.println("No program is currently running.");
        }
    }

    public void displayComputerSpecs() {
        System.out.println("\n" + brand + " Computer Specifications:");
        processor.displaySpecs();
        ram.displaySpecs();
        System.out.println("Current Status: " + (isRunning ? "Powered On" : "Powered Off"));
        System.out.println("Running Program: " + (currentProgram != null ? currentProgram : "None"));
    }

    private class Processor {
        private String model;
        private double speed; // in GHz
        private int cores;

        public Processor(String model, double speed, int cores) {
            this.model = model;
            this.speed = speed;
            this.cores = cores;
        }

        public void displaySpecs() {
            System.out.println("Processor: " + model);
            System.out.println("Speed: " + speed + " GHz");
            System.out.println("Cores: " + cores);
        }
    }

    private class RAM {
        private int capacity;
        private int speed;

        public RAM(int capacity, int speed) {
            this.capacity = capacity;
            this.speed = speed;
        }

        public void displaySpecs() {
            System.out.println("RAM Capacity: " + capacity + " GB");
            System.out.println("RAM Speed: " + speed + " MHz");
        }
    }

    public static void main(String[] args) {
        ComputerSystem myComputer = new ComputerSystem("Dell ", "Core i7", 3.8, 8, 16, 3200);

        myComputer.displayComputerSpecs();

        myComputer.powerOn();

        myComputer.runProgram("Photoshop");

        myComputer.displayComputerSpecs();

        myComputer.closeProgram();

        myComputer.powerOff();
    }
}