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
    protected String userId, name, feedback;
    protected int rating;

    public Feedback(Patient patient, Doctor doctor, String name, String feedback, int rating) {
        this.patient = patient;
        this.doctor = doctor;
        this.feedback = feedback;
        this.rating = rating;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
