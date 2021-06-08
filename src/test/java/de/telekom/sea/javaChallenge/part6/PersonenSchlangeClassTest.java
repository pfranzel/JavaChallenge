package de.telekom.sea.javaChallenge.part6;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.*;

import de.telekom.sea.javaChallenge.part5.PersonImpl;
import de.telekom.sea.javaChallenge.part5.PersonenSchlangeImpl;

public class PersonenSchlangeClassTest {

	private PersonenSchlangeImpl cut;

	@BeforeEach
	void setup() {
		cut = new PersonenSchlangeImpl();
	}

	@Test
	void add_test() {

		// Arrange
		PersonImpl person_1 = new PersonImpl("Peter", "Pan");
		PersonImpl person_2 = new PersonImpl("Jan", "Wehr");
		PersonImpl person_3 = new PersonImpl("Luis", "Rowe");
		PersonImpl person_4 = new PersonImpl("Jenny", "Ups");
		PersonImpl person_5 = new PersonImpl("Maik", "Gahn");
		PersonImpl person_6 = new PersonImpl("Jup", "Ganz");
		PersonImpl person_7 = new PersonImpl("Donald", "Duck");
		PersonImpl person_8 = new PersonImpl("Ronny", "Feller");
		PersonImpl person_9 = new PersonImpl("Carola", "Schubs");

		// Act / fill list with max elements
		cut.add(person_1);
		cut.add(person_2);
		cut.add(person_3);
		cut.add(person_4);
		cut.add(person_5);
		cut.add(person_6);
		cut.add(person_7);
		cut.add(person_8);

		// Assert / read first element with head and check result
		assertEquals("Peter", cut.head().getFirstname());
		assertSame("Peter", cut.head().getFirstname());
		// Assert / check if exception is thrown on an full list
		assertThrows(IndexOutOfBoundsException.class, () -> {
			cut.add(person_9);
		});
	}

	@Test
	void head_test() {
		// Exception if list has no entries?
		assertThrows(IndexOutOfBoundsException.class, () -> {
			cut.head();
		});

		// Test if it is possible to call the right person in the list
		PersonImpl person_1 = new PersonImpl("Peter", "Pan");
		PersonImpl person_2 = new PersonImpl("Jan", "Wehr");
		PersonImpl person_3 = new PersonImpl("Luis", "Rowe");
		cut.add(person_1);
		cut.add(person_2);
		cut.add(person_3);
		assertEquals(person_1, cut.head());
		assertSame(person_1, cut.head());
	}

	@Test
	void remove_test() {
		// Exception if list has no entries?
		assertThrows(IndexOutOfBoundsException.class, () -> {
			cut.remove();
		});
		PersonImpl person_1 = new PersonImpl("Peter", "Pan");
		PersonImpl person_2 = new PersonImpl("Jan", "Wehr");
		PersonImpl person_3 = new PersonImpl("Luis", "Rowe");
		cut.add(person_1);
		cut.add(person_2);
		cut.add(person_3);
		// Test if it is possible to remove first object from the list and if the right
		// one is given back
		assertEquals(person_1, cut.remove());
	}

	@Test
	void reset_test() {
		PersonImpl person_1 = new PersonImpl("Peter", "Pan");
		PersonImpl person_2 = new PersonImpl("Jan", "Wehr");
		PersonImpl person_3 = new PersonImpl("Luis", "Rowe");
		cut.add(person_1);
		cut.add(person_2);
		cut.add(person_3);
		cut.reset();
		// Exception if list has no entries?
		assertThrows(IndexOutOfBoundsException.class, () -> {
			cut.head();
		});
		assertEquals(true, cut.empty());

	}

	@Test
	void empty_test() {
		assertEquals(true, cut.empty());
		PersonImpl person_1 = new PersonImpl("Peter", "Pan");
		PersonImpl person_2 = new PersonImpl("Jan", "Wehr");
		PersonImpl person_3 = new PersonImpl("Luis", "Rowe");
		cut.add(person_1);
		cut.add(person_2);
		cut.add(person_3);
		assertEquals(false, cut.empty());
	}

	@Test
	void search_test() {
		PersonImpl person_1 = new PersonImpl("Peter", "Pan");
		PersonImpl person_2 = new PersonImpl("Jan", "Wehr");
		PersonImpl person_3 = new PersonImpl("Luis", "Rowe");
		// List empty?
		assertThrows(IndexOutOfBoundsException.class, () -> { cut.search(person_1);
		});
		cut.add(person_1);
		cut.add(person_2);
		cut.add(person_3);
		// Did the search work correctly
		assertEquals(2, cut.search(person_2));
		assertEquals(3, cut.search(person_3));
		cut.remove();
		assertThrows(RuntimeException.class, () -> { cut.search(person_1);
		});
	}

	@AfterEach
	void teardown() {
		cut = null;
	}
}