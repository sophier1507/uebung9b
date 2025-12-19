package h1;

import java.util.ArrayList;

public class PrioListe {
	public ArrayList<Patient> myList = new ArrayList<Patient>();
	
	public void addPatient(Patient p) {
		if (myList.isEmpty()) {
			myList.add(p);
		} else if (myList.get(myList.size() - 1).prio < p.prio) {
			myList.add(p);
		} else {
			for (int i = 0; i < myList.size(); i++) {
				if (myList.get(i).prio > p.prio) {
					myList.add(i, p);
					break;
				}
			}
		}
	}
	
	public Patient getNextPatient() {
		return myList.remove(0);
	}
	
	public int getPosition(Patient p) {
		return myList.indexOf(p);
	}
}
