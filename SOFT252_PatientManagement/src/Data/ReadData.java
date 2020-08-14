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
        
        
        
        
    
    
}
