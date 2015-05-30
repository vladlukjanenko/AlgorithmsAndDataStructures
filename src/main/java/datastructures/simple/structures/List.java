package datastructures.simple.structures;

/**
 * Interface {@code List} provides general operations for all types of lists.
 * 
 * @author Vlad Lukjanenko
 * */
public interface List<E> {
	
	public void insertHead(E element);
	public void insertTail(E element);
	public int search(E value);
	public void delete(E element);
	
}