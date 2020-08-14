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
public class Patient 
{
    public static String userId = "";
    public String name = "";
    public String address = "";
    public String gender = "";
    public String age = "";
    public String password = "";
    
    
    
    public Patient(String userId, String name, String address, String gender, String age, String password)
    {
    this.userId = userId;
    this.name = name;
    this.address = address;
    this.gender = gender;
    this.age = age;
    this.password = password;
    }
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    
    
}
