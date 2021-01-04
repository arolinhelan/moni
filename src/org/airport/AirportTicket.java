package org.airport;

public class AirportTicket {
public void paxInfo() {
	String paxrName = "abcd ";
	String paxFlight = " Indigo.6e543";
	long paxMob = 8903725127l;
	byte paxAge = 35;
	short paxSeat = 873;
	float paxBaggageWeight = 56.98873647643f;
	int paxLuggage=  15;
	char paxGender = 'f';
	
	System.out.println(" Passenger Name:" + paxrName);
	System.out.println(" Passenger Flight:" + paxFlight);
	System.out.println(" Passenger Mobile:" + paxMob);
	System.out.println(" Passenger Age:" + paxAge);
	System.out.println(" Passenger Seat:" + paxSeat);
	System.out.println(" Passenger Baggage Weight:" + paxBaggageWeight);
	System.out.println(" Passenger Luggage:" + paxLuggage);
	System.out.println(" Passenger Gender:" + paxGender);
	
	}
public static void main(String[] args) {
	AirportTicket comp = new AirportTicket();
	comp.paxInfo();
}}
