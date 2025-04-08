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
public class Doctor {
    private String name;
    private String specialization;
    private int experienceyears;
    private List<String> patients;

    public Doctor(String name, String specialization, int experienceYears) {
        this.name = name;
        this.specialization = specialization;
        this.experienceyears = experienceyears;
        this.patients = new ArrayList<>();
    }

    public void addPatient(String patientName) {
        patients.add(patientName);
    }
    public void showInfo() {
        System.out.println("Doctor Information:");
        System.out.println("Name: " + name);
        System.out.println("Specialization: " + specialization);
        System.out.println("Experience: " + experienceyears);
        System.out.println("Number of Patients: " + patients.size());
    }

    public String getName() {
        return name;
    }
    public String getSpecialization() {
        return specialization;
    }

    public int getExperienceYears() {
        return experienceyears;
    }
}
