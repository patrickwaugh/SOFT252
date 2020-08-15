/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import Users.Doctor;
import Users.Patient;
/**
 *
 * @author patrick
 */
public class Prescription
{
    protected Patient patient;
    protected Doctor doctor;
    protected String prescriptionId, dosage;
    protected Medicine medicine;
    protected int quantity;
    

    public Prescription(String prescriptionId, Doctor doctor, Patient patient, Medicine medicine, int quantity, String dosage) {
        this.prescriptionId = prescriptionId;
        this.doctor = doctor;
        this.patient = patient;
        this.dosage = dosage;
        this.quantity = quantity;
        this.medicine = medicine;
    }

    public String getPrescriptionId() {
        return prescriptionId;
    }

    public void setPrescriptionId(String prescriptionId) {
        this.prescriptionId = prescriptionId;
    }
    
    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    
    public Medicine getMedicine() {
        return medicine;
    }

    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }
    
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

}
