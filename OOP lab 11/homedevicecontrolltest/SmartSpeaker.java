/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homedevicecontrolltest;

/**
 *
 * @author Ayesha Zaheed
 */
public class SmartSpeaker implements RemoteControl {
    @Override
    public void turnOn() {
        System.out.println("Smart Speaker is now ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("Smart Speaker is now OFF.");
    }
}
