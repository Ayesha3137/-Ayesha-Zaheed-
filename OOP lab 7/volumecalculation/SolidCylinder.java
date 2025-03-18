/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.volumecalculation;

/**
 *
 * @author Ayesha Zaheed
 */
public class SolidCylinder extends Cylinder {
    public SolidCylinder(double radius , double height) {
    super(radius,height);
}
    public double Volume(){
    double BaseArea=BaseArea();
    return  BaseArea*height; 
    }
}