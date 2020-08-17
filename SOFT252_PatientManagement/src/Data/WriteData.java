/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

        
import java.io.FileNotFoundException;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.io.FileWriter;


import System.main;
import Users.*;
import Data.*;
import Objects.*;
/**
 *
 * @author patrick
 */
public class WriteData {
    
    public static void saveAll()
    {
        savePatients();
        saveDoctors();
        saveAdmins();
        saveAppointmentNotes();
        saveAppointments();
        saveFeedback();
        saveMedicine();
        savePrescriptions();
        saveSecretaries();
        
        
    }
     public static void savePatients()
        { 
            JSONArray patientList = new JSONArray();
            JSONObject temp = new JSONObject();
            for (int i=0; i<main.patients.size();i++)
            {
                //First Employee
            JSONObject patientDetails = new JSONObject();
            patientDetails.put("userId", main.patients.get(i).getUserId());
            patientDetails.put("password", main.patients.get(i).getPassword());
            patientDetails.put("name", main.patients.get(i).getName());
            patientDetails.put("address", main.patients.get(i).getAddress());
            patientDetails.put("gender", main.patients.get(i).getGender());
            patientDetails.put("age", main.patients.get(i).getAge());
            patientDetails.put("active", main.patients.get(i).getActive());
            
            
            
            
            
            patientList.add(patientDetails);
            
            }
            
            temp.put("patients", patientList);
            //Write JSON file
            try (FileWriter file = new FileWriter("src\\Data\\patients.json")) {
 
                file.write(temp.toJSONString());
                file.flush();
 
            } catch (IOException e) 
            {
            e.printStackTrace();
            }

        }
    
    public static void saveDoctors()
        { 
            JSONArray doctorList = new JSONArray();
            JSONObject temp = new JSONObject();

            for (int i=0; i<main.doctors.size();i++)
            {
                //First Employee
            JSONObject doctorDetails = new JSONObject();
            doctorDetails.put("userId", main.doctors.get(i).getUserId());
            doctorDetails.put("password", main.doctors.get(i).getPassword());
            doctorDetails.put("name", main.doctors.get(i).getName());
            doctorDetails.put("address", main.doctors.get(i).getAddress());
            
            
            ;
            
            
            doctorList.add(doctorDetails);
            }
            
            temp.put("doctors", doctorList);
            //Write JSON file
            try (FileWriter file = new FileWriter("src\\Data\\doctors.json")) {
 
                file.write(temp.toJSONString());
                file.flush();
 
            } catch (IOException e) 
            {
            e.printStackTrace();
            }

        }
    
    
    public static void saveAdmins()
        { 
            JSONArray adminList = new JSONArray();
            JSONObject temp = new JSONObject();
            for (int i=0; i<main.admins.size();i++)
            {
                //First Employee
            JSONObject adminDetails = new JSONObject();
            adminDetails.put("userId", main.admins.get(i).getUserId());
            adminDetails.put("password", main.admins.get(i).getPassword());
            adminDetails.put("name", main.admins.get(i).getName());
            adminDetails.put("address", main.admins.get(i).getAddress());
            
            
            
            
            
            adminList.add(adminDetails);
            }
            temp.put("admins", adminList);
            //Write JSON file
            try (FileWriter file = new FileWriter("src\\Data\\admins.json")) {
 
                file.write(temp.toJSONString());
                file.flush();
 
            } catch (IOException e) 
            {
            e.printStackTrace();
            }

        }
    
    
    public static void saveSecretaries()
        { 
            JSONArray secretaryList = new JSONArray();
            JSONObject temp = new JSONObject();
            for (int i=0; i<main.secretaries.size();i++)
            {
                //First Employee
            JSONObject secretaryDetails = new JSONObject();
            secretaryDetails.put("userId", main.secretaries.get(i).getUserId());
            secretaryDetails.put("password", main.secretaries.get(i).getPassword());
            secretaryDetails.put("name", main.secretaries.get(i).getName());
            secretaryDetails.put("address", main.secretaries.get(i).getAddress());
            
            
            
            
            
            secretaryList.add(secretaryDetails);
            }
            temp.put("secretaries", secretaryList);
            //Write JSON file
            try (FileWriter file = new FileWriter("src\\Data\\secretaries.json")) {
 
                file.write(temp.toJSONString());
                file.flush();
 
            } catch (IOException e) 
            {
            e.printStackTrace();
            }

        }
    
    
    
