package de.telekom.sea.javaChallenge.part5;

public class BaseObject extends Object {

	// Explicite Parent/Child relationship

	private Object parent;

	public Object getParent() {
		return parent;
	}

	public void setParent(Object parent) {
		this.parent = parent;
	}

	// Generate unique ID per Instance

	private long id;
	private static long idCounter = 1; // Variable hängt durch Static an der Klasse...

	public BaseObject() {
		this.id = idCounter++;
	}

	public long getId() {
		return id;
	}

	public long setId(long id) {
		this.id = id;
		return id;
	}

	@Override
	public boolean equals(final Object obj) {
		if (obj == this) { // Check identity / is this object himself / same instance
			return true;
		}
		if (obj == null) { // is Object null
			return false;
		}
		if (!(obj instanceof BaseObject)) { // is it the same type?
			return false;
		}
		BaseObject baseobject = (BaseObject) obj; // cast on the type BaseObject
		return (baseobject.id == this.id); // Compare content of object
	}
}
