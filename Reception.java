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
public class Reception {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Day mon = new Day("Monday");
        Client jack = new Client("Jack", "Massage");
        mon.add(jack,2);
        Client rebecca = new Client("Rebecca", "Fillet");
        mon.add(rebecca,3);
        mon.place(jack);
        mon.place(rebecca);
        System.out.println(rebecca);
        Client rick = new Client("Rick", "Homicide");
        mon.add(rick,1);
        mon.place(rick); 
        Client dick = new Client("Dick", "He's an ass");
        mon.add(dick,5);
        mon.place(dick);
    }
    
}
