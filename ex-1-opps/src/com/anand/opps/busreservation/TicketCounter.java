package com.anand.opps.busreservation;

public class TicketCounter {
	private int availableTicket=3;
	public synchronized void bookingTicket(String name,int tickets)
	{
		if((availableTicket>=tickets) && (tickets>0))
		{
			System.out.println("Hi,"+ name+" "+tickets+" "+"tickets booked is successfully");
			availableTicket=availableTicket-tickets;
		}
		else
		
			System.out.println("Hi,"+ name+" "+ "ticket is not available");
		
	}

}
