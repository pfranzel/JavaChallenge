package de.telekom.sea.javaChallenge.queue5g;

public interface Queue<T> {
	public void add(T t);
	public T head();
	public T remove();
	public void reset();
	public boolean empty();
	public int search(T t);
}
