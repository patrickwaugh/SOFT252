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
import java.io.FileWriter;
import java.io.Writer;
import java.lang.Integer;

import System.main;
import Users.*;
import Data.*;
import Objects.*;
/**
 *
 * @author patrick
 */
public class WriteData {
    
     public static void savePatients()
        { 
            JSONArray patientList = new JSONArray();

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
            
            JSONObject patientObject = new JSONObject(); 
            patientObject.put("patients", patientDetails);
            
            
            patientList.add(patientObject);
            }
            
            //Write JSON file
            try (FileWriter file = new FileWriter("src\\Data\\patients.json")) {
 
                file.write(patientList.toJSONString());
                file.flush();
 
            } catch (IOException e) 
            {
            e.printStackTrace();
            }

        }
    
    public static void saveDoctors()
        { 
            JSONArray doctorList = new JSONArray();

            for (int i=0; i<main.doctors.size();i++)
            {
                //First Employee
            JSONObject doctorDetails = new JSONObject();
            doctorDetails.put("userId", main.doctors.get(i).getUserId());
            doctorDetails.put("password", main.doctors.get(i).getPassword());
            doctorDetails.put("name", main.doctors.get(i).getName());
            doctorDetails.put("address", main.doctors.get(i).getAddress());
            
            
            JSONObject doctorObject = new JSONObject(); 
            doctorObject.put("doctors", doctorDetails);
            
            
            doctorList.add(doctorObject);
            }
            
            //Write JSON file
            try (FileWriter file = new FileWriter("src\\Data\\doctors.json")) {
 
                file.write(doctorList.toJSONString());
                file.flush();
 
            } catch (IOException e) 
            {
            e.printStackTrace();
            }

        }
    
    
    public static void saveAdmins()
        { 
            JSONArray adminList = new JSONArray();

            for (int i=0; i<main.admins.size();i++)
            {
                //First Employee
            JSONObject adminDetails = new JSONObject();
            adminDetails.put("userId", main.admins.get(i).getUserId());
            adminDetails.put("password", main.admins.get(i).getPassword());
            adminDetails.put("name", main.admins.get(i).getName());
            adminDetails.put("address", main.admins.get(i).getAddress());
            
            
            JSONObject adminObject = new JSONObject(); 
            adminObject.put("admins", adminDetails);
            
            
            adminList.add(adminObject);
            }
            
            //Write JSON file
            try (FileWriter file = new FileWriter("src\\Data\\admins.json")) {
 
                file.write(adminList.toJSONString());
                file.flush();
 
            } catch (IOException e) 
            {
            e.printStackTrace();
            }

        }
    
    
    public static void saveSecretaries()
        { 
            JSONArray secretaryList = new JSONArray();

            for (int i=0; i<main.secretaries.size();i++)
            {
                //First Employee
            JSONObject secretaryDetails = new JSONObject();
            secretaryDetails.put("userId", main.secretaries.get(i).getUserId());
            secretaryDetails.put("password", main.secretaries.get(i).getPassword());
            secretaryDetails.put("name", main.secretaries.get(i).getName());
            secretaryDetails.put("address", main.secretaries.get(i).getAddress());
            
            
            JSONObject secretaryObject = new JSONObject(); 
            secretaryObject.put("secretaries", secretaryDetails);
            
            
            secretaryList.add(secretaryObject);
            }
            
            //Write JSON file
            try (FileWriter file = new FileWriter("src\\Data\\secretaries.json")) {
 
                file.write(secretaryList.toJSONString());
                file.flush();
 
            } catch (IOException e) 
            {
            e.printStackTrace();
            }

        }
    
    
    
    public static void saveAppointments()
        { 
            JSONArray appointmentList = new JSONArray();

            for (int i=0; i<main.appointments.size();i++)
            {
                
            JSONObject appointmentDetails = new JSONObject();
            appointmentDetails.put("appointmentId", main.appointments.get(i).getAppointmentId());
            appointmentDetails.put("patient", main.appointments.get(i).getPatient().getName());
            appointmentDetails.put("doctor", main.appointments.get(i).getDoctor().getName());
            appointmentDetails.put("date", main.appointments.get(i).getDate());
            appointmentDetails.put("state", main.appointments.get(i).getState());

            
            JSONObject appointmentObject = new JSONObject(); 
            appointmentObject.put("appointments", appointmentDetails);
            
            
            appointmentList.add(appointmentObject);
            }
            
            //Write JSON file
            try (FileWriter file = new FileWriter("src\\Data\\appointments.json")) {
 
                file.write(appointmentList.toJSONString());
                file.flush();
 
            } catch (IOException e) 
            {
            e.printStackTrace();
            }

        }
    
    
    
    
    public static void saveAppointmentNotes()
        { 
            JSONArray appointmentNoteList = new JSONArray();

            for (int i=0; i<main.appointmentNotes.size();i++)
            {
                
            JSONObject appointmentNoteDetails = new JSONObject();
            appointmentNoteDetails.put("notesId", main.appointmentNotes.get(i).getNotesId());
            appointmentNoteDetails.put("patient", main.appointmentNotes.get(i).getPatient().getName());
            appointmentNoteDetails.put("doctor", main.appointmentNotes.get(i).getDoctor().getName());
            appointmentNoteDetails.put("date", main.appointmentNotes.get(i).getDate());
            appointmentNoteDetails.put("notes", main.appointmentNotes.get(i).getNotes());

            
            JSONObject appointmentNoteObject = new JSONObject(); 
            appointmentNoteObject.put("appointmentNotes", appointmentNoteDetails);
            
            
            appointmentNoteList.add(appointmentNoteObject);
            }
            
            //Write JSON file
            try (FileWriter file = new FileWriter("src\\Data\\appointmentNotes.json")) {
 
                file.write(appointmentNoteList.toJSONString());
                file.flush();
 
            } catch (IOException e) 
            {
            e.printStackTrace();
            }

        }
    
    
    public static void savePrescriptions()
        { 
            JSONArray prescriptionList = new JSONArray();

            for (int i=0; i<main.prescriptions.size();i++)
            {
                
            JSONObject prescriptionDetails = new JSONObject();
            prescriptionDetails.put("prescriptionId", main.prescriptions.get(i).getPrescriptionId());
            prescriptionDetails.put("patient", main.prescriptions.get(i).getPatient().getName());
            prescriptionDetails.put("doctor", main.prescriptions.get(i).getDoctor().getName());
            prescriptionDetails.put("medicineId", main.prescriptions.get(i).getMedicine().getMedicineId());
            prescriptionDetails.put("dosage", main.prescriptions.get(i).getDosage());
            prescriptionDetails.put("quantity", main.prescriptions.get(i).getQuantity());

            
            JSONObject prescriptionObject = new JSONObject(); 
            prescriptionObject.put("prescriptions", prescriptionDetails);
            
            
            prescriptionList.add(prescriptionObject);
            }
            
            //Write JSON file
            try (FileWriter file = new FileWriter("src\\Data\\prescriptions.json")) {
 
                file.write(prescriptionList.toJSONString());
                file.flush();
 
            } catch (IOException e) 
            {
            e.printStackTrace();
            }

        }
    
    
    public static void saveFeedback()
        { 
            JSONArray feedbackList = new JSONArray();

            for (int i=0; i<main.feedback.size();i++)
            {
                
            JSONObject feedbackDetails = new JSONObject();
            feedbackDetails.put("feedbackId", main.feedback.get(i).getFeedbackId());
            feedbackDetails.put("patient", main.feedback.get(i).getPatient().getName());
            feedbackDetails.put("doctor", main.feedback.get(i).getDoctor().getName());
            feedbackDetails.put("feedback", main.feedback.get(i).getFeedback());
            feedbackDetails.put("rating", main.feedback.get(i).getRating());


            
            JSONObject feedbackObject = new JSONObject(); 
            feedbackObject.put("feedbacks", feedbackDetails);
            
            
            feedbackList.add(feedbackObject);
            }
            
            //Write JSON file
            try (FileWriter file = new FileWriter("src\\Data\\feedback.json")) {
 
                file.write(feedbackList.toJSONString());
                file.flush();
 
            } catch (IOException e) 
            {
            e.printStackTrace();
            }

        }
    
    
    public static void saveMedicine()
        { 
            JSONArray medicineList = new JSONArray();

            for (int i=0; i<main.medicines.size();i++)
            {
                
            JSONObject medicineDetails = new JSONObject();
            medicineDetails.put("medicineId", main.medicines.get(i).getMedicineId());
            medicineDetails.put("name", main.medicines.get(i).getName());
            medicineDetails.put("lowQuantity", main.medicines.get(i).isLowQuantity());


            
            JSONObject medicineObject = new JSONObject(); 
            medicineObject.put("medicines", medicineDetails);
            
            
            medicineList.add(medicineObject);
            }
            
            //Write JSON file
            try (FileWriter file = new FileWriter("src\\Data\\medicines.json")) {
 
                file.write(medicineList.toJSONString());
                file.flush();
 
            } catch (IOException e) 
            {
            e.printStackTrace();
            }

        }
}
