/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.doctorandhospitalsystem;

/**
 *
 * @author Ayesha Zaheed
 */
import java.util.ArrayList;
import java.util.List;
public class Hospital {
    private String name;
    private String location;
    private List<Doctor> doctors;

    public Hospital(String name, String location) {
        this.name = name;
        this.location = location;
        this.doctors = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }
    public void showAllDoctors() {
        System.out.println("Doctors at " + name + ":");
        for (Doctor doctor : doctors) {
            doctor.showInfo();
        }
    }

    public void displayHospitalInfo() {
        System.out.println("Hospital Information:");
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Number of Doctors: " + doctors.size());
    }
}
