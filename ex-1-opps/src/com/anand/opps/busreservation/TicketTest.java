package com.anand.opps.busreservation;

public class TicketTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TicketCounter counter=new TicketCounter();
		TicketBookingThread t1=new TicketBookingThread(counter,"anand",2);
		TicketBookingThread t2=new TicketBookingThread(counter,"saurav",2);
		t1.start();
		t2.start();
		

	}

}
