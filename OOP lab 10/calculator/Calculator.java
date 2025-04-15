/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculator;
/**
 *
 * @author Ayesha Zaheed
 */
public class Calculator {

    public static Number add(Number a, Number b) {
        if (a instanceof Double || b instanceof Double) {
            return a.doubleValue() + b.doubleValue();
        }
        return a.intValue() + b.intValue();
    }
    public static Number subtract(Number a, Number b) {
        if (a instanceof Double || b instanceof Double) {
            return a.doubleValue() - b.doubleValue();
        }
        return a.intValue() - b.intValue();
    }

    // Multiplication
    public static Number multiply(Number a, Number b) {
        if (a instanceof Double || b instanceof Double) {
            return a.doubleValue() * b.doubleValue();
        }
        return a.intValue() * b.intValue();
    }
    public static Number divide(Number a, Number b) {
        if (b.doubleValue() == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        if (a instanceof Double || b instanceof Double) {
            return a.doubleValue() / b.doubleValue();
        }
        return a.intValue() / b.intValue();
    }

    public static Number power(Number a, Number b) {
        return Math.pow(a.doubleValue(), b.doubleValue());
    }

    public static Number modulus(Number a, Number b) {
        if (b.doubleValue() == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        if (a instanceof Double || b instanceof Double) {
            return a.doubleValue() % b.doubleValue();
        }
        return a.intValue() % b.intValue();
    }

    public static void main(String[] args) {
        System.out.println("Addition: " + add(5, 3.2));      // 8.2
        System.out.println("Subtraction: " + subtract(10, 4.5)); // 5.5
        System.out.println("Multiplication: " + multiply(2, 3.5)); // 7.0
        System.out.println("Division: " + divide(10, 2));     // 5
        System.out.println("Power: " + power(2, 3));         // 8.0
        System.out.println("Modulus: " + modulus(10, 3));    // 1
    }
}