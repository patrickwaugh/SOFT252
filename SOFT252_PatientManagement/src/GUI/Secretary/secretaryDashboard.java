/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Secretary;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import System.main;
import java.util.*;
import Objects.*;
import Users.*;

/**
 *
 * @author patrick
 */
public class secretaryDashboard extends javax.swing.JFrame {

    /**
     * Creates new form secretaryDashboard
     */
    public List<Appointment> appointmentRequests;
    public List<Patient> patientRequests;
    public List<Medicine> orderMedicine;
    public secretaryDashboard() {
        initComponents();
        
        loadAppointments();
        loadAccountRequests();
        loadMedicineOrders();
        loadPatients();
        
        
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        apptRequestTbl = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        apptRequestBtn = new javax.swing.JButton();
        apptDenyBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        accountReqTbl = new javax.swing.JTable();
        accountRequestBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        medsTbl = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        orderMedsBtn = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        accountsTbl = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        accountRemoveBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        apptRequestTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Appt ID", "Patient", "Doctor", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(apptRequestTbl);

        jLabel1.setText("Appointment Requests");

        apptRequestBtn.setText("Approve");
        apptRequestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apptRequestBtnActionPerformed(evt);
            }
        });

        apptDenyBtn.setText("Deny");
        apptDenyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apptDenyBtnActionPerformed(evt);
            }
        });

        accountReqTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Username", "Name", "Sex", "Age", "Address"
            }
        ));
        jScrollPane2.setViewportView(accountReqTbl);

        accountRequestBtn.setText("Approve");
        accountRequestBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountRequestBtnActionPerformed(evt);
            }
        });

        jLabel2.setText("Account Requests");

        medsTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Med ID", "Name"
            }
        ));
        jScrollPane3.setViewportView(medsTbl);
        if (medsTbl.getColumnModel().getColumnCount() > 0) {
            medsTbl.getColumnModel().getColumn(0).setResizable(false);
            medsTbl.getColumnModel().getColumn(1).setResizable(false);
        }

        jLabel3.setText("Medicine Orders");

        orderMedsBtn.setText("Order");
        orderMedsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderMedsBtnActionPerformed(evt);
            }
        });

        accountsTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Username", "Name", "Address"
            }
        ));
        jScrollPane4.setViewportView(accountsTbl);

        jLabel4.setText("Patient Accounts");

        accountRemoveBtn.setText("Remove");
        accountRemoveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountRemoveBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(apptRequestBtn)
                                .addGap(18, 18, 18)
                                .addComponent(apptDenyBtn))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(accountRequestBtn))
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(45, 45, 45))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(orderMedsBtn, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(478, 478, 478))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(accountRemoveBtn))
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apptDenyBtn)
                    .addComponent(accountRequestBtn)
                    .addComponent(apptRequestBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orderMedsBtn)
                    .addComponent(accountRemoveBtn)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void apptRequestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apptRequestBtnActionPerformed
        // TODO add your handling code here:
        int selected = apptRequestTbl.getSelectedRow();
        if (selected == -1)
        {
            //Selection needed
        }
        else{
            String selectedAppt = accountsTbl.getValueAt(selected, 0).toString();
            for (int i = 0; i< main.appointments.size(); i++)
            {
                if (main.appointments.get(i).getAppointmentId().equals(selectedAppt))
                {
                    main.appointments.get(i).setState("confirmed");
                    break;
                }
            }
        }
        refresh();
    }//GEN-LAST:event_apptRequestBtnActionPerformed

    private void apptDenyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apptDenyBtnActionPerformed
        int selected = accountReqTbl.getSelectedRow();
        if (selected == -1)
        {
            JFrame frame = new JFrame();
            JOptionPane.showMessageDialog(frame, "Please select an appointment to remove");
        }
        else{
            String selectedAppt = accountsTbl.getValueAt(selected, 0).toString();
            for (int i = 0; i< main.patients.size(); i++)
            {
                

                if (main.appointments.get(i).getAppointmentId().equals(selectedAppt))
                {
                    main.appointments.get(i).setState("denied");
                    break;
                }
            }
        }
        refresh();
    }//GEN-LAST:event_apptDenyBtnActionPerformed

    private void accountRequestBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountRequestBtnActionPerformed
        // TODO add your handling code here:
        int selected = accountReqTbl.getSelectedRow();
        if (selected == -1)
        {
            JFrame frame = new JFrame();
            JOptionPane.showMessageDialog(frame, "Please select an account to remove");
        }
        else{
            String selectedUser = accountsTbl.getValueAt(selected, 0).toString();
            for (int i = 0; i< main.patients.size(); i++)
            {
                

                if (main.patients.get(i).getUserId().equals(selectedUser))
                {
                    main.patients.get(i).setActive("true");
                    break;
                }
            }
        }
        refresh();
    }//GEN-LAST:event_accountRequestBtnActionPerformed

    private void orderMedsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderMedsBtnActionPerformed
        // TODO add your handling code here:
        int selected = medsTbl.getSelectedRow();
        if (selected == -1)
        {
            JFrame frame = new JFrame();
            JOptionPane.showMessageDialog(frame, "Please select an account to remove");
        }
        else{
            String selectedMed = accountsTbl.getValueAt(selected, 0).toString();
            for(int i = 0; i< main.medicines.size(); i++)
            {
                if (main.medicines.get(i).getMedicineId().equals(selectedMed))
                {
                    main.medicines.get(i).setLowQuantity(false);
                    break;
                }
            }
        }
        refresh();
    }//GEN-LAST:event_orderMedsBtnActionPerformed

    private void accountRemoveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountRemoveBtnActionPerformed
        // TODO add your handling code here:
        int selected = accountsTbl.getSelectedRow();
        if (selected == -1)
        {
            JFrame frame = new JFrame();
            JOptionPane.showMessageDialog(frame, "Please select an account to remove");
        }
        else {
            String selectedUser = accountsTbl.getValueAt(selected, 0).toString();
            
            removeUser(selectedUser);
            
            JFrame frame = new JFrame();
            JOptionPane.showMessageDialog(frame, "Account has been removed");
            this.dispose();
            secretaryDashboard dash = new secretaryDashboard();
            dash.setVisible(true);
        }
    }//GEN-LAST:event_accountRemoveBtnActionPerformed
    public static void removeUser(String id){
        
        for (int i = 0; i<main.patients.size(); i++)
        {
            if (main.patients.get(i).getUserId().equals(id))
            {
                Patient patient = main.patients.get(i);
                main.patients.remove(patient);
            }
            
        }
        
    }
    /**
     * @param args the command line arguments
     */
    public void refresh(){
        loadAppointments();
        loadAccountRequests();
        loadMedicineOrders();
        loadPatients();
        
        
        
        this.dispose();
        secretaryDashboard dash = new secretaryDashboard();
        dash.setVisible(true);
    }
    
    public void loadAppointments(){
        
        List<Appointment> appRequests = new ArrayList();
        for (int i = 0; i< main.appointments.size(); i++)
        {
            if (main.appointments.get(i).getState().equals("pending"))
            {
                appRequests.add(main.appointments.get(i));
            }
        }
        
        DefaultTableModel model = new DefaultTableModel();
        model = (DefaultTableModel) apptRequestTbl.getModel();
        model.setRowCount(0);
        model.setRowCount(appRequests.size());
        apptRequestTbl.setModel(model);
        for (int j =0; j<appRequests.size(); j++)
        {
            apptRequestTbl.setValueAt(appRequests.get(j).getAppointmentId(), j, 0);
            apptRequestTbl.setValueAt(appRequests.get(j).getPatient().getName(), j, 1);
            apptRequestTbl.setValueAt(appRequests.get(j).getDoctor().getName(), j, 2);
            apptRequestTbl.setValueAt(appRequests.get(j).getDate(), j, 3);
        }
        appointmentRequests = appRequests;
    }
    
    public void loadAccountRequests(){
        List<Patient> accountRequests = new ArrayList();
        for (int i = 0; i< main.patients.size(); i++)
        {
          
            if (main.patients.get(i).getActive().equals("false"))
            {
                
                 accountRequests.add(main.patients.get(i));
            }
            
        }
        DefaultTableModel model = new DefaultTableModel();
        model = (DefaultTableModel) accountReqTbl.getModel();
        model.setRowCount(0);
        model.setRowCount(accountRequests.size());
        accountReqTbl.setModel(model);
        for (int j =0; j<accountRequests.size(); j++)
        {
            accountReqTbl.setValueAt(accountRequests.get(j).getUserId(), j, 0);
            accountReqTbl.setValueAt(accountRequests.get(j).getName(), j, 1);
            accountReqTbl.setValueAt(accountRequests.get(j).getGender(), j, 2);
            accountReqTbl.setValueAt(accountRequests.get(j).getAge(), j, 3);
            accountReqTbl.setValueAt(accountRequests.get(j).getAddress(), j, 4);   
        }
        patientRequests = accountRequests;
    }
    
    public void loadMedicineOrders(){
        List<Medicine> orderMeds = new ArrayList();
        for (int i = 0; i< main.medicines.size(); i++)
        {
            if (main.medicines.get(i).isLowQuantity() == true)
            {
                orderMeds.add(main.medicines.get(i));
            }
        }
        DefaultTableModel model = new DefaultTableModel();
        model = (DefaultTableModel) medsTbl.getModel();
        model.setRowCount(0);
        model.setRowCount(orderMeds.size());
        medsTbl.setModel(model);
        for (int j =0; j<orderMeds.size(); j++)
        {
            medsTbl.setValueAt(orderMeds.get(j).getMedicineId(), j, 0);
            medsTbl.setValueAt(orderMeds.get(j).getName(), j, 1);
        }
        orderMedicine = orderMeds;
    }
    
    public void loadPatients(){       
        DefaultTableModel model = new DefaultTableModel();
        model = (DefaultTableModel) accountsTbl.getModel();
        model.setRowCount(0);
        model.setRowCount(main.patients.size());
        accountsTbl.setModel(model);
        for (int j =0; j<main.patients.size(); j++)
        {
            accountsTbl.setValueAt(main.patients.get(j).getUserId(), j, 0);
            accountsTbl.setValueAt(main.patients.get(j).getName(), j, 1);
            accountsTbl.setValueAt(main.patients.get(j).getAddress(), j, 2);

        }
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(secretaryDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(secretaryDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(secretaryDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(secretaryDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new secretaryDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton accountRemoveBtn;
    private javax.swing.JTable accountReqTbl;
    private javax.swing.JButton accountRequestBtn;
    private javax.swing.JTable accountsTbl;
    private javax.swing.JButton apptDenyBtn;
    private javax.swing.JButton apptRequestBtn;
    private javax.swing.JTable apptRequestTbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable medsTbl;
    private javax.swing.JButton orderMedsBtn;
    // End of variables declaration//GEN-END:variables
}
