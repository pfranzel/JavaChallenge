package de.telekom.sea.javaChallenge.part5;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class PersonenSchlangeClass extends BaseObject implements PersonenSchlange {

	private int maxParticipants = 8;
	private LinkedList<Person> personen = new LinkedList<Person>();

	@Override
	public void add(Person person) {
		try {
			if (personen.size() == maxParticipants) {
				throw new RuntimeException("List is full!");
			} else {
				personen.add(person);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public Person head() {
		try {
			return personen.getFirst();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Person remove() {
		try {
			if (!empty()) {
				return personen.removeFirst();
			} else {
				throw new RuntimeException("List is empty - cannot remove an item.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// Kommentar:
	// Ich bin mir zugegebenermaßen nicht sicher, worauf Thorsten hinaus möchte.
	// Als "Randverhalten" liefert die Methode in diesem Fall eine Exception + null. 
	// Wie die genaue Behandlung des ganzen dann aussieht steht auf einem anderen 
	// Blatt - in diesem Fall sollte es aber erst einmal reichen.
	
	
	@Override
	public void reset() {
		try {
			personen.clear();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean empty() {
		try {
			return personen.isEmpty();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public int search(Person person) {
		try {
			return personen.indexOf(person);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;	}

}
