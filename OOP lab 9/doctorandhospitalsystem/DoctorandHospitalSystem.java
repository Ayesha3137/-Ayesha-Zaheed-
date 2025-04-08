/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.doctorandhospitalsystem;

/**
 *
 * @author Ayesha Zaheed
 */
public class DoctorandHospitalSystem {

    public static void main(String[] args) {
        Doctor DoctorAyesha = new Doctor("Dr. Ayesha", "Cardiology", 7);
        Doctor DoctorFatima = new Doctor("Dr. Fatima", "Neurology", 9);
        Doctor DoctorMahnoor = new Doctor("Dr. Mahnoor", "Pediatrics", 8);

        DoctorAyesha.addPatient("Elsa");
        DoctorAyesha.addPatient("Rapunzal");
        DoctorFatima.addPatient("Ayesha");
        DoctorMahnoor.addPatient("Sara");
        Hospital complexHospital = new Hospital("Complex Hospital", "6th road");
        Hospital shifaHospital = new Hospital("Shifa International Hospital", "Islamabad");

        complexHospital.addDoctor(DoctorAyesha);
        complexHospital.addDoctor(DoctorFatima);
        
        shifaHospital.addDoctor(DoctorFatima);
        shifaHospital.addDoctor(DoctorMahnoor);

        complexHospital.displayHospitalInfo();
        complexHospital.showAllDoctors();
        shifaHospital.displayHospitalInfo();
        shifaHospital.showAllDoctors();
        
        System.out.println(DoctorAyesha.getName() + " works at both hospitals");
    }
}
