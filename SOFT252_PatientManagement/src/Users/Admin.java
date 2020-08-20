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
public class Admin extends Person
{  
    //Constructor//
    public Admin(String userId, String name, String address, String password)
    {
    this.userId = userId;
    this.name = name;
    this.address = address;
    this.password = password;
    }
  
    //Inherits Getters and Setters from Person class//
}
