package de.telekom.sea.javaChallenge.part5;

public class PersonImpl implements Person {

	private String firstname;
	private String lastname;
	
	public PersonImpl() {
		
	}
	
	public PersonImpl(String firstname, String lastname) {
		this.firstname = firstname;
		this.lastname = lastname;		
	}
	
	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}
}
