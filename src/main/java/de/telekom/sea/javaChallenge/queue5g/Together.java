package de.telekom.sea.javaChallenge.queue5g;

public class Together<T, U> implements Zwei<T, U>{

	private T t;
	private U u;

	public Together() {
	}

	public Together(T t, U u) {
		this.t = t;
		this.u = u;
	}

	public void set(T t, U u) {
		this.t = t;
		this.u = u;
	}
	
	private boolean tIsEmpty() {
		return (t == null);
	}

	private boolean uIsEmpty() {
		return (u == null);
	}
	
	@Override
	public boolean join(T t, U u) {
		if (tIsEmpty() && uIsEmpty()) {
			this.t = t;
			this.u = u;
			return true;
		}
		return false;
	}

	@Override
	public boolean split(T t, U u) {
		
		
		return false;
	}
	
	
}
