package de.telekom.sea.javaChallenge.queue5g;

import java.util.LinkedList;
import de.telekom.sea.javaChallenge.part5.BaseObject;

public class GenericImpl<T> extends BaseObject implements Queue<T> {

	private final int maxParticipants = 8;
	private LinkedList<T> t = new LinkedList<T>();

	/**
	 * Add an generic object to the Linked List. If the list is full it will
	 * be noticed by a RuntimeExection
	 * 
	 * @param generic object to be be added to the FIFO-List
	 * @return No return value is provided.
	 */
	@Override
	public void add(T t) {
		try {
			if (this.t.size() != maxParticipants) {
				this.t.add(t);
			} else {
				throw new IndexOutOfBoundsException("List is full!");
			}
		} catch (

		IndexOutOfBoundsException e) {
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
	public T head() {
		try {
			if (!empty()) {
				return this.t.getFirst();
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
	 * Removes the first generic Object from the list and return exact this element
	 * 
	 * @param none
	 * @return Object Person / null in case of empty list
	 */
	@Override
	public T remove() {
		try {
			if (!empty()) {
				return t.removeFirst();
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

	/**
	 * Removes all Objects from the list
	 * 
	 * @param none
	 * @return none
	 */
	@Override
	public void reset() {
		try {
			t.clear();
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
			return t.isEmpty();
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
	public int search(T t) {
		try {
			if (!empty()) {
				int i = this.t.indexOf(t);
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
