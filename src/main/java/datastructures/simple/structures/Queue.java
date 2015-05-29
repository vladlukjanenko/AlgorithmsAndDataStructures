package datastructures.simple.structures;

/**
 * Class {@code Queue} represents dynamic set where the first element to be
 * deleted is the element that was added to set first. (First In First Out).
 * 
 * @author Vlad Lukjanenko
 * */
public class Queue<E> {

	/**
	 * The array where all elements are stored.
	 * */
	private Object[] queue = null;
	
	/**
	 * Index in the queue where new element must be added.
	 * */
	private int tail = 0;
	
	/**
	 * Index in the queue where element must be removed.
	 * */
	private int head = 0;
	
	/**
	 * Quantity of elements in the queue.
	 * */
	private int quantity = 0;
	
	/**
	 * Size of stack.
	 * */
	public final int CAPACITY;
	
	/**
	 * Initialize empty stack.
	 * 
	 * @param size	size of stack.
	 * */
	public Queue (int size) {
		
		queue = new Object[size];
		CAPACITY = size;
		
	}
	
	/**
	 * Add element to queue.
	 * 
	 * @param element	element to be added to queue.
	 * */
	public void enqueue(E element) {
		
		if (quantity == CAPACITY) {
			System.out.println("Queue is full.");
		} else {
			
			queue[tail++] = element;
			quantity++;
			
			if (tail == CAPACITY) {
				tail = 0;
			}
			
		}
		
	}
	
	/**
	 * Get element from queue.
	 * 
	 * @return queue element.
	 * */
	@SuppressWarnings("unchecked")
	public E dequeue() {
		
		if (quantity == 0) {
			System.out.println("Queue is empty.");
			return null;
		} else {
			
			if (head == CAPACITY) {
				head = 0;
			}
			
			quantity--;
			
			return (E) queue[head++];
		}
		
	}
	
	/**
	 * Return size of queue.
	 * 
	 * @return queue size.
	 * */
	public int size() {
		return quantity;
	}
	
}
