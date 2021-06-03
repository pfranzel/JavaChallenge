package de.telekom.sea.javaChallenge.part5;

public class PersonenApp extends BaseObject {

	private static PersonenApp theInstance;

	// Constructor has Referenzvariable
	public static PersonenApp getRootApp() {
		if (theInstance == null) {
			theInstance = new PersonenApp();
		}
		return theInstance;
	}

	public void run(String[] args) {

		try {
			//Process general behavior
			PersonenSchlangeClass personen = new PersonenSchlangeClass();

			PersonImpl person_1 = new PersonImpl("Peter", "Pan");
			PersonImpl person_2 = new PersonImpl("Jan", "Wehr");
			PersonImpl person_3 = new PersonImpl("Luis", "Rowe");
			PersonImpl person_4 = new PersonImpl("Jenny", "Ups");
			PersonImpl person_5 = new PersonImpl("Maik", "Gahn");
			PersonImpl person_6 = new PersonImpl("Jup", "Ganz");
			PersonImpl person_7 = new PersonImpl("Donald", "Duck");
			PersonImpl person_8 = new PersonImpl("Ronny", "Feller");
			PersonImpl person_9 = new PersonImpl("Carola", "Schubs");

			System.out.println("Is PersonenSchlange empty? \t\t\t--> " + personen.empty());

			personen.add(person_1);

			System.out.println("Is PersonenSchlange empty? \t\t\t--> " + personen.empty());

			personen.add(person_2);
			personen.add(person_3);
			personen.add(person_4);
			personen.add(person_5);
			personen.add(person_6);
			personen.add(person_7);
			personen.add(person_8);
//			personen.add(person_9);

			System.out.println("Get first element of the linkedlist \t\t--> " + personen.head().getFirstname() + " "
					+ personen.head().getLastname());

			Person personRemovedGet = personen.remove();
			System.out.println("First Element of the LinkedList removed \t--> " + personRemovedGet.getFirstname() + " "
					+ personRemovedGet.getLastname());

//			personen.reset();

			System.out.println("Get first element of the linkedlist \t\t--> " + personen.head().getFirstname() + " "
					+ personen.head().getLastname());			
			System.out.println("Searched person is at following position: \t--> "+ personen.search(person_4));

			
		} catch (Exception e) {
			System.out.println("Info - Exception: " + e.getLocalizedMessage());
			e.printStackTrace();
		} finally {
			System.out.println();
			System.out.println("Info - finally: .... Programm ended ");
		}
	}
}
