package de.telekom.sea.javaChallenge.part2;

public class Datatype implements Comparable<Datatype> {
	private String datatype;
	private int length;

	public Datatype() {

	}
	
	public Datatype(String datatype, int length) {
		this.datatype = datatype;
		this.length = length;
	}

	public String getDatatype() {
		return datatype;
	}

	public void setDatatype(String datatype) {
		this.datatype = datatype;
	}

	public Integer getLenght() {
		return length;
	}

	public void setLenght(Integer length) {
		this.length = length;
	}
	
	public int compareTo(Datatype dt) {
		if (getLenght() == 0 || dt.getLenght() == 0) {
			return 0;
		}
		return getLenght().compareTo(dt.getLenght());
	}
}
