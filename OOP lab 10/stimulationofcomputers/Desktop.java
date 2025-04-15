/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stimulationofcomputers;

/**
 *
 * @author Ayesha Zaheed
 */
public class Desktop extends Computer {
    private String gpu;
    private boolean hasMultipleMonitors;
    
    public Desktop(String os, int ram, String processor, String gpu, boolean hasMultipleMonitors) {
        super(os, ram, processor);
        this.gpu = gpu;
        this.hasMultipleMonitors = hasMultipleMonitors;
    }
    
    @Override
    public void runProgram(String programName) {
        System.out.println("\nRunning " + programName + " on Desktop:");
        System.out.println("- Utilizing powerful " + gpu + " GPU");
        System.out.println("- Displaying on " + (hasMultipleMonitors ? "multiple monitors" : "single monitor"));
        System.out.println("- Full performance mode enabled");
    }
    
    public void upgradeRAM(int additionalGB) {
        ram += additionalGB;
        System.out.println("RAM upgraded to " + ram + "GB");
    }
}
