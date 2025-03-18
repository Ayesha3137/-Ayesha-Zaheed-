/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.theshapes;

/**
 *
 * @author Ayesha Zaheed
 */
public class Rectangle extends Shape {
    public int length;
    public int width;
    public Rectangle(int length,int width){
        this.length=length;
        this.width=width;
    }
    public int Area(){
    return length*width;
    }
}