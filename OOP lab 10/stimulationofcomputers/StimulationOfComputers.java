/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stimulationofcomputers;

/**
 *
 * @author Ayesha Zaheed
 */
public class StimulationOfComputers {

    public static void main(String[] args) {
       Computer myLaptop = new Laptop("Windows 11", 16, "Intel i7", 8);
        myLaptop.bootUp();
        myLaptop.displaySpecs();
        myLaptop.runProgram("Visual Studio Code");
        ((Laptop) myLaptop).checkBattery();

        System.out.println("\n--------------------\n");

        // Create a desktop
        Computer myDesktop = new Desktop("Linux", 32, "AMD Ryzen 9", 
                                       "4K IPS", true);
        myDesktop.bootUp();
        myDesktop.displaySpecs();
        myDesktop.runProgram("Blender 3D");
        ((Desktop) myDesktop).upgradeRAM(16);
    }
}
