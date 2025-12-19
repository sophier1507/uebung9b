package h2;
import java.util.ArrayList;

public class Bus {
	public ArrayList<Passenger> passengers;
	
	public Bus() {
		passengers = new ArrayList<Passenger>();
	}
	
	public void enterBus(Passenger p) {
		passengers.add(p);
	}
	
	private void exitBus() {
		ArrayList<Passenger> toRemove = new ArrayList<Passenger>();
		
		for (Passenger p : passengers) {
			if (p.planned == p.visited) {
				toRemove.add(p);
			}
		}
		for (Passenger p : toRemove) {
			passengers.remove(p);
		}
	}
	
	public void nextStop(Passenger[] boarding) {
		for (Passenger p : passengers) {
			p.visited++;
			}
		exitBus();
		for (Passenger p : boarding) {
			passengers.add(p);
		}
	}
	
	public void nextStop() {
		for (Passenger p : passengers) {
			p.visited++;
			}
		exitBus();
	}
	
	public ArrayList<Passenger> findPassengersWithoutTickets() {
		ArrayList<Passenger> withoutTicket = new ArrayList<Passenger>();
		for (Passenger p : passengers) {
			if (!p.ticket) {
				withoutTicket.add(p);
			}
		}
		for (Passenger p : withoutTicket) {
			passengers.remove(p);
		}
		return withoutTicket;
	}
	
	public void transferPassengers(Bus otherBus, String[] passengerNames) {
		 for (int i = 0; i < passengerNames.length; i++){
			 for (Passenger p : passengers) {
				if (passengerNames[i] == p.name) {
					otherBus.passengers.add(p);
					passengers.remove(p);
					break;
				}
			}
		}
	}
}
