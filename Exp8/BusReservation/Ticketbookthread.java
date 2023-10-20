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
public class Ticketbookthread extends Thread{
    private Ticketcounter ticketcounter;
    private String pname;
    private int Numberofseats;
    
    public Ticketbookthread(Ticketcounter ticketcounter,String pname,int Numberofseats){
        this.ticketcounter = ticketcounter;
        this.pname = pname;
        this.Numberofseats = Numberofseats;
    }
    
    @Override
    public void run(){
        ticketcounter.bookTickets(pname, Numberofseats);
    }
}
