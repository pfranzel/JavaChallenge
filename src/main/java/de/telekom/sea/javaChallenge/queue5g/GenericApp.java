package de.telekom.sea.javaChallenge.queue5g;

import de.telekom.sea.javaChallenge.part5.BaseObject;
import de.telekom.sea.javaChallenge.part5.Person;
import de.telekom.sea.javaChallenge.part5.PersonImpl;

public class GenericApp extends BaseObject {

	private static GenericApp theInstance;

	// Constructor has Referenzvariable
	public static GenericApp getRootApp() {
		if (theInstance == null) {
			theInstance = new GenericApp();
		}
		return theInstance;
	}

	public void run(String[] args) {

		try {
			//Process general behavior
			Generic<Person> t = new Generic<Person>();

			PersonImpl person_1 = new PersonImpl("Peter", "Pan");
			PersonImpl person_2 = new PersonImpl("Jan", "Wehr");
			PersonImpl person_3 = new PersonImpl("Luis", "Rowe");
			PersonImpl person_4 = new PersonImpl("Jenny", "Ups");
			PersonImpl person_5 = new PersonImpl("Maik", "Gahn");
			PersonImpl person_6 = new PersonImpl("Jup", "Ganz");
			PersonImpl person_7 = new PersonImpl("Donald", "Duck");
			PersonImpl person_8 = new PersonImpl("Ronny", "Feller");
			PersonImpl person_9 = new PersonImpl("Carola", "Schubs");
			
			System.out.println("Is PersonenSchlange empty? \t\t\t--> " + t.empty());

			t.add(person_1);

			System.out.println("Is PersonenSchlange empty? \t\t\t--> " + t.empty());

			t.add(person_2);
			t.add(person_3);
			t.add(person_4);
			t.add(person_5);
			t.add(person_6);
			t.add(person_7);
			t.add(person_8);
//			t.add(person_9);

			System.out.println("Get first element of the linkedlist \t\t--> " + t.head().getFirstname() + " "
					+ t.head().getLastname());

			Person personRemovedGet = t.remove();
			System.out.println("First Element of the LinkedList removed \t--> " + personRemovedGet.getFirstname() + " "
					+ personRemovedGet.getLastname());

//			personen.reset();

			System.out.println("Get first element of the linkedlist \t\t--> " + t.head().getFirstname() + " "
					+ t.head().getLastname());			
			System.out.println("Searched person is at following position: \t--> "+ t.search(person_4));

			
		} catch (Exception e) {
			System.out.println("Info - Exception: " + e.getLocalizedMessage());
			e.printStackTrace();
		} finally {
			System.out.println();
			System.out.println("Info - finally: .... Programm ended ");
		}
	}
}
