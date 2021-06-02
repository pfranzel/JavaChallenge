package de.telekom.sea.javaChallenge;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class CodeSnippletPart2 implements ListOfDataTypes {

	private Datatype[] listOfPrimDatatypes = new Datatype[8];
	private int i = 0;

	public Datatype get(int i) {
		if (i < listOfPrimDatatypes.length && !listOfPrimDatatypes.toString().isBlank()) {
			return listOfPrimDatatypes[i];
		} else {
			throw new IllegalArgumentException("Error: Wrong input - please repeat");
		}
	}

	private List<Datatype> getAll() {
		List<Datatype> list = new ArrayList<Datatype>();

		for (int i = 0; i < listOfPrimDatatypes.length; i++) {
			list.add(listOfPrimDatatypes[i]);
		}
		return list;
	}
	
	public int getDatatypeSize(int i) {
		return listOfPrimDatatypes[i].getLenght();
	}

	public boolean add(Datatype dt) {
		listOfPrimDatatypes[i] = dt;
		i++;
		return true;
	}

	private void datatypes() {
		inputDatatypes("int", (int) 32);
		inputDatatypes("double", (int) 64);
		inputDatatypes("long", (int) 64);
		inputDatatypes("float", (int) 32);
		inputDatatypes("short", (int) 16);
		inputDatatypes("byte", (int) 8);
		inputDatatypes("char", (int) 16);
		inputDatatypes("boolean", (int) 1);
	}

	private void inputDatatypes(String datatype, int bit) {

		Datatype dt = new Datatype(datatype, bit);
		add(dt);
	}

	public void snippletPart2() {

		datatypes();
		getDatatypeSize(0);
		List<Datatype> mylist = getAll();
		Collections.sort(mylist);
		for (int i = 0; i < 8; i++) {
			System.out.println("Datatype: \t" + mylist.get(i).getDatatype() + "\t -->  Bit(s): "
					+ mylist.get(i).getLenght() + "  \t -->  Byte(s): " + mylist.get(i).getLenght() / 8);

			// Yes, type boolean represent one bit and maybe uses one byte
			// But at all there seem no way how to determine size in memory... -->
			// https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
			// "boolean: The boolean data type has only two possible values: true and false.
			// Use this data type for simple flags that track true/false conditions. This
			// data type represents one bit of information, but its "size" isn't something
			// that's precisely defined."

		}
	}
}
