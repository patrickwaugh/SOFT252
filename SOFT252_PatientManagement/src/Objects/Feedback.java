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
public class Feedback {
    protected Patient patient;
    protected Doctor doctor;
    protected String feedbackId, feedback;
    protected int rating;

    //Constructors//
    public Feedback(String feedbackId, Patient patient, Doctor doctor, String feedback, int rating) {
        this.feedbackId = feedbackId;
        this.patient = patient;
        this.doctor = doctor;
        this.feedback = feedback;
        this.rating = rating;
    }

    //Getters and Setters//
    public String getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(String feedbackId) {
        this.feedbackId = feedbackId;
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
    
    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
    
}
