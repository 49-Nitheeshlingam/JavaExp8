/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ticketcounter;

/**
 *
 * @author 22cseb49
 */
public class Ticketcounter {
    private int availableseats = 13;
    public synchronized void bookTickets(String pname,int Numberofseats)
    {
        if((availableseats>=Numberofseats)  && (Numberofseats>0)){
            System.out.println("--------------------------");
            System.out.println("passanger Name :"+pname);
            System.out.println("NumberofseatsBooked :"+Numberofseats);
            System.out.println("Your seats booked successfully");
            System.out.println("--------------------------");
            availableseats = availableseats-Numberofseats;
        }
        else{
            System.out.println("--------------------------");
            System.out.println("Hi"+pname+"Seats not available");
            System.out.println("Available Seats :"+availableseats);
            System.out.println("--------------------------");

        }
    }
}
