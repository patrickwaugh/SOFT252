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
import GUI.*;
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        List<Patient> patientsList = ReadData.returnPatients();
        patients = patientsList;
        

        LoginScreen logon = new LoginScreen();
        logon.setVisible(true);
    }
    public static Person currentUser;
    public static List<Patient> patients;
    
   
    

}
