/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Client {
    public String name;
    public String service;
    
    public Client(String name, String service){
        this.name = name;
        this.service = service;
    }
    
    public String toString(){
        return this.name + " has been scheduled for a " + this.service;
    }
    
}
