/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.volumecalculation;

/**
 *
 * @author Ayesha Zaheed
 */
public class Cylinder extends Shape3D {
    public double radius;
    public double height;
    public Cylinder(double radius,double height){
        this.radius=radius;
        this.height=height;
    }
    public double BaseArea(){
    return 3.14*radius*radius;
    
}
}