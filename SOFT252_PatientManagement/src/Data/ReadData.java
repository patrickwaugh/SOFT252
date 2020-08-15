/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.util.*;
import java.io.Reader;
import java.lang.Integer;

import System.main;
import Users.*;
import Data.*;
import Objects.*;

/**
 *
 * @author patrick
 */
public class ReadData {
        
        
        
        Admin[] adminList;
        Doctor[] doctorList;
        Secretary[] secretaryList;
        
        public static List<Patient> returnPatients()
        { 
        List<Patient> patientList = new ArrayList<>();
        
        JSONParser parser = new JSONParser();
        
           
         
        try (Reader reader = new FileReader("src\\Data\\patients.json"))
        {
           JSONObject jsonObject = (JSONObject) parser.parse(reader); //Parse the JSON object
           
            JSONArray patients = (JSONArray) jsonObject.get("patients");
            
            for (int i = 0; i < patients.size(); i++) {
                JSONObject currentPatient = (JSONObject) patients.get(i);
                
                String userId = currentPatient.get("userId").toString();
                
                String name = currentPatient.get("name").toString();
                
                String address = currentPatient.get("address").toString();
                
                String gender = currentPatient.get("gender").toString();
                
                String strAge = currentPatient.get("age").toString();
                
                int age = Integer.parseInt(strAge);
                
                String password = currentPatient.get("password").toString();
                
                patientList.add(new Patient(userId, name, address, gender, age, password));
            }
           
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }
        
        return patientList;
        }
        
        
        public static List<Admin> returnAdmins()
        { 
        List<Admin> adminList = new ArrayList<>();
        
        JSONParser parser = new JSONParser();
        
           
         
        try (Reader reader = new FileReader("src\\Data\\admins.json"))
        {
           JSONObject jsonObject = (JSONObject) parser.parse(reader); //Parse the JSON object
           
            JSONArray admins = (JSONArray) jsonObject.get("admins");
            
            for (int i = 0; i < admins.size(); i++) {
                JSONObject currentAdmin = (JSONObject) admins.get(i);
                
                String userId = currentAdmin.get("userId").toString();
                
                String password = currentAdmin.get("password").toString();
                
                String name = currentAdmin.get("name").toString();
                
                String address = currentAdmin.get("address").toString();
                
                adminList.add(new Admin(userId, name, address, password));
            }
           
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }
        
        return adminList;
        }
        
        
        
        public static List<Doctor> returnDoctors()
        { 
        List<Doctor> doctorList = new ArrayList<>();
        
        JSONParser parser = new JSONParser();
        
           
         
        try (Reader reader = new FileReader("src\\Data\\doctors.json"))
        {
           JSONObject jsonObject = (JSONObject) parser.parse(reader); //Parse the JSON object
           
            JSONArray doctors = (JSONArray) jsonObject.get("doctors");
            
            for (int i = 0; i < doctors.size(); i++) {
                JSONObject currentDoctor = (JSONObject) doctors.get(i);
                
                String userId = currentDoctor.get("userId").toString();
                
                String password = currentDoctor.get("password").toString();
                
                String name = currentDoctor.get("name").toString();
                
                String address = currentDoctor.get("address").toString();
                
                doctorList.add(new Doctor(userId, name, address, password));
            }
           
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }
        
        return doctorList;
        }
    
    
        
        
        public static List<Secretary> returnSecretaries()
        { 
        List<Secretary> secretaryList = new ArrayList<>();
        
        JSONParser parser = new JSONParser();
        
           
         
        try (Reader reader = new FileReader("src\\Data\\secretaries.json"))
        {
           JSONObject jsonObject = (JSONObject) parser.parse(reader); //Parse the JSON object
           
            JSONArray secretaries = (JSONArray) jsonObject.get("secretaries");
            
            for (int i = 0; i < secretaries.size(); i++) {
                JSONObject currentSecretary = (JSONObject) secretaries.get(i);
                
                String userId = currentSecretary.get("userId").toString();
                
                String password = currentSecretary.get("password").toString();
                
                String name = currentSecretary.get("name").toString();
                
                String address = currentSecretary.get("address").toString();
                
                secretaryList.add(new Secretary(userId, name, address, password));
            }
           
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }
        
        return secretaryList;
        }
        
        
        
