/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.util.*;
import java.io.Reader;
import java.io.File;
import java.net.URL;

import Users.*;
import Data.*;

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
        
        
}
