/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.volumecalculation;

/**
 *
 * @author Ayesha Zaheed
 */
public class Volumecalculation {

    public static void main(String[] args) {
        SolidCylinder solidCylinder = new SolidCylinder(3.0, 5.0);
        solidCylinder.print();
        System.out.println("The radius is "+solidCylinder.radius);
        System.out.println("The height is "+solidCylinder.height);
        System.out.println("The base area of cylinder is "+solidCylinder.BaseArea());
        System.out.println("The volume of cylinder is "+solidCylinder.Volume());
    }
}
