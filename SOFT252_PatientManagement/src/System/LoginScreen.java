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
import Users.*;

import GUI.Doctor.doctorDashboard;
import GUI.Patient.patientDashboard;
import GUI.Admin.adminDashboard;
import GUI.Secretary.secretaryDashboard;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class LoginScreen extends javax.swing.JFrame {

    /**
     * Creates new form logonPage
     */
    public LoginScreen() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        userIdBox = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        passwordBox = new javax.swing.JPasswordField();
        requestBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Username");

        jLabel2.setText("Password");

        userIdBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userIdBoxActionPerformed(evt);
            }
        });

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        requestBtn.setText("Request Account");
        requestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(requestBtn)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(userIdBox, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(passwordBox, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userIdBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(btnSubmit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(requestBtn)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userIdBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userIdBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userIdBoxActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        String id = userIdBox.getText();
        
        System.out.println("User input: "+ id);
        
        String password = new String (passwordBox.getPassword());
        
        List<Patient> patients = main.patients;
        List<Secretary> secretaries = main.secretaries;
        List<Doctor> doctors = main.doctors;
        List<Admin> admins = main.admins;
        
        char first = id.charAt(0);
        if (first == 'P')
        {
            for (int i =0; i < patients.size(); i++){
            System.out.println("Stored username: " + patients.get(i).getUserId());
            if(id.equals(patients.get(i).getUserId()))
            {
                System.out.println("Username Match");
                if (password.equals(patients.get(i).getPassword()))
                {
                    if (patients.get(i).getActive().equals("false"))
                    {
                      JFrame frame = new JFrame();
                      JOptionPane.showMessageDialog(frame, "Your account is not active. A secretary needs to approve it.");  
                    }
                    else
                    {
                        System.out.println("Password Match");
                        main.currentUser = patients.get(i);
 
                        patientDashboard dash = new patientDashboard();
                        dash.setVisible(true);
                        
                    }
                 this.setVisible(false);
                 break;   
                }
                else
                {
                    System.out.println("No Password Match");
                    JFrame frame = new JFrame();
                    JOptionPane.showMessageDialog(frame, "Incorrect Username or Password, please try again");
                }
               
            }
        }
            
            
            
        
            
        
    }//GEN-LAST:event_btnSubmitActionPerformed
    else if (first == 'A')
    {
        for (int i =0; i < admins.size(); i++){
            System.out.println("Stored username: " + admins.get(i).getUserId());
            if(id.equals(admins.get(i).getUserId()))
            {
                System.out.println("Username Match");
                if (password.equals(admins.get(i).getPassword()))
                {
                        System.out.println("Password Match");
                        main.currentUser = admins.get(i);
 
                        adminDashboard dash = new adminDashboard();
                        dash.setVisible(true);
                        this.setVisible(false);
                        break;  
                    
                  
                }
                else
                {
                    System.out.println("No Password Match");
                    JFrame frame = new JFrame();
                    JOptionPane.showMessageDialog(frame, "Incorrect Username or Password, please try again");
                }
            }
            }
        }
    else if (first == 'D')
    {
        for (int i =0; i < doctors.size(); i++){
            System.out.println("Stored username: " + doctors.get(i).getUserId());
            if(id.equals(doctors.get(i).getUserId()))
            {
                System.out.println("Username Match");
                if (password.equals(doctors.get(i).getPassword()))
                {
                        System.out.println("Password Match");
                        main.currentUser = doctors.get(i);
 
                        doctorDashboard dash = new doctorDashboard();
                        dash.setVisible(true);
                        
                        this.setVisible(false);
                        break; 
                } 
                else
                {
                    System.out.println("No Password Match");
                    JFrame frame = new JFrame();
                    JOptionPane.showMessageDialog(frame, "Incorrect Username or Password, please try again");
                }
            } 
            }
        }
         
        
        else if (first == 'S')
    {
        for (int i =0; i < secretaries.size(); i++){
            System.out.println("Stored username: " + secretaries.get(i).getUserId());
            if(id.equals(secretaries.get(i).getUserId()))
            {
                System.out.println("Username Match");
                if (password.equals(secretaries.get(i).getPassword()))
                {
                        System.out.println("Password Match");
                        main.currentUser = secretaries.get(i);
 
                       secretaryDashboard dash = new secretaryDashboard();
                       dash.setVisible(true);
                        
                       this.setVisible(false);
                       break;     
                }
                else
                {
                    System.out.println("No Password Match");
                    JFrame frame = new JFrame();
                    JOptionPane.showMessageDialog(frame, "Incorrect Username or Password, please try again");
                }
            }
            }
        }
        
        
    }
    
    
    
    private void requestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestBtnActionPerformed
        // TODO add your handling code here:
        requestAccount dash = new requestAccount();
        dash.setVisible(true);
        this.setVisible(false);
        
        
        
    }//GEN-LAST:event_requestBtnActionPerformed
    
        
    

    /**
     * @param args the command line arguments
     */
    
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField passwordBox;
    private javax.swing.JButton requestBtn;
    private javax.swing.JTextField userIdBox;
    // End of variables declaration//GEN-END:variables
}
