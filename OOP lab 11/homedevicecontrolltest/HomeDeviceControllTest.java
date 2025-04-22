/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.homedevicecontrolltest;

/**
 *
 * @author Ayesha Zaheed
 */
public class HomeDeviceControllTest {

    public static void main(String[] args) {
        RemoteControl tv = new SmartTV();
        RemoteControl light = new SmartLight();
        RemoteControl speaker = new SmartSpeaker();

        System.out.println("Testing Smart TV:");
        tv.turnOn();
        tv.turnOff();

        System.out.println("\nTesting Smart Light:");
        light.turnOn();
        light.turnOff();

        System.out.println("\nTesting Smart Speaker:");
        speaker.turnOn();
        speaker.turnOff();
    }
}
