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
public class Doctor 
{
    String userId = "";
    String name = "";
    String address = "";
    String password = "";
    
    public Doctor(String userId, String name, String address, String password)
    {
    this.userId = userId;
    this.name = name;
    this.address = address;
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
    
    public String getPassword(){
        return password;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    
}