    public static void saveAppointments()
        { 
            JSONArray appointmentList = new JSONArray();
            JSONObject temp = new JSONObject();
            for (int i=0; i<main.appointments.size();i++)
            {
                
            JSONObject appointmentDetails = new JSONObject();
            appointmentDetails.put("appointmentId", main.appointments.get(i).getAppointmentId());
            appointmentDetails.put("patient", main.appointments.get(i).getPatient().getName());
            appointmentDetails.put("doctor", main.appointments.get(i).getDoctor().getName());
            appointmentDetails.put("date", main.appointments.get(i).getDate());
            appointmentDetails.put("state", main.appointments.get(i).getState());

            
            
            
            appointmentList.add(appointmentDetails);
            }
            temp.put("appointments", appointmentList);
            //Write JSON file
            try (FileWriter file = new FileWriter("src\\Data\\appointments.json")) {
 
                file.write(temp.toJSONString());
                file.flush();
 
            } catch (IOException e) 
            {
            e.printStackTrace();
            }

        }
    
    
    
    
    public static void saveAppointmentNotes()
        { 
            JSONArray appointmentNoteList = new JSONArray();
            JSONObject temp = new JSONObject();
            for (int i=0; i<main.appointmentNotes.size();i++)
            {
                
            JSONObject appointmentNoteDetails = new JSONObject();
            appointmentNoteDetails.put("notesId", main.appointmentNotes.get(i).getNotesId());
            appointmentNoteDetails.put("patient", main.appointmentNotes.get(i).getPatient().getName());
            appointmentNoteDetails.put("doctor", main.appointmentNotes.get(i).getDoctor().getName());
            appointmentNoteDetails.put("date", main.appointmentNotes.get(i).getDate());
            appointmentNoteDetails.put("notes", main.appointmentNotes.get(i).getNotes());

            
            
            
            
            appointmentNoteList.add(appointmentNoteDetails);
            }
            temp.put("appointmentNotes", appointmentNoteList);
            //Write JSON file
            try (FileWriter file = new FileWriter("src\\Data\\appointmentNotes.json")) {
 
                file.write(temp.toJSONString());
                file.flush();
 
            } catch (IOException e) 
            {
            e.printStackTrace();
            }

        }
    
    
    public static void savePrescriptions()
        { 
            JSONArray prescriptionList = new JSONArray();
            JSONObject temp = new JSONObject();
            for (int i=0; i<main.prescriptions.size();i++)
            {
                
            JSONObject prescriptionDetails = new JSONObject();
            prescriptionDetails.put("prescriptionId", main.prescriptions.get(i).getPrescriptionId());
            prescriptionDetails.put("patient", main.prescriptions.get(i).getPatient().getName());
            prescriptionDetails.put("doctor", main.prescriptions.get(i).getDoctor().getName());
            prescriptionDetails.put("medicineId", main.prescriptions.get(i).getMedicine().getMedicineId());
            prescriptionDetails.put("dosage", main.prescriptions.get(i).getDosage());
            prescriptionDetails.put("quantity", main.prescriptions.get(i).getQuantity());

            
           
            
            
            prescriptionList.add(prescriptionDetails);
            }
            temp.put("prescriptions", prescriptionList);
            //Write JSON file
            try (FileWriter file = new FileWriter("src\\Data\\prescriptions.json")) {
 
                file.write(temp.toJSONString());
                file.flush();
 
            } catch (IOException e) 
            {
            e.printStackTrace();
            }

        }
    
    
    public static void saveFeedback()
        { 
            JSONArray feedbackList = new JSONArray();
            JSONObject temp = new JSONObject();
            for (int i=0; i<main.feedback.size();i++)
            {
                
            JSONObject feedbackDetails = new JSONObject();
            feedbackDetails.put("feedbackId", main.feedback.get(i).getFeedbackId());
            feedbackDetails.put("patient", main.feedback.get(i).getPatient().getName());
            feedbackDetails.put("doctor", main.feedback.get(i).getDoctor().getName());
            feedbackDetails.put("feedback", main.feedback.get(i).getFeedback());
            feedbackDetails.put("rating", main.feedback.get(i).getRating());



            
            
            feedbackList.add(feedbackDetails);
            }
            temp.put("feedbacks", feedbackList);
            //Write JSON file
            try (FileWriter file = new FileWriter("src\\Data\\feedback.json")) {
 
                file.write(temp.toJSONString());
                file.flush();
 
            } catch (IOException e) 
            {
            e.printStackTrace();
            }

        }
    
    
    public static void saveMedicine()
        { 
            JSONArray medicineList = new JSONArray();
            JSONObject temp = new JSONObject();
            for (int i=0; i<main.medicines.size();i++)
            {
                
            JSONObject medicineDetails = new JSONObject();
            medicineDetails.put("medicineId", main.medicines.get(i).getMedicineId());
            medicineDetails.put("name", main.medicines.get(i).getName());
            medicineDetails.put("lowQuantity", main.medicines.get(i).isLowQuantity());

            
            
            medicineList.add(medicineDetails);
            }
            temp.put("medicines", medicineList);
            //Write JSON file
            try (FileWriter file = new FileWriter("src\\Data\\medicines.json")) {
 
                file.write(temp.toJSONString());
                file.flush();
 
            } catch (IOException e) 
            {
            e.printStackTrace();
            }

        }
}
