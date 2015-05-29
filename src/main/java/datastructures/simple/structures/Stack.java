package datastructures.simple.structures;

/**
 * Class {@code Stack} represents dynamic set where the first element to be
 * deleted is the element that was added to set last. (First In Last Out).
 * 
 * @author Vlad Lukjanenko
 * */
public class Stack<E> {

	/**
	 * The array where all elements are stored.
	 * */
	private Object[] stack = null;
	
	/**
	 * Index of the top element in stack.
	 * */
	private int top = 0;
	
	/**
	 * Size of stack.
	 * */
	public final int CAPACITY;
	
	/**
	 * Initialize empty stack.
	 * 
	 * @param size	size of stack.
	 * */
	public Stack (int size) {
		
		stack = new Object[size];
		CAPACITY = size;
		
	}
	
	/**
	 * Add element to stack.
	 * 
	 * @param element	element to be added to stack.
	 * */
	public void push(E element) {
		
		if (top == CAPACITY) {
			System.out.println("Stack is full.");
		} else {
			stack[top++] = element;
		}
		
	}
	
	/**
	 * Get element from stack.
	 * 
	 * @return top element.
	 * */
	@SuppressWarnings("unchecked")
	public E pop() {
		
		if (top == 0) {
			
			System.out.println("Stack is empty.");
			return null;
			
		} else {
			return (E) stack[--top];
		}
		
	}
	
	/**
	 * return size of stack.
	 * 
	 * @return stack size.
	 * */
	public int size() {
		return top;
	}
	
}