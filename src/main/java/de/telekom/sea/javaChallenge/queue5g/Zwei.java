package de.telekom.sea.javaChallenge.queue5g;

public interface Zwei<T, U> {

	boolean join(T t, U u);
	boolean split(T t, U u);
	

}
