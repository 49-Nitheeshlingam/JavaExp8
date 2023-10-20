/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busreservationsystem;

import Ticketcounter.Ticketbookthread;
import Ticketcounter.Ticketcounter;

/**
 *
 * @author 22cseb49
 */
public class BusReservationSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ticketcounter ticketcounter = new Ticketcounter();
        Ticketbookthread t1 = new Ticketbookthread (ticketcounter,"Nitheesh",2);
        Ticketbookthread t2 = new Ticketbookthread (ticketcounter,"siva",3);
        Ticketbookthread t3 = new Ticketbookthread (ticketcounter,"Vishwa",5);
        Ticketbookthread t4 = new Ticketbookthread (ticketcounter,"Udhaya",4);


        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
    
}
