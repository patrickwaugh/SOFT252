/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System;
/**
 *
 * @author patrick
 */

import Data.ReadData;
import java.util.*;
import System.*;
import Users.*;
import Objects.*;
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        loadUserData();
        loadObjectData();
        
        

        LoginScreen logon = new LoginScreen();
        logon.setVisible(true);
    }
    
    public static void loadUserData()
    {
        List<Patient> patientsList = ReadData.returnPatients();
        patients = patientsList;
        
        List<Admin> adminsList = ReadData.returnAdmins();
        admins = adminsList;
        
        List<Doctor> doctorsList = ReadData.returnDoctors();
        doctors = doctorsList;
        
        List<Secretary> secretariesList = ReadData.returnSecretaries();
        secretaries = secretariesList;
    }
    
    public static void loadObjectData()
    {
        List<Medicine> medicineList = ReadData.returnMedicines();
        medicines = medicineList;
        
        List<Prescription> prescriptionsList = ReadData.returnPrescriptions();
        prescriptions = prescriptionsList;
        
        List<Appointment> appointmentsList = ReadData.returnAppointments();
        appointments = appointmentsList;
        
        List<Feedback> feedbackList = ReadData.returnFeedback();
        feedback = feedbackList;
        
        List<AppointmentNotes> appointmentNotesList = ReadData.returnAppointmentNotes();
        appointmentNotes = appointmentNotesList;
    
    }
    public static Person currentUser;
    public static List<Patient> patients;
    public static List<Admin> admins;
    public static List<Doctor> doctors;
    public static List<Secretary> secretaries;
    public static List<Appointment> appointments;
    public static List<Medicine> medicines;
    public static List<Prescription> prescriptions;
    public static List<AppointmentNotes> appointmentNotes;
    public static List<Feedback> feedback;
   
    

}
