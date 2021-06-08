package de.telekom.sea.javaChallenge.part5;

import java.util.LinkedList;

import de.telekom.sea.javaChallenge.queue5g.Queue;

public class PersonenSchlangeClass extends BaseObject implements PersonenSchlange {

	private int maxParticipants = 8;
	private LinkedList<Person> personen = new LinkedList<Person>();

	/**
	 * Add an object of typ person to the Linked List. If the list is full it will
	 * be noticed by a RuntimeExection
	 * 
	 * @param person Object to be be added to the FIFO-List
	 * @return No return value is provided.
	 */
	@Override
	public void add(Person person) {
		try {
			if (personen.size() != maxParticipants) {
				personen.add(person);
			} else {
				throw new IndexOutOfBoundsException("List is full!");
			}
		} catch (IndexOutOfBoundsException e) {
			throw new IndexOutOfBoundsException();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Head returns the first Element of the List. If the list is empty it will be
	 * noticed by a RuntimeExection
	 * 
	 * @param none
	 * @return Object Person / null in case of empty list
	 */
	@Override
	public Person head() {
		try {
			if (!empty()) {
				return personen.getFirst();
			} else {
				throw new IndexOutOfBoundsException("List is empty, no Object returned!");
			}
		} catch (IndexOutOfBoundsException e) {
			throw new IndexOutOfBoundsException();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Removes the first Person Object from the list and return exact this element
	 * 
	 * @param none
	 * @return Object Person / null in case of empty list
	 */
	@Override
	public Person remove() {
		try {
			if (!empty()) {
				return personen.removeFirst();
			} else {
				throw new IndexOutOfBoundsException("List is empty - cannot remove an item.");
			}
		} catch (IndexOutOfBoundsException e) {
			throw new IndexOutOfBoundsException();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// Kommentar:
	// Ich bin mir zugegebenermaßen nicht sicher, worauf Thorsten hinaus möchte.
	// Als "Randverhalten" liefert die Methode in diesem Fall eine Exception + null.
	// Hierdurch ist es zumindest grundsätlich gegeben, eine fehlerhafte Ausführung
	// abzufangen.
	// Wie die genaue Behandlung des ganzen dann aussieht steht auf einem anderen
	// Blatt - in diesem Fall sollte es aber erst einmal reichen.

	/**
	 * Removes all Objects from the list
	 * 
	 * @param none
	 * @return none
	 */
	@Override
	public void reset() {
		try {
			personen.clear();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Checks if list is empty.
	 * 
	 * @param none
	 * @return true id list is empty / false if list is not empty
	 */
	@Override
	public boolean empty() {
		try {
			return personen.isEmpty();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * Searches for the given Object Person in the list. Throws an exception if list
	 * is empty
	 * 
	 * @param Object Person
	 * @return int-value of the current position in the list. "0" if list is empty
	 *         and "-1" if searched person Object does not exist
	 */
	@Override
	public int search(Person person) {
		try {
			if (!empty()) {
				int i = personen.indexOf(person);
				if (i == -1) {
					throw new RuntimeException("No such element/object in the list");
				} else {
					return i + 1;
				}
			} else {
				throw new IndexOutOfBoundsException("List is empty - cannot search for the item.");
			}
		} catch (IndexOutOfBoundsException e) {
			throw new IndexOutOfBoundsException();
		} catch (RuntimeException e) {
			throw new RuntimeException();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

}
