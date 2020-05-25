package com.anand.opps.busreservation;

public class TicketBookingThread extends Thread {
	private TicketCounter ticketCounter;
	private String pname;
	private int noOfSeats;
	public TicketBookingThread(TicketCounter ticketCounter, String pname, int noOfSeats) {
		super();
		this.ticketCounter = ticketCounter;
		this.pname = pname;
		this.noOfSeats = noOfSeats;
	}
	public void run()
	{
		ticketCounter.bookingTicket(pname, noOfSeats);
	}
	
	

}