        public static List<Medicine> returnMedicines()
        { 
        List<Medicine> medicineList = new ArrayList<>();
        
        JSONParser parser = new JSONParser();
        
           
         
        try (Reader reader = new FileReader("src\\Data\\medecines.json"))
        {
           JSONObject jsonObject = (JSONObject) parser.parse(reader); //Parse the JSON object
           
            JSONArray medicines = (JSONArray) jsonObject.get("medicines");
            
            for (int i = 0; i < medicines.size(); i++) {
                JSONObject currentMedicine = (JSONObject) medicines.get(i);
                
                String medicineId = currentMedicine.get(" medicineId").toString();
                
                String name = currentMedicine.get("name").toString();
                
                
                String tempLowQuantity = currentMedicine.get("lowQuantity").toString();
                char first = tempLowQuantity.charAt(0);
                
                boolean lowQuantity;
                if (first == 'f')
                {
                    lowQuantity = false;
                }
                else
                {
                    lowQuantity = true;
                }
                
                
                medicineList.add(new Medicine(medicineId, name, lowQuantity));
            }
           
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }
        
        return medicineList;
        }
        
        
        
        
        public static List<Appointment> returnAppointments()
        { 
        List<Appointment> appointmentList = new ArrayList<>();
        
        JSONParser parser = new JSONParser();      
         
        try (Reader reader = new FileReader("src\\Data\\appointment.json"))
        {
           JSONObject jsonObject = (JSONObject) parser.parse(reader); //Parse the JSON object
           
            JSONArray appointments = (JSONArray) jsonObject.get("appointments");
            
            for (int i = 0; i < appointments.size(); i++) {
                JSONObject currentAppointment = (JSONObject) appointments.get(i);
                
                String appointmentId = currentAppointment.get("appointmentId").toString();
                
                String patientId = (currentAppointment.get("patient").toString());
                
                Patient patient = null;
                for (int x = 0; x < main.patients.size(); x++)
                {
                    if (main.patients.get(x).getUserId().equals(patientId))
                    {
                        patient = main.patients.get(x);
                    }     
                }
                
                String doctorId = (currentAppointment.get("doctor").toString());
                
                Doctor doctor = null;
                
                for (int x = 0; x < main.doctors.size(); x++)
                {
                    if (main.doctors.get(x).getUserId().equals(doctorId))
                    {
                        doctor = main.doctors.get(x);
                    }     
                }
                
                String date = currentAppointment.get("date").toString();
                
                String state = currentAppointment.get("state").toString();
                
                
                appointmentList.add(new Appointment(appointmentId, patient, doctor, date, state));
            }
           
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }
        
        return appointmentList;
        }
        
        
        
        public static List<Prescription> returnPrescriptions()
        { 
        List<Prescription> prescriptionList = new ArrayList<>();
        
        JSONParser parser = new JSONParser();      
         
        try (Reader reader = new FileReader("src\\Data\\prescription.json"))
        {
           JSONObject jsonObject = (JSONObject) parser.parse(reader); //Parse the JSON object
           
            JSONArray prescriptions = (JSONArray) jsonObject.get("prescriptions");
            
            for (int i = 0; i < prescriptions.size(); i++) {
                JSONObject currentPrescription = (JSONObject) prescriptions.get(i);
                
                String prescriptionId = currentPrescription.get("prescriptionId").toString();

                String patientId = (currentPrescription.get("patient").toString());
                
                Patient patient = null;
                for (int x = 0; x < main.patients.size(); x++)
                {
                    if (main.patients.get(x).getUserId().equals(patientId))
                    {
                        patient = main.patients.get(x);
                    }     
                }
                
                String doctorId = (currentPrescription.get("doctor").toString());
                
                Doctor doctor = null;
                
                for (int x = 0; x < main.doctors.size(); x++)
                {
                    if (main.doctors.get(x).getUserId().equals(doctorId))
                    {
                        doctor = main.doctors.get(x);
                    }     
                }
                
                
                String medicineId = (currentPrescription.get("medicineId").toString());
                
                Medicine medicine = null;
                
                for (int x = 0; x < main.medicines.size(); x++)
                {
                    if (main.medicines.get(x).getMedicineId().equals(medicineId))
                    {
                        medicine = main.medicines.get(x);
                    }     
                }
                String dosage = currentPrescription.get("dosage").toString();
                
                int quantity = Integer.parseInt(currentPrescription.get("quantity").toString());
                
                
                prescriptionList.add(new Prescription(prescriptionId, doctor, patient, medicine, quantity, dosage));
            }
           
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }
        
        return prescriptionList;
        }
        
}
