/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.theshapes;

/**
 *
 * @author Ayesha Zaheed
 */
public class Theshapes {

    public static void main(String[] args) {
       Rectangle rectangle=new Rectangle(10 , 8);
       rectangle.print();
               System.out.println("The length is "+rectangle.length);
               System.out.println("The width is "+rectangle.width);
               System.out.println("The area of rectangle is "+rectangle.Area());
    }
}
