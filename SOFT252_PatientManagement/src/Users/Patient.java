/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;

/**
 *
 * @author patrick
 */
public class Patient extends Person
{    
    public Patient(String userId, String name, String address, String gender, int age, String password)
    {
    this.userId = userId;
    this.name = name;
    this.address = address;
    this.gender = gender;
    this.age = age;
    this.password = password;
    }

    
    
    
}
