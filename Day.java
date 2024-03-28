/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */

import java.util.ArrayList;
public class Day {
    public ArrayList<Client> slots;
    public String name;
    
    public Day(String m){
        this.name = m;
        this.slots = new ArrayList<Client>(4);
        
    }
    
    public void add(Client client, Integer x){
       
        int s = this.slots.size();
        slots.add(x - 1,client);
        if (x > 4){
            System.out.println("Error, there are only four slots available.");
        }
    }
    
    public void place(Client client){
        if (client == this.slots.get(0)){
            System.out.println(client.name + " has the first slot.");
        }   
        else if (client == this.slots.get(1)){
            System.out.println(client.name + " has the second slot.");
        }
        else if (client == this.slots.get(2)){
            System.out.println(client.name + " has the third slot.");
        }
        else if (client == this.slots.get(3)){
            System.out.println(client.name + " has the fourth slot");
        }
        else{
            System.out.println("This slot does not exist.");
        }
    }
    
    
        
        
    
    
    public void remove(Client client){
        if (client == this.slots.get(0)){
            slots.remove(0);
            System.out.println(client.name + " has been removed from the first slot.");
        }
        else if (client == this.slots.get(1)){
            slots.remove(1);
            System.out.println(client.name + " has been removed from the second slot.");
        }
        else if (client == this.slots.get(2)){
            slots.remove(2);
            System.out.println(client.name + " has been removed from the third slot.");
        }
        else{
            slots.remove(3);
            System.out.println(client.name + " has been removed from the fourth slot.");
        }
    }
    
    
}
