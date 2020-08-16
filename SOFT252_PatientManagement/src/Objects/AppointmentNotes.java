/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;
import Users.*;
/**
 *
 * @author User
 */
public class AppointmentNotes {
    protected Patient patient;
    protected Doctor doctor;
    protected String notesId, notes, date;

    public AppointmentNotes(String notesId, Patient patient, Doctor doctor, String notes, String date) {
        this.notesId = notesId;
        this.patient = patient;
        this.doctor = doctor;
        this.notes = notes;
        this.date = date;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    
}
